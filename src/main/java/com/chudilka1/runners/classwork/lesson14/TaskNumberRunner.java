package com.chudilka1.runners.classwork.lesson14;


import com.chudilka1.app.classwork.lesson14.TaskNumber;
import com.chudilka1.runners.classwork.lesson4.*;

import java.util.Scanner;

public class TaskNumberRunner {
    public static void main(String[] args) {
        //enum menu for lesson4.homework
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of task (as a word): ");
            String number = scanner.next().toUpperCase();
            TaskNumber taskNumber = TaskNumber.valueOf(number);
            switch (taskNumber) {
                case ONE:
                    System.out.println("--CALCULATION OF CIRCLE AREA--");
                    CircleAreaRunner.main(null);
                    break;
                case TWO:
                    System.out.println("--TWO CIRCLES COMPARISON--");
                    CompareCircleAreasRunner.main(null);
                    break;
                case THREE:
                    System.out.println("--TWO NUMBERS COMPARISON--");
                    CompareTwoNumbersRunner.main(null);
                    break;
                case FOUR:
                    System.out.println("--EVEN OR ODD--");
                    EvenOrOddRunner.main(null);
                    break;
                case FIVE:
                    System.out.println("--IS IT RIGHT-ANGLED TRIANGLE?--");
                    RightAngledTriangleRunner.main(null);
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("None task is identifed with this number");
        }
    }
}
