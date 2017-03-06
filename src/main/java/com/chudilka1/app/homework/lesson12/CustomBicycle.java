package com.chudilka1.app.homework.lesson12;

public class CustomBicycle extends Bicycle {
    private int speed;
    private int gear;

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Speed: " + Integer.toString(getSpeed()));
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void setGear(int gear) {
        this.gear = gear;
        System.out.println("Gear: " + Integer.toString(getGear()));
    }

    public int getGear() {
        return gear;
    }

    @Override
    public void ride() {
        String SOUND = "Wshhhh!";
        System.out.println(SOUND);
    }
}
