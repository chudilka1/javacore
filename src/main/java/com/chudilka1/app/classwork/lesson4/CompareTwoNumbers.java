package com.chudilka1.app.classwork.lesson4;


public class CompareTwoNumbers {
    static private boolean[] result = {false, false, false};

    public static boolean[] isCompareNumbers(double num1, double num2) {
        if (num1 > num2) {
            System.out.println("Result: 'Number 1' is bigger --> " + num1 + " is bigger than " + num2);
            result[0] = true;
        } else if (num1 == num2) {
            System.out.println("Result: numbers are equal --> " + num1 + " = " + num2);
            result[1] = true;
        } else {
            System.out.println("Result: 'Number 2' is bigger --> " + num2 + " is bigger than " + num1);
            result[2] = true;
        }
        return result;
    }
}