package com.chudilka1.app.homework.lesson10;

import java.util.Scanner;

public class WhiteCollar extends Human {
    private String companyName;

    public WhiteCollar(int age, String name, String company) {
        super(age, name);
        this.companyName = company;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (companyName.matches("^[ a-zA-Z0-9\\-]+$")) {
            this.companyName = companyName;
            System.out.println("New company name has been set\n");
        } else {
            System.out.println("Company name is invalid\n");
        }
    }

    public static void main (String[] args) {
        //get age, name, companyName
        WhiteCollar whiteCollar = new WhiteCollar(31, "Alex", "Uvo");
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Name of a human is " + whiteCollar.getName() + "\n" +
                "Age of a human is " + whiteCollar.getAge() + "\n" +
                "Company is " + "\"" + whiteCollar.getCompanyName() + "\"\n");

        //change age (1-120) & company Name (only space, latin, numbers, dash) and get it
        System.out.print("Enter new age: ");
        int age = scanner.nextInt();
        whiteCollar.setAge(age);
        System.out.print("Enter new company name: ");
        String companyName = scanner.next();
        whiteCollar.setCompanyName(companyName);
        System.out.println("Name of a human is " + whiteCollar.getName() + "\n" +
                "Age of a human is " + whiteCollar.getAge() + "\n" +
                "Company is " + "\"" + whiteCollar.getCompanyName() + "\"\n");
    }
}
