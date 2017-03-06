package com.chudilka1.app.classwork.lesson11;


import java.util.Scanner;

public class Teacher extends Person {
    String degree;
    String mainSubject;
    double experience;
    String additionalSubject;

    public Teacher(String name, String degree, String subject, double experience) {
        super(name);
        this.degree = degree;
        this.mainSubject = subject;
        this.experience = experience;
    }

    public String getDegree() {
        return degree;
    }

    public String getMainSubject() {
        return mainSubject;
    }

    public double getExperience() {
        return experience;
    }


    public final String subject(int courseYear) {
        switch (courseYear) {
            case 1:
                additionalSubject = "Math";
                System.out.println(courseYear + " year you are teaching " + mainSubject + " & " + additionalSubject);
                break;
            case 2:
                additionalSubject = "Physics";
                System.out.println("This year (" + courseYear + ") you are teaching " + mainSubject + " & " + additionalSubject);
                break;
            case 3:
                additionalSubject = "Programming";
                System.out.println("This year (" + courseYear + ") you are teaching " + mainSubject + " & " + additionalSubject);
                break;
            case 4:
                additionalSubject = "Higher math";
                System.out.println("This year (" + courseYear + ") you are teaching " + mainSubject + " & " + additionalSubject);
                break;
            default:
                System.out.println("Choose from 1 through 4");
        }
        return additionalSubject;
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alex", "PhD", "Literature", 8.5);
        System.out.println("Name: " + teacher.getName() + "\n" +
                "Degree: " + teacher.getDegree() + "\n" +
                "Subject: " + teacher.getMainSubject() + "\n" +
                "Experience: " + teacher.getExperience() + "\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter course year to see what you will teach: ");
        int courseYear = scanner.nextInt();
        teacher.subject(courseYear);
    }

}
