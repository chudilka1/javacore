package com.chudilka1.app.classwork.lesson4;
import java.util.Scanner;

public class RightAngledTriangle {
    public static void triangleCalculations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Triangle side 1 lenght: ");
        double side1 = scanner.nextDouble();
        System.out.println("Triangle side 2 lenght: ");
        double side2 = scanner.nextDouble();
        System.out.println("Triangle side 3 lenght: ");
        double side3 = scanner.nextDouble();
        if ((side1 * side1 == side2 * side2 + side3 * side3)||(side2 * side2 == side1 * side1 + side3 * side3)||(side3 * side3 == side1 * side1 + side2 * side2)) {
            System.out.print("This is right-angled triangle");
        } else {
            System.out.print("This is not right-angled triangle");
        }
    }
}
