package com.chudilka1.app.classwork.lesson6;

import org.junit.Assert;
import org.junit.Test;

public class IntToCharArrayTest {

    @Test
    public void arrayOfChars() {
        IntToCharArray intToCharArray = new IntToCharArray();
        char[] expected = {'d', 'e', 'f', 'g', 'h'};
        Assert.assertArrayEquals(intToCharArray.arrayOfChars(105, 100), expected);
    }

}
