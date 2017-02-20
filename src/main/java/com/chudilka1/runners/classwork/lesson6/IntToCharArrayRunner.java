package com.chudilka1.runners.classwork.lesson6;

import com.chudilka1.app.classwork.lesson6.IntToCharArray;
import java.util.Arrays;

public class IntToCharArrayRunner {
    public static void main(String[] args) {
        IntToCharArray intToCharArray = new IntToCharArray();
        System.out.println("ASCII chars: " + Arrays.toString(intToCharArray.arrayOfChars(105, 100)));
    }
}
