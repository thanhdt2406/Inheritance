package com.codegym;

public class PointTest {

    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        System.out.println(p1.toString());

        Point2D p2 = new Point2D(1.2f,3.3f);
        System.out.println(p2.toString());

        Point3D p3 = new Point3D();
        System.out.println(p3.toString());

        Point3D p4 = new Point3D(1.6f,8.2f,9.1f);
        System.out.println(p4.toString());
    }
}
