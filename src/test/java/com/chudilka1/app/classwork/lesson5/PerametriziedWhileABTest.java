package com.chudilka1.app.classwork.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class PerametriziedWhileABTest {
    WhileAB whileAB;


    @Before
    public void setUp() {whileAB = new WhileAB();}

    //Decrease a until it less or equals b
    @Test
    @FileParameters(value = "src/test/resources/isCompareABTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void isCompareAB(double a, double b, String message, int expected) {
        Assert.assertTrue(message, whileAB.isCompareAB(a, b)[expected]);
    }

    //List numbers from entered number till 10
    @Test
    @FileParameters(value = "src/test/resources/isListTillTenTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void isListTillTen(double a, String message, int expected) {
        Assert.assertTrue(message, whileAB.isListTillTen(a)[expected]);
    }

    //Count how many even (i%2==0) numbers in range from 0 to 20
    @Test
    @FileParameters(value = "src/test/resources/countEvensTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void countEvens(int a, int expected) {
        Assert.assertEquals(expected, whileAB.countEvens(a));
    }

    @After
    public void tearDown(){}
}