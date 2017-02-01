package com.chudilka1.app.classwork.lesson5;

import com.chudilka1.app.classwork.lesson3.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.*;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ParametriziedTests {
    MathFunc mathFunc;

    @Before
    public void setUp(){
        mathFunc = new MathFunc();
    }

    @Test
    @FileParameters(value = "src/test/resources/multiplyData.txt", mapper = CsvWithHeaderMapper.class)
    public void multiplyTest(int a, int b, int expected){
        Assert.assertEquals(expected, mathFunc.multiply(a, b));
    }

    @After
    public void tearDown() {}
}
