package com.chudilka1.runners.classwork.lesson2;
import com.chudilka1.app.classwork.lesson2.WideningCasting;

public class WideningCastingRunner {
    public static void main(String[] args) {
        byte byte1 = 127;
        short short1 = 0;
        int int1 = 0;
        long long1 = 0;
        float float1 = 0.0f;
        WideningCasting.widening(byte1, short1, int1, long1, float1);
    }
}
