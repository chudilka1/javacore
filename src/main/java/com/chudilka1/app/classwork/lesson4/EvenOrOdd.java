package com.chudilka1.app.classwork.lesson4;
import java.util.Scanner;

public class EvenOrOdd {
    public static void calculateEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type value: ");
        int a = (int) scanner.nextDouble();
        if (a % 2 == 0) {
            System.out.println("It is even number");
        } else {
            System.out.println("It is odd number");
        }
    }
}
