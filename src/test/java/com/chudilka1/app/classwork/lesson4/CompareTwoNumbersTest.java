package com.chudilka1.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class CompareTwoNumbersTest {
    @Test
    public void isCompareNumbers1() {
        double num1 = -1.01;
        double num2 = -1.1;
        Assert.assertTrue("Result: 'Number 1' is bigger --> " + num1 + " is bigger than " + num2, CompareTwoNumbers.isCompareNumbers(num1, num2)[0]);
    }

    @Test
    public void isCompareNumbers2() {
        double num1 = 5.00003;
        double num2 = 5.00003;
        Assert.assertTrue("Result: numbers are equal --> " + num1 + " = " + num2, CompareTwoNumbers.isCompareNumbers(num1, num2)[1]);
    }

    @Test
    public void isCompareNumbers3() {
        double num1 = 0.01003;
        double num2 = 65.99;
        Assert.assertTrue("Result: 'Number 2' is bigger --> " + num2 + " is bigger than " + num1, CompareTwoNumbers.isCompareNumbers(num1, num2)[2]);
    }
}