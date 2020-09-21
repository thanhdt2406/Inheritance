package com.codegym;

public class Triangle extends Shape {

    public Triangle() {
        super();
    }

    public Triangle(double size1, double size2, double size3, String color) {
        super(size1, size2, size3, color);
    }

    public double getArea() {
        double halfPerimeter = this.getPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.getSize1()) * (halfPerimeter - this.getSize2()) * (halfPerimeter - this.getSize3()));
    }

    @Override
    public String toString() {
        return "A Triangle with size1 = " + this.getSize1() + ", size2 = " + this.getSize2() + ", size3 = " + this.getSize3() + " and color = '" + this.getColor() + "'";
    }
}
