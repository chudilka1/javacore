package com.chudilka1.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RightAngledTriangleTest {
    @Test
    public void triangleCalculations1() {
        Assert.assertTrue("This is right-angled triangle", RightAngledTriangle.isTriangleCalculations(3.0,4.0,5.0)[0]);
    }

    @Test
    public void triangleCalculations2() {
        Assert.assertTrue("This is not right-angled triangle", RightAngledTriangle.isTriangleCalculations(4.1,9.5,2.0)[1]);
    }
}