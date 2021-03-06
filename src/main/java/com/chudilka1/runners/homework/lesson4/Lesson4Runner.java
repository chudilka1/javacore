package com.chudilka1.runners.homework.lesson4;

import com.chudilka1.runners.classwork.lesson4.*;
import java.util.Scanner;


public class Lesson4Runner {
    private static final String CLASS1 = "Type '1', to calculate circle Area\n";
    private static final String CLASS2 = "Type '2', to compare areas of two circles\n";
    private static final String CLASS3 = "Type '3', to compare two numbers\n";
    private static final String CLASS4 = "Type '4', to calculate whether the entered numbers is even or odd\n";
    private static final String CLASS5 = "Type '5', to check if entered length of triangle sides result in right-angled triangle\n";
    private static final String MENU = "\nYOU MAY RUN FOLLOWING CALCULATIONS:\n" + CLASS1 + CLASS2 + CLASS3 + CLASS4 + CLASS5 + "\n";

    private static void listClasses() {
        System.out.print(MENU);
    }

    private static void launchClass() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number to execute calculations and press 'ENTER': ");
        while (!scanner.hasNextDouble()) {
            System.out.print("(!) Value entered is not a number!\n"
            + "Type a number to execute calculations and press 'ENTER': ");
            scanner.nextLine();
        }
        boolean flag;
        do {
            int input = (int) scanner.nextDouble();
            switch (input) {
                case 1: System.out.println("--CALCULATION OF CIRCLE AREA--");
                    CircleAreaRunner.main(null);
                    flag = false;
                    break;
                case 2: System.out.println("--TWO CIRCLES COMPARISON--");
                    CompareCircleAreasRunner.main(null);
                    flag = false;
                    break;
                case 3: System.out.println("--TWO NUMBERS COMPARISON--");
                    CompareTwoNumbersRunner.main(null);
                    flag = false;
                    break;
                case 4: System.out.println("--EVEN OR ODD--");
                    EvenOrOddRunner.main(null);
                    flag = false;
                    break;
                case 5: System.out.println("--IS IT RIGHT-ANGLED TRIANGLE?--");
                    RightAngledTriangleRunner.main(null);
                    flag = false;
                    break;
                default: System.out.println("(!) This number is not identified with one of the tasks mentioned above\n");
                    Lesson4Runner.listClasses();
                    System.out.print("Type appropriate number to execute calculations and press 'ENTER': ");
                    flag = true;
                    break; } // end of switch
        } while (flag);

        System.out.print("\nEnter 'Y' to launch any calculations again or 'N' to quit: ");
        while (true) {
            String decision;
            decision = scanner.next();
            if (decision.equalsIgnoreCase("y")) {
                Lesson4Runner.listClasses();
                Lesson4Runner.launchClass();
                break;
            } else if (decision.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.print("Enter 'Y' or 'N' to continue or quit: ");
            }
        }
    }

    public static void main(String[] args) {
        Lesson4Runner.listClasses();
        Lesson4Runner.launchClass();
    }
}
