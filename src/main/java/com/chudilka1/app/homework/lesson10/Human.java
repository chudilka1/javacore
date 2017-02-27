package com.chudilka1.app.homework.lesson10;


import java.util.Scanner;

public class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0 && age < 121) {
            this.age = age;
            System.out.println("New age has been set\n");
        } else {
            System.out.println("Invalid Age\n");
        }
    }
}
