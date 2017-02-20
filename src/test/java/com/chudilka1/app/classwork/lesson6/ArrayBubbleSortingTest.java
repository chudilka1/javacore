package com.chudilka1.app.classwork.lesson6;

import org.junit.Assert;
import org.junit.Test;

public class ArrayBubbleSortingTest {

    @Test
    public void bubbleSorter() {
        ArrayBubbleSorting arrayBubbleSorting = new ArrayBubbleSorting();
        int[] parameters = {2,11,4,23,5,-3,4,8,18,3,18,0,99};
        int[] expected = {-3,0,2,3,4,4,5,8,11,18,18,23,99};
        Assert.assertArrayEquals(arrayBubbleSorting.bubbleSorter(parameters), expected);
    }
}