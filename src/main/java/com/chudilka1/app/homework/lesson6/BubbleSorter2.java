package com.chudilka1.app.homework.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BubbleSorter2 {
    /*public int[] bubbleSorterToBigger (int[] array1) {
        boolean flag = true;
        if (array1.length > 1) {
            do {
                flag = false;
                for (int i = 0; i < array1.length - 1; i++) {
                    if (array1[i] > array1[i+1]){
                        int temp = array1[i];
                        array1[i] = array1[i+1];
                        array1[i+1] = temp;
                        flag = true;
                    }
                }
            }
            while (flag);
        }
        return array1;
    }

    public int[] bubbleSorterToLesser (int[] array2) {
        boolean flag = true;
        if (array2.length > 1) {
            do {
                flag = false;
                for (int i = 0; i < array2.length - 1; i++) {
                    if (array2[i+1] > array2[i]){
                        int temp = array2[i+1];
                        array2[i+1] = array2[i];
                        array2[i] = temp;
                        flag = true;
                    }
                }
            }
            while (flag);
        }
        return array2;
    }

    //Сортировка методов отбора наименьшего в массиве и перемещения на соответствующее место (Selection sort)
    public int[] selectionSorter (int[] array3) {
        for (int i = 0; i < array3.length - 1; i++) {
            int ind = i;
            for (int j = i + 1; j < array3.length; j++) {
                if (array3[j] < array3[ind]) {
                    ind = j; //поиск индекса с наименьшим значением
                }
            }
            if (ind != i) {
                int biggerValue = array3[i];
                array3[i] = array3[ind];
                array3[ind] = biggerValue;
            }
        }
        return array3;
    }

    public int biggestInArray(int[][] array4) {
        int temp = 0;//наибольшее значение из проверяемого массива
        int biggest = 0;//наибольшее во всех массивах
        int index = 0;//изменяющийся индекс, на то, в котором значение больше, чтобы не сортировать/переписывать значения в массиве
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                if (index < array4[i].length - 1 && j < array4[i].length - 1) {
                    if (array4[i][index] > array4[i][j + 1]) { //является ли предыдущее значение большим следующего в проверяемом массиве
                        temp = array4[i][index]; //если да, присвоить переменной это значение (на данный момент наибольшее)
                    } else {
                        temp = array4[i][j + 1]; //если нет, присвоить переменной следующее значение массива
                        index = j + 1;//сместить индекс на место наибольшего значения
                    }//end inner if
                }//end outer if
            }//end inner for
            index = 0;//сброс индекса для проверки следующего массива с самого начала
            if (temp > biggest) {
                biggest = temp;//если наибольшее значение в проверенном массиве больше наибольшего уже известного - перепесать
            }
            if (i + 1 <= array4.length - 1) {
                if (biggest < array4[i+1][0]) {
                    biggest = array4[i + 1][0];//если наибольшее значение меньше нулевого в следующем массиве - переписать
                }
            }//end outer if
        }//end outer for
        return biggest;
    }//end method
    */

    //генератор неповторяющихся примеров из таблицы умножения
    public String[] taskGenerator(int a) {
        Random random = new Random();
        String[] array5 = new String[a];
        for (int i = 0; i < array5.length; i++) {
            int x = random.nextInt(9) + 2;
            int y = random.nextInt(9) + 2;
            String string = "" + x + "*" + y;
            array5[i] = string;
            if (i <= array5.length && i > 0) {
                if (array5[i].equals(array5[i - 1])) {
                    i--;
                }
            }
        }
        return array5;
    }

    public static void main(String[] args) {
        /*int[] array1 = new int[10];
        //using methods in the class
        BubbleSorter2 sorting = new BubbleSorter2();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random()*999);
        }
        System.out.println("BUBBLE SORTING\n" +
                "Generated array" + Arrays.toString(array1));
        sorting.bubbleSorterToBigger(array1);
        System.out.println("Sorting from lesser to bigger" + Arrays.toString(array1));
        sorting.bubbleSorterToLesser(array1);
        System.out.println("Sorting from bigger to lesser" + Arrays.toString(array1) + "\n");

        //using Arrays.sort
        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random()*999);
        }
        System.out.println("ARRAY SORTER\n" +
                "Generated array " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted array " + Arrays.toString(array2) + "\n");

        //Selection sort
        BubbleSorter2 sorting2 = new BubbleSorter2();
        int[] array3 = new int[10];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (int) (Math.random()*999);
        }
        System.out.println("SELECTION SORTER\n" +
                "Generated array " + Arrays.toString(array3));
        sorting2.selectionSorter(array3);
        System.out.println("Sorted array " + Arrays.toString(array3));

        //двухмерный массив с поиском наибольшего числа
        BubbleSorter2 sorting3 = new BubbleSorter2();
        Random random = new Random();
        int[][] array4 = new int[8][5];
        System.out.println("FIND BIGGEST IN MULTI-ARRAY");
        for (int i = 0; i < array4.length; i++){
            System.out.print("Array " + i + ": ");
            for (int j = 0; j < array4[i].length; j++) {
                array4[i][j] = (random.nextInt(99+99) - 99);
                System.out.printf("%4d", array4[i][j]);
            }
            System.out.println();
        }
        System.out.println("Biggest in array " + sorting3.biggestInArray(array4) + "\n");*/

        //массив различных примеров
        BubbleSorter2 bubbleSorter2 = new BubbleSorter2();
        System.out.println(Arrays.toString(bubbleSorter2.taskGenerator(15)));
    }
}
