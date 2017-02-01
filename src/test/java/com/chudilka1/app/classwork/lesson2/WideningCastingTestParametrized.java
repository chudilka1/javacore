package com.chudilka1.app.classwork.lesson2;

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
public class WideningCastingTestParametrized {
    WideningCasting wideningCasting;

    @Before
    public void setUp(){
        wideningCasting = new WideningCasting();
    }

    @Test
    @FileParameters(value = "src/test/resources/wideningTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void widening(byte byte1, short short1, int int1, long long1, float float1, double expected) {
        Assert.assertEquals(expected, wideningCasting.widening(byte1, short1, int1, long1, float1), 1e-6);
    }

    @After
    public void tearDown() {}

}