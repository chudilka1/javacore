package com.chudilka1.runners.classwork.lesson14;

import com.chudilka1.app.classwork.lesson14.Holidays;
import com.chudilka1.app.classwork.lesson14.TaskNumber;

import java.util.Scanner;

public class HolidaysEnumRunner {
    public static void main(String[] args) {
        //enum menu for lesson14.holidays
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter holiday: ");
            String name = scanner.next().toUpperCase();
            Holidays holidays = Holidays.valueOf(name);
            switch (holidays) {
                case NEW_YEAR:
                    System.out.println(holidays.getName() +
                            " holiday is on " +
                            holidays.getMonth() + " " +
                            holidays.getDate() +
                            " in " + holidays.getPlace());
                    break;
                case CHRISTMAS:
                    System.out.println(holidays.getName() +
                            " holiday is on " +
                            holidays.getMonth() + " " +
                            holidays.getDate() +
                            " in " + holidays.getPlace());
                    break;
                case MARCH:
                    System.out.println(holidays.getName() +
                            " holiday is on " +
                            holidays.getMonth() + " " +
                            holidays.getDate() +
                            " in " + holidays.getPlace());
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("None name is identifed with existing holidays");
        }
    }
}
