package com.chudilka1.app.classwork.lesson4;

import org.junit.Test;
import org.junit.Assert;

public class CircleAreaTest {
    @Test
    public void calculate() {
        Assert.assertEquals(12.56, CircleArea.calculate(2), 10^6);
    }
}