package com.chudilka1.app.classwork.lesson6;

import java.util.Arrays;

public class ArrayBubbleSorting {
    public int[] bubbleSorter(int[] array) {
        boolean flag;
        if (array.length > 1) {
            do {
                flag = false;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i+1]){
                        int temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                        flag = true;
                    }
                }
            }
            while (flag);
        }
        return array;
    }
    public static void main(String[] args) {
        ArrayBubbleSorting arrayBubbleSorting = new ArrayBubbleSorting();
        int [] array = {2,1,4,3};
        System.out.println(Arrays.toString(arrayBubbleSorting.bubbleSorter(array)));
    }
}




