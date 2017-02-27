package com.chudilka1.app.classwork.lesson10;


import java.util.Scanner;

public class Bicyle {
    double length;
    double heith;
    double wheelRadius;
    String color;

    public Bicyle() {
        this.length = 2.5;
        this.heith = 1;
        this.wheelRadius = 30;
        this.color = "white";
    }

    public Bicyle(double length, double heith, double wheelRadius, String color) {
        this.length = length;
        this.heith = heith;
        this.wheelRadius = wheelRadius;
        this.color = color;
    }

    public Bicyle(double length, double heith, double wheelRadius) {
        this();
        this.length = length;
        this.heith = heith;
        this.wheelRadius = wheelRadius;
    }

    public Bicyle(double length, double heith) {
        this();
        this.length = length;
        this.heith = heith;
    }

    public Bicyle(double length) {
        this();
        this.length = length;
    }

    public Bicyle(double wheelRadius, String color) {
        this();
        this.wheelRadius = wheelRadius;
        this.color = color;
    }

    public static void main(String[] args) {
        Bicyle bicyle = new Bicyle(28, "black");
        Student student1 = new Student();
        System.out.println(student1.getName());
    }
}
