package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double size1 = inputDouble("Enter size1: ");
        double size2 = inputDouble("Enter size2: ");
        double size3 = inputDouble("Enter size3: ");
        String color = inputString("Enter color:");
        Triangle triangle = new Triangle(size1, size2, size3, color);

        System.out.println(triangle.toString());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Area: " + triangle.getArea());
    }

    public static double inputDouble(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        double num;
        while (true) {
            try {
                num = Double.parseDouble(scanner.nextLine());
                if (num <= 0) {
                    System.out.println("Error! Please try again!!!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error! Please try again!!!");
            }
        }
        return num;
    }

    public static String inputString(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
