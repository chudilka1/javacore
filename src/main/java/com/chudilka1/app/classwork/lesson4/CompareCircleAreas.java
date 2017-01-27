package com.chudilka1.app.classwork.lesson4;


import java.util.Scanner;

public class CompareCircleAreas {
    public static final double PI = 3.14d;

    public static void calculateBigger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius for circle 1: ");
        double radius1 = scanner.nextDouble();
        System.out.println("Radius for circle 2: ");
        double radius2 = scanner.nextDouble();
        double area1 = PI * Math.pow(radius1, 2);
        double area2 = PI * Math.pow(radius2, 2);
        if (area1 > area2) {
            System.out.print("Circle 1 is bigger");
        } if (area1 == area2) {
            System.out.print("Circles are equal");
        } else {
            System.out.print("Circle 2 is bigger");
        }
    }
}