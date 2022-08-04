package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private static final String name = "Triangle";
    private double sideLengt;
    private double height;

    public Triangle(double sideLengt, double height) {
        this.sideLengt = sideLengt;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return sideLengt * height / 2;
    }
}
