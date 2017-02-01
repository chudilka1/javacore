package com.chudilka1.app.homework.lesson2.convertors;

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
public class PrimitiveConvertorParametrizedTest {
    PrimitiveConvertor primitiveConvertor;

    @Before
    public void setUp(){
        primitiveConvertor = new PrimitiveConvertor();
    }


    @Test
    @FileParameters(value ="src/test/resources/floatToCharData.csv", mapper = CsvWithHeaderMapper.class)
    public void floatToChar(float float1, char expected) {
        Assert.assertEquals(expected, primitiveConvertor.floatToChar(float1));
    }

    @Test
    @FileParameters(value = "src/test/resources/intToCharData.csv", mapper = CsvWithHeaderMapper.class)
    public void intToChar(int int1, char expected) {
        Assert.assertEquals(expected, primitiveConvertor.intToChar(int1));
    }

    @Test
    @FileParameters(value = "src/test/resources/charToIntData.csv", mapper = CsvWithHeaderMapper.class)
    public void charToInt(char char1, int expected) {
        Assert.assertEquals(expected, primitiveConvertor.charToInt(char1));
    }

    @After
    public void tearDown() {}

}