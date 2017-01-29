package com.chudilka1.app.runners.classwork.lesson4;
import com.chudilka1.app.classwork.lesson4.CompareCircleAreas;

import java.util.Scanner;

public class CompareCircleAreasRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius for circle 1: ");
        double radius1 = scanner.nextDouble();
        System.out.print("Radius for circle 2: ");
        double radius2 = scanner.nextDouble();
        CompareCircleAreas.isCircleBigger(radius1, radius2);
    }
}
