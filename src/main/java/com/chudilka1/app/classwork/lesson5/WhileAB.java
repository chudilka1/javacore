package com.chudilka1.app.classwork.lesson5;

public class WhileAB {
    static private boolean[] result = {false, false, false};

    //Decrease a until it less or equals b
    public static boolean[] isCompareAB(double a, double b) {
        while (a > b) {
            System.out.println("Number 1 (" + a + ") is still bigger than Number 2 (" + b + ")");
            a = a - 1;
            result[0] = true;
        }
        System.out.println("\nNumber 1 - " + a + " <= Number 2 - " + b + "\n");
        result[1] = true;
        return result;
    }

    //List numbers from entered number till 10
    public static boolean[] isListTillTen(double number) {
        double i = number;
        if (i > 10) {
            System.out.println("Number entered is bigger than 10");
            result[0] = true;
        } else {
            for (i = number; i <= 10; i++) {
                System.out.println(i);
                result[1] = true;
            }
        }
        result[2] = true;
        return result;
    }


    //Count how many even (i%2==0) numbers in range from 0 to 20
    public static int countEvens(int number2) {
        int i = number2;
        int k = 0;
        for (i = number2; i <= 20; i+=2) {
            k++;
        }
        System.out.println("In range from entered number to 20 - " + k + " even numbers");
        return number2;
    }
}