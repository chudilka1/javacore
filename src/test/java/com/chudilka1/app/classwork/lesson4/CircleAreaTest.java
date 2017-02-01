package com.chudilka1.app.classwork.lesson4;

import javafx.scene.shape.Circle;
import org.junit.Test;
import org.junit.Assert;

public class CircleAreaTest {
    @Test
    public void calculate() {
        CircleArea circleArea = new CircleArea();
        Assert.assertEquals(18.550790460182373, circleArea.calculate(2.43), 1e-7);
    }
}