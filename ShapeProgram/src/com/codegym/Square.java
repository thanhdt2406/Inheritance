package com.codegym;

public class Square extends Rectangle {
    public Square() {
        super(1.0, 1.0);
    }

    public Square(double size) {
        super(size, size);
    }

    public Square(String color, boolean filled, double size){
        super.setColor(color);
        super.setFilled(filled);
        super.setHeight(size);
        super.setWidth(size);
    }
    public double getSize() {
        return super.getWidth();
    }

    public void setSize(double size) {
        super.setHeight(size);
        super.setWidth(size);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double height) {
        super.setWidth(height);
        super.setHeight(height);
    }

    @Override
    public String toString() {
        return "A Square with side = " + super.getWidth() + ", which is a subclass of " + super.toString();
    }
}
