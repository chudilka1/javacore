package com.chudilka1.runners.classwork.lesson6;

import com.chudilka1.app.classwork.lesson6.ArrayBubbleSorting;
import java.util.Arrays;

public class ArrayBubbleSortingRunner {
    public static void main(String[] args) {
        ArrayBubbleSorting arrayBubbleSorting = new ArrayBubbleSorting();
        int [] array = {2,11,4,23,5,-3,4,8,18,3,18,0,99};
        System.out.println(Arrays.toString(arrayBubbleSorting.bubbleSorter(array)));
    }
}
