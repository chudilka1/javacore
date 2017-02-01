package com.chudilka1.runners.classwork.lesson4;

import com.chudilka1.app.classwork.lesson4.CompareTwoNumbers;
import java.util.Scanner;


public class CompareTwoNumbersRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number 1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Number 2: ");
        double num2 = scanner.nextDouble();
        CompareTwoNumbers.isCompareNumbers(num1, num2);
    }
}
