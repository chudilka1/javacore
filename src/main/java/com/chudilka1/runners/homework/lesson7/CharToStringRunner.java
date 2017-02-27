package com.chudilka1.runners.homework.lesson7;

import com.chudilka1.app.classwork.lesson7.CharToString;

import java.util.Random;

public class CharToStringRunner {
    public static void main(String[] args) {
        CharToString charToString = new CharToString();
        Random r = new Random();
        char[] array = new char[30];
        for(int i = 0; i < array.length; i++){
            array[i] = (char)(r.nextInt(256) + 10);
        }
        System.out.println(charToString.charToStringGenerator(array));

        int int1 = 1;
        long long1 = 22222L;
        double double1 = 3.14D;
        boolean boolean1 = false;
        String string = "3333333";
        String string2 = "true";
        String string3 = "414.003";
        String result = String.valueOf(int1);
        System.out.println(result);
        String result1 = String.valueOf(long1);
        System.out.println(result1);
        String result2 = String.valueOf(double1);
        System.out.println(result2);
        String result25 = String.valueOf(boolean1);
        System.out.println(result25);
        int result3 = Integer.valueOf(string);
        System.out.println(result3);
        long result4 = Long.valueOf(string);
        System.out.println(result4);
        double result5 = Double.valueOf(string3);
        System.out.println(result5);
        boolean result6 = Boolean.valueOf(string2);
        System.out.println(result6);


    }
}
