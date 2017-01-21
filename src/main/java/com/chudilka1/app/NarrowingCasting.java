package com.chudilka1.app;


public class NarrowingCasting {
    int int1 = 0;
    float float1 = 3.14159f;

    public void narrowing() {
        int1 = (int) float1;
        System.out.println(int1);
    }
    public static void main(String[] args) {
        NarrowingCasting narrowingCasting = new NarrowingCasting();
        narrowingCasting.narrowing();
    }
}
