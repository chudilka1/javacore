package com.chudilka1.app.classwork.lesson4;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class EvenOrOddTest {
    @Test
    public void calculateEvenOdd1() {
        Assert.assertTrue("It is even number", EvenOrOdd.isCalculateEvenOdd(44)[0]);
    }

    @Test
    public void calculateEvenOdd2() {
        Assert.assertTrue("It is odd number", EvenOrOdd.isCalculateEvenOdd(9)[1]);
    }
}