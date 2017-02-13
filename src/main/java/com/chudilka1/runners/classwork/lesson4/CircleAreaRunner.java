package com.chudilka1.runners.classwork.lesson4;

import com.chudilka1.app.classwork.lesson4.CircleArea;
import java.util.Scanner;

public class CircleAreaRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius: ");
        double radius = scanner.nextDouble();
        System.out.println("Area is " + CircleArea.calculate(radius));
    }
}
