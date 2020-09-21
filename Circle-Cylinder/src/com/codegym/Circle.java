package com.codegym;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0d;
        this.color = "purple";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    public String toString(){
        return "A circle with color = "+this.color+", and radius = "+this.radius;
    }
}
