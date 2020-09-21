package com.codegym;

public class CircleTest {

    public static void main(String[] args) {
	    Circle c1 = new Circle();
        System.out.println("Area: "+c1.getArea());
        System.out.println("Perimeter: "+c1.getPerimeter());
        System.out.println(c1.toString());

	    Circle c2 = new Circle(3.0,"red");
        System.out.println("Area: "+c2.getArea());
        System.out.println("Perimeter: "+c2.getPerimeter());
        System.out.println(c2.toString());

        Cylinder cy1 = new Cylinder();
        System.out.println("Area: "+cy1.getArea());
        System.out.println("Perimeter: "+cy1.getPerimeter());
        System.out.println("Volume: "+cy1.getVolume());
        System.out.println(cy1.toString());

        Cylinder cy2 = new Cylinder(5.9);
        System.out.println("Area: "+cy2.getArea());
        System.out.println("Perimeter: "+cy2.getPerimeter());
        System.out.println("Volume: "+cy2.getVolume());
        System.out.println(cy2.toString());

        Cylinder cy3 = new Cylinder(5.9,"yellow",5.9);
        System.out.println("Area: "+cy3.getArea());
        System.out.println("Perimeter: "+cy3.getPerimeter());
        System.out.println("Volume: "+cy3.getVolume());
        System.out.println(cy3.toString());
    }
}
