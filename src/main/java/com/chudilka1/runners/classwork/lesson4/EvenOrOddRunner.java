package com.chudilka1.app.runners.classwork.lesson4;

import com.chudilka1.app.classwork.lesson4.EvenOrOdd;
import java.util.Scanner;

public class EvenOrOddRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type value: ");
        int value = (int) scanner.nextDouble();
        EvenOrOdd.isCalculateEvenOdd(value);
    }
}
