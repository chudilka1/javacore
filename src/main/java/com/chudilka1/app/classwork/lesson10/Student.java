package com.chudilka1.app.classwork.lesson10;

import java.util.Scanner;

public class Student {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.next();
        student.setName(name);
        System.out.println(student.getName());
    }
}
