package com.chudilka1.app.homework.lesson3;

import org.junit.Assert;
import org.junit.Test;


public class UnitsToBeChekedTest {
    @Test
    public void simpleWord3() {
        UnitsToBeCheked unitsToBeCheked = new UnitsToBeCheked();
        Assert.assertEquals("Vasya", unitsToBeCheked.simpleWord3('V', 'a', 's', 'y', 'a'));
    }

    @Test
    public void substructingFloats() {
        UnitsToBeCheked unitsToBeCheked = new UnitsToBeCheked();
        Assert.assertEquals(-59.811, unitsToBeCheked.substructingFloats(-25.031f, 34.78f),10^6);
    }

    @Test
    public void multiplyingFloats() {
        UnitsToBeCheked unitsToBeCheked = new UnitsToBeCheked();
        Assert.assertEquals(20.043, unitsToBeCheked.multiplyingFloats(0.2f, 100.215f), 10^6);
    }

    @Test
    public void complexFloats() {
        UnitsToBeCheked unitsToBeCheked = new UnitsToBeCheked();
        Assert.assertEquals(17.6, unitsToBeCheked.complexFloats(0.2f, 10.05f, 3.5f, -2.1f), 10^6);
    }

    @Test
    public void trueOrFalse() {
        UnitsToBeCheked unitsToBeCheked = new UnitsToBeCheked();
        Assert.assertEquals(false, unitsToBeCheked.trueOrFalse(false));
    }

    @Test
    public void addingFloats() {
        UnitsToBeCheked unitsToBeCheked = new UnitsToBeCheked();
        Assert.assertEquals(80.05, unitsToBeCheked.addingFloats(40.005f, 40.07f, 0.075f), 10^6);
    }

    @Test
    public void simpleWord2() {
        UnitsToBeCheked unitsToBeCheked = new UnitsToBeCheked();
        Assert.assertEquals("ice", unitsToBeCheked.simpleWord2 ('i', 'c', 'e'));
    }

    @Test
    public void equalChars() {
        UnitsToBeCheked unitsToBeCheked = new UnitsToBeCheked();
        Assert.assertEquals('J', unitsToBeCheked.equalChars('J', 'J', 'J', 'J'));
    }

    @Test
    public void adding() throws Exception {
        UnitsToBeCheked unitsToBeCheked = new UnitsToBeCheked();
        Assert.assertEquals(0, unitsToBeCheked.adding(35, -30, -5));
    }

    @Test
    public void substraction() {
        UnitsToBeCheked unitsToBeCheked = new UnitsToBeCheked();
        Assert.assertEquals(31, unitsToBeCheked.substraction(6, 53, 90));
    }

    @Test
    public void multiplyingByZero() {
        UnitsToBeCheked unitsToBeCheked = new UnitsToBeCheked();
        Assert.assertEquals(0, unitsToBeCheked.multiplyingByZero(68));
    }

    @Test
    public void complexCalculations() {
        UnitsToBeCheked unitsToBeCheked = new UnitsToBeCheked();
        Assert.assertEquals(-10, unitsToBeCheked.complexCalculations(35,5, 20,3, -10));
    }

    @Test
    public void average() {
        UnitsToBeCheked unitsToBeCheked = new UnitsToBeCheked();
        Assert.assertEquals(5, unitsToBeCheked.average(15, 4, 1, 3, 2));
    }

    @Test
    public void addingDoubles() {
        UnitsToBeCheked unitsToBeCheked = new UnitsToBeCheked();
        Assert.assertEquals(-12.12, unitsToBeCheked.addingDoubles(-10.01, -2.11), 10^6);
    }

    @Test
    public void substractingDoubles() {
        UnitsToBeCheked unitsToBeCheked = new UnitsToBeCheked();
        Assert.assertEquals(3, unitsToBeCheked.substractingDoubles(6.3, 3.3), 10^6);
    }

    @Test
    public void multiplyingDoubles() {
        UnitsToBeCheked unitsToBeCheked = new UnitsToBeCheked();
        Assert.assertEquals(-1.6, unitsToBeCheked.multiplyingDoubles(0.32, -5.0), 10^6);
    }

    @Test
    public void remaining() {
        UnitsToBeCheked unitsToBeCheked = new UnitsToBeCheked();
        Assert.assertEquals(1, unitsToBeCheked.remaining(7, 3));
    }

    @Test
    public void complexDoubles() {
        UnitsToBeCheked unitsToBeCheked = new UnitsToBeCheked();
        Assert.assertEquals(4.12, unitsToBeCheked.complexDoubles(3.5, 6.8, 0.5, 2), 10^6);
    }

}