package com.kodilla.testing.shape;

public class Circle implements Shape{
    private static final String name = "Circle";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return radius * radius * Math.PI;
    }
}
