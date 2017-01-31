package com.chudilka1.app.classwork.lesson2;

public class WideningCasting {
    byte byte1;
    short short1;
    int int1;
    long long1;
    float float1;
    double double1;
    //correct conversion 64f<=32f<=64<=32<=16<=8

    public static double widening(byte byte1, short short1, int int1, long long1, float float1) {
        double double1 = float1 = long1 = int1 = short1 = byte1;
        System.out.println(double1);
        return double1;
    }
}