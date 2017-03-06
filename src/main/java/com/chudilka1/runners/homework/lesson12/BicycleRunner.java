package com.chudilka1.runners.homework.lesson12;

import com.chudilka1.app.homework.lesson12.BicycleWithRing;
import com.chudilka1.app.homework.lesson12.CustomBicycle;

public class BicycleRunner {
    public static void main(String[] args) {
        BicycleWithRing bicycleWithRing = new BicycleWithRing();
        CustomBicycle customBicycle = new CustomBicycle();
        customBicycle.setSpeed(40);
        customBicycle.setGear(6);
        bicycleWithRing.ring();
        customBicycle.ride();
    }
}
