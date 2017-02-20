package com.chudilka1.app.classwork.lesson6;

public class IntToCharArray {
    public char[] arrayOfChars (int a, int b) {
        int arrayLength = a - b;
        char[] intarray = new char[arrayLength];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = (char) b++;
        }
        return intarray;
    }
}
