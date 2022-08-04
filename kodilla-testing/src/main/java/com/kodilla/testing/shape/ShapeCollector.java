package com.kodilla.testing.shape;


import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> shapes = new ArrayList<>();

    public Boolean addFigure(Shape shape){
        boolean result = false;
        if (shape != null) {
            shapes.add(shape);
            result = true;
        }
        return result;
    }

    public Boolean removeFigure(Shape shape){
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            return true;
        }
        return false;
    }

    public Shape getFigure(int number){
        if (number >=0 && number < shapes.size()){
            return shapes.get(number);
        }
        return null;
    }

    public String showFigures(){
        StringBuilder names = new StringBuilder(shapes.size());
        for (Shape shape : shapes) {
            names.append(shape.getShapeName());
        }
        return names.toString();
    }

}
