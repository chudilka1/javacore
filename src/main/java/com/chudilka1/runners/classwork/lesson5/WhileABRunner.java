package com.chudilka1.runners.classwork.lesson5;

import com.chudilka1.app.classwork.lesson5.WhileAB;

import java.util.Arrays;
import java.util.Scanner;

public class WhileABRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WhileAB whileAB = new WhileAB();

        //list a until it is <= b
        System.out.print("Enter 1st number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter 2st number: ");
        double b = scanner.nextDouble();
        whileAB.isCompareAB(a, b);

        //list 'number' until it is >=10
        System.out.print("Enter number: ");
        double number = scanner.nextDouble();
        whileAB.isListTillTen(number);

        int c = 1;

        System.out.println("Original a value " + c);
        System.out.println("Post-increment a "+ c++);
        System.out.println("After post-increment " + c);
        System.out.println("Pre-increment a " + ++c);
        System.out.println("After pre-increment " + c);

        //Count how many even (i%2==0) numbers in range from 0 to 20
        System.out.print("Enter integer from 0 to 20: ");
        int  number2 = scanner.nextInt();
        whileAB.countEvens(number2);

        //Loop to print arrays of different types: boolean, char, double, long
        int[] intArray = {1,2,3};
        boolean[] boolArray = {true, false};
        char[] charArray = {'a', 'b', 'c', 'D'};
        double[] doubleArray = {1.0, 2.0, 3.0, 4.0};
        long[] longArray = {111111111, 222222222};
        System.out.println(Arrays.toString(intArray)); //outputs a string of intArray
        for(int arrElemnt: intArray){
            System.out.println(arrElemnt);
        } //for each loop
        for(int i=0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
        for(int i=0; i < boolArray.length; i++){
            System.out.println(boolArray[i]);
        }
        for(int i=0; i < charArray.length; i++){
            System.out.println(charArray[i]);
        }
        for(int i=0; i < doubleArray.length; i++){
            System.out.println(doubleArray[i]);
        }
        for(int i=0; i < longArray.length; i++){
            System.out.println(longArray[i]);
        }

        //list values in multi-dimensional array
        int[][] multiArray = {
                {1,2,3},
                {6,5,4}};
        for(int j=0; j < multiArray.length; j++){
            System.out.println("Numbers in array " + j);
            for (int k=0; k < multiArray[j].length; k++){
                System.out.println(multiArray[j][k]);
            }
        }
    }
}
