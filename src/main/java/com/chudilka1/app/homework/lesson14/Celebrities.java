package com.chudilka1.app.homework.lesson14;


public enum Celebrities {
    ONE ("Vasya", 30, true),
    TWO ("Petya", 89, false),
    THREE ("Vanya", 43, true),
    FOUR ("Dusya", 26, true),
    FIVE ("Marusya", 29, false),
    SIX ("Baba Galya", 130, false);

    String name;
    int age;
    boolean alive;

    Celebrities(String name, int age, boolean alive) {
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAlive() {
        return alive;
    }
}
