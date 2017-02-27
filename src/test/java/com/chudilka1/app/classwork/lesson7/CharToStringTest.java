package com.chudilka1.app.classwork.lesson7;

import com.chudilka1.runners.ArrayInFileReader;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CharToStringTest {
    CharToString charToString;
    ArrayInFileReader reader;

    @Before
    public void setUp () {
        charToString = new CharToString();
    }

    @Test
    @FileParameters(value = "/src/test/resources/charToStringTestData(lesson7).csv", mapper = CsvWithHeaderMapper.class)
    public void charToStringGenerator(char[] array, String expected) {
        Assert.assertEquals(expected, charToString.charToStringGenerator(array));
    }

    @After
    public void tearDown () {}

}
