package com.chudilka1.app.homework.lesson2.convertors;

public class PrimitiveConvertor {
    char char1 = 'x';
    int int1 = 65;
    float float1 = 78.0f;

    public void floatToChar() {
        char1 = (char) float1;
        System.out.println("Input float value is " + float1 + ". Output char value is " + char1);
    }
    public void intToChar() {
        char1 = (char) int1;
        System.out.println("Input int value is " + int1 + ". Output char value is " + char1);
    }
    public void charToInt() {
        int1 = (int) char1;
        System.out.println("Input char value is " + char1 + ". Output int value is " + int1);
    }
}
