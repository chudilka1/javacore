package com.chudilka1.app.homework.lesson2.convertors;

public class PrimitiveConvertor {
    public float float1;
    public int int1;
    public char char1;

    public static char floatToChar(float float1) {
        char char1 = (char) float1;
        System.out.println("Input float value is " + float1 + ". Output char value is " + char1);
        return char1;
    }
    public static char intToChar(int int1) {
        char char1 = (char) int1;
        System.out.println("Input int value is " + int1 + ". Output char value is " + char1);
        return char1;
    }
    public static int charToInt(char char1) {
        int int1 = (int) char1;
        System.out.println("Input char value is " + char1 + ". Output int value is " + int1);
        return int1;
    }
}
