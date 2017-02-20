package com.chudilka1.app.classwork.lesson8;

import java.util.Scanner;

public class SplitString {
    //1. посчитать, сколько слов было введено в строке (разделитель - пробел)
    public int wordsCounter(String input) {
        return input.split(" ").length;
    }

    //2. converts array of chars to String with StringBuilder
    public String charsToStringStringBuilder (char[] input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char i: input) {
            stringBuilder.append(i);
        }
        return stringBuilder.toString();
    }

    //3. 'Substitution cipher' algorithm
    public String stringCoder(String original) {
        StringBuilder stringBuilder = new StringBuilder(original);
        String cipherText = "qA1zwS2xEd3cR4fv5Tg6b7Yh8nU9J0MikLoP";
        String coded = "";

        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int k = 0; k < original.length(); k++ ) {
                if (stringBuilder.charAt(i) == original.charAt(i)) {
                    stringBuilder.setCharAt(i, cipherText.charAt(k));
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SplitString splitString = new SplitString();
        System.out.println("Enter smth:");
        String input = scanner.nextLine();
        System.out.println("Number of words = " + splitString.wordsCounter(input) + "\n");

        //measure string performance
        long start = System.currentTimeMillis();
        String c = "start";
        String b = "finish";

        for (long i = 0; i < 10000L; i++)
            c = c.concat(b);
        long end = System.currentTimeMillis();
        System.out.println("Performance of String = " + (end - start) + "\n");

        //measure StringBuilder performance
        long start2 = System.currentTimeMillis();
        String a = "start";
        String d = "finish";
        StringBuilder stringBuilder = new StringBuilder(a);

        for (long i = 0; i < 100000L; i++)
            stringBuilder = stringBuilder.append(d);
        long end2 = System.currentTimeMillis();
        System.out.println("Performance of StringBuilder = " + (end2 - start2));


        //2.
        SplitString split = new SplitString();
        char[] input2 = {'a', 'b', 'c', 'd'};
        System.out.println("String is: \"" + split.charsToStringStringBuilder(input2) + "\"\n");

    }
}
