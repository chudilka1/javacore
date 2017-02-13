package com.chudilka1.app.classwork.lesson4;


public class RightAngledTriangle {
    private static boolean[] result = {false, false};

    public static boolean[] isTriangleCalculations(double side1, double side2, double side3) {
        if ((side1 * side1 == side2 * side2 + side3 * side3)||(side2 * side2 == side1 * side1 + side3 * side3)||(side3 * side3 == side1 * side1 + side2 * side2)) {
            System.out.println("This is right-angled triangle");
            result[0] = true;
        } else {
            System.out.println("This is not right-angled triangle");
            result[1] = true;
        }
        return result;
    }
}