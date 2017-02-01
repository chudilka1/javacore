package com.chudilka1.app.classwork.lesson4;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class EvenOrOddTest {
    EvenOrOdd evenOrOdd;

    @Before
    public void setUp(){
        evenOrOdd = new EvenOrOdd();
    }

    @Test
    public void calculateEvenOdd1() {
        Assert.assertTrue("It is even number", evenOrOdd.isCalculateEvenOdd(44)[0]);
    }

    @Test
    public void calculateEvenOdd2() {
        Assert.assertTrue("It is odd number", evenOrOdd.isCalculateEvenOdd(9)[1]);
    }

    @After
    public void tearDown(){}
}