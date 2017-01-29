package com.chudilka1.app.classwork.lesson4;


public class EvenOrOdd {
    static private boolean[] result = {false, false};

    public static boolean[] isCalculateEvenOdd(int value){
        if (value % 2 == 0) {
            System.out.println("It is even number");
            result[0] = true;
        } else {
            System.out.println("It is odd number");
            result[1] = true;
        }
        return result;
    }

}
