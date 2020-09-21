package com.codegym;

public class PointTest {

    public static void main(String[] args) {
	    Point p1 = new Point();
        System.out.println(p1.toString());

        Point p2 = new Point(6.9f,4.1f);
        System.out.println(p2.toString());

        MovablePoint m1 = new MovablePoint(8.1f,1.3f,5.2f,6.2f);
        System.out.println(m1.toString());

        MovablePoint m2 = new MovablePoint(8.5f,9.8f);
        System.out.println(m2.toString());

        MovablePoint m3 = new MovablePoint();
        System.out.println(m3.toString());
    }
}
