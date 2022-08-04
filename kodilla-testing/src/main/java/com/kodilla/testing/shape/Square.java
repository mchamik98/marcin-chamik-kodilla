package com.kodilla.testing.shape;

public class Square implements Shape{
    private static final String name = "Square";
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return length * length;
    }
}
