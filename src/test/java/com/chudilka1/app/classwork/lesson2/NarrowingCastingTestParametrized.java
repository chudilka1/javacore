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
public class NarrowingCastingTestParametrized {
    NarrowingCasting narrowingCasting;

    @Before
    public void setUp() {
        narrowingCasting = new NarrowingCasting();
    }

    @Test
    @FileParameters(value = "src/test/resources/narrowingTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void narrowing(float a, int expected) {
        Assert.assertEquals(expected, narrowingCasting.narrowing(a));
    }

    @After
    public void tearDown() {}
}