package com.chudilka1.app.classwork.lesson4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompareCircleAreasTest {
    CompareCircleAreas compareCircleAreas;

    @Before
    public void setUp(){
        compareCircleAreas = new CompareCircleAreas();
    }

    @Test
    public void isCircleBigger1() {
        CompareCircleAreas compareCircleAreas = new CompareCircleAreas();
        Assert.assertTrue("Circle 1 is bigger", compareCircleAreas.isCircleBigger(3.25, 3.24)[0]);
    }

    @Test
    public void isCircleBigger2() {
        Assert.assertTrue("Circles are equal", compareCircleAreas.isCircleBigger(1.25, 1.25)[1]);
    }

    @Test
    public void isCircleBigger3() {
        Assert.assertTrue("Circle 2 is bigger", compareCircleAreas.isCircleBigger(0.1, 10.01)[2]);
    }

    @After
    public void tearDown(){}
}