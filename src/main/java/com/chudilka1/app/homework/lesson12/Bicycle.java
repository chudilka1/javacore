package com.chudilka1.app.homework.lesson12;

public abstract class Bicycle {

    abstract void setSpeed(int speed);

    abstract void setGear(int gear);

    public void ride(){
        String SOUND = "Wroom!";
        System.out.println(SOUND);
    }


}
