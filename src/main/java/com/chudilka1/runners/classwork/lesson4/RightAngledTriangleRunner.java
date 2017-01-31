package com.chudilka1.app.runners.classwork.lesson4;

import com.chudilka1.app.classwork.lesson4.RightAngledTriangle;
import java.util.Scanner;


public class RightAngledTriangleRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Triangle side 1 lenght: ");
        double side1 = scanner.nextDouble();
        System.out.print("Triangle side 2 lenght: ");
        double side2 = scanner.nextDouble();
        System.out.print("Triangle side 3 lenght: ");
        double side3 = scanner.nextDouble();
        RightAngledTriangle.isTriangleCalculations(side1, side2, side3);
    }
}
