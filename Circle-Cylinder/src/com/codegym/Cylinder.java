package com.codegym;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getPerimeter() * this.height + 2 * super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter() * this.height + 2 * super.getPerimeter();
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "A cylinder with height = " + this.height + ", which is a subclass of " + super.toString();
    }
}
