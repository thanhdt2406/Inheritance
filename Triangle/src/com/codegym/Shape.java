package com.codegym;

public class Shape {
    private double size1;
    private double size2;
    private double size3;
    String color;

    public Shape() {
        this.size1 = 1.0d;
        this.size2 = 1.0d;
        this.size3 = 1.0d;
        this.color = "white";
    }

    public Shape(double size1, double size2, double size3, String color) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
        this.color = color;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPerimeter() {
        return this.size1 + this.size2 + this.size3;
    }

    @Override
    public String toString() {
        return "A Shape with size1 = " + this.size1 + ", size2 = " + this.size2 + ", size3 = " + this.size3 + " and color = '" + this.color + "'";
    }
}
