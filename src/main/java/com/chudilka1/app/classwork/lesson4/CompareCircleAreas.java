package com.chudilka1.app.classwork.lesson4;


public class CompareCircleAreas {
    static private boolean[] result = {false, false, false};

    public static boolean[] isCircleBigger (double radius1, double radius2) {
        double area1 = Math.PI * Math.pow(radius1, 2);
        double area2 = Math.PI * Math.pow(radius2, 2);
        if (area1 > area2) {
            System.out.println("Circle 1 is bigger");
            result[0] = true;
        } else if (area1 == area2) {
            System.out.println("Circles are equal");
            result[1] = true;
        } else {
            System.out.println("Circle 2 is bigger");
            result[2] = true;
        }
        return result;
    }
}
