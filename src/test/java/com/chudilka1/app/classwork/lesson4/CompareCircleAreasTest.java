package com.chudilka1.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompareCircleAreasTest {
    @Test
    public void isCircleBigger1() {
        Assert.assertTrue("Circle 1 is bigger", CompareCircleAreas.isCircleBigger(3.25, 3.24)[0]);
    }

    @Test
    public void isCircleBigger2() {
        Assert.assertTrue("Circles are equal", CompareCircleAreas.isCircleBigger(1.25, 1.25)[1]);
    }

    @Test
    public void isCircleBigger3() {
        Assert.assertTrue("Circle 2 is bigger", CompareCircleAreas.isCircleBigger(0.1, 10.01)[2]);
    }
}