package com.chudilka1.app.classwork.lesson6;


import java.util.Arrays;

public class IntToCharArray {
    public char[] arrayOfChars () {
        char[] intarray = new char[256];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = (char) i;
        }
        return intarray;
    }

    public static void main(String[] args) {
        IntToCharArray intToCharArray = new IntToCharArray();
        System.out.println("ASCII chars: " + Arrays.toString(intToCharArray.arrayOfChars()));
    }
}
