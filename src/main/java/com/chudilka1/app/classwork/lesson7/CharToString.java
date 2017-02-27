package com.chudilka1.app.classwork.lesson7;

import java.util.Random;

public class CharToString {
    private String string;

    public String charToStringGenerator (char [] array) {
        for (int i =0; i < array.length; i++) {
            string += array[i];
        }
        return string;
    }
}
