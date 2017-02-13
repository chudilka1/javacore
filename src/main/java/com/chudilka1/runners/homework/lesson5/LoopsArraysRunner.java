package com.chudilka1.runners.homework.lesson5;

import java.util.Random;
import java.util.Scanner;

public class LoopsArraysRunner {
    private static final String TASK1 = "Введите '1', чтобы вывести четные элементы массива от 2 до 20 в строку и столбик\n";
    private static final String TASK2 = "Введите '2', чтобы вывести нечетные элементы массива от 1 до 99 подряд и в обратном порядке\n";
    private static final String TASK3 = "Введите '3', чтобы вывести массив из 15 чисел и количество четных\n";
    private static final String TASK4 = "Введите '4', чтобы вывести массив из 15 случайных целых чисел от 0 до 999\n";
    private static final String TASK5 = "Введите '5', чтобы вывести min. и max значение элементов массива\n";
    private static final String TASK6 = "Введите '6', чтобы вывести двумерный массив 8x5 из цифр от 10 до 99\n";
    private static final String TASK7 = "Введите '7', чтобы вывести двумерный массив в виде матрицы 8x5 из цифр от 1 до 999\n";
    private static final String TASK8 = "Введите '8', чтобы вывести числа c клавиатуры и посчитать их сумму\n";
    private static final String MENU = "\nYOU MAY RUN FOLLOWING CALCULATIONS:\n" + TASK1 + TASK2 + TASK3 + TASK4 + TASK5 + TASK6 + TASK7 + TASK8 + "\n";
    int index = 0;
    String input;
    double[] array;
    double sum = 0;
    boolean[] result = {false, false, false, false};

    public static void listTasks() {
        System.out.print(MENU);
    }

    private static void launchMethod() {
        Scanner scanner = new Scanner(System.in);
        LoopsArraysRunner loopsArraysRunner = new LoopsArraysRunner();
        System.out.print("Type a number to execute calculations and press 'ENTER': ");
        while (!scanner.hasNextDouble()) {
            System.out.print("(!) Value entered is not a number!\n"
                    + "Type a number to execute calculations and press 'ENTER': ");
            scanner.nextLine();
        }
        while (scanner.hasNextDouble()) {
            int input = (int) scanner.nextDouble();
            switch (input) {
                case 1: loopsArraysRunner.printEvenArray(20);
                    break;
                case 2: loopsArraysRunner.printOddArray(101);
                    break;
                case 3: loopsArraysRunner.printRangeInArray(15);
                    break;
                case 4: loopsArraysRunner.randomArrayGenerator(15);
                    break;
                case 5: loopsArraysRunner.arrayMinMaxValues(15);
                    break;
                case 6: loopsArraysRunner.printMultiArray(8, 5);
                    break;
                case 7: loopsArraysRunner.matrixMultiArray(8, 5);
                    break;
                case 8: loopsArraysRunner.isArrayManipulator(5);
                    break;
                default: System.out.println("(!) This number is not identified with one of the tasks mentioned above\n");
                    LoopsArraysRunner.launchMethod();
                    System.out.print("Type appropriate number to execute calculations and press 'ENTER': ");
            }
            if (!scanner.hasNextDouble()) {
                System.out.print("(!) Value entered is not a number!\n");
                LoopsArraysRunner.launchMethod();
                break;
            }
            System.out.print("\nEnter 'Y' to launch any calculations again or 'N' to quit: ");
            while (true) {
                String decision;
                decision = scanner.next();
                if (decision.equalsIgnoreCase("y")) {
                    LoopsArraysRunner.listTasks();
                    LoopsArraysRunner.launchMethod();
                    break;
                } else if (decision.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.print("Enter 'Y' or 'N' to continue or quit: ");
                }
            }
        }
    }

    //1. выведите четные элементы массива (2 до 20) на экран сначала в строку, а затем в столбик
    public void printEvenArray(int a) {
        int[] intEvenArray = new int[a];
        for (int i = 1; i < intEvenArray.length; i+=2) {
            intEvenArray[i] = i+1;
            System.out.print(intEvenArray[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < intEvenArray.length; i+=2) {
            intEvenArray[i] = i+1;
            System.out.println(intEvenArray[i]);
        }
    }

    //2. вывести массив нечётных (1 до 99) в строку, а затем этот же массив в другую строку, но в обратном порядке
    public void printOddArray (int a){
        int[] intOddArrray = new int[a];
        for (int i = 0; i < intOddArrray.length; i+=2) {
            intOddArrray[i] = i+1;
            System.out.print(intOddArrray[i] + " ");
        }
        System.out.println();
        for (int i = intOddArrray.length - 1; i > 0; i-=2) {
            intOddArrray[i] = i;
            System.out.print(intOddArrray[i] + " ");
        }
    }

    //3. вывести массив из 15 случайных целых чисел от 0 до 9. Подсчитать, сколько в массиве чётных элементов и вывести это количество на экран в отдельной строке
    public void printRangeInArray(int a) {
        Random random = new Random();
        int[] intRangeArray = new int[a];
        int even = 0;
        for (int i = 0; i < intRangeArray.length; i++) {
            intRangeArray[i] = random.nextInt(10);
            System.out.print(intRangeArray[i] + " ");
            if (intRangeArray[i]%2 == 0) {
                even++;
            }
        }
        System.out.println("\nThere are " + even + " even integers in Array");
    }

    //4. вывести массив из 15 случайных целых чисел от 0 до 999.
    public static int[] randomArrayGenerator(int a) {
        Random random = new Random();
        int[] intRangeArray = new int[a];
        for (int i = 0; i < intRangeArray.length; i++) {
            intRangeArray[i] = random.nextInt(1000);
            System.out.print(intRangeArray[i] + " ");
        }
        return intRangeArray;
    }

    //5. Вывести min. и max значение элементов массива (из randomArrayGenerator)
    public static int arrayMinMaxValues(int a) {
        int[] array = LoopsArraysRunner.randomArrayGenerator(a);
        int minValue = array[0];
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            } else if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("\nMin. value in Array: " + minValue);
        System.out.println("Max. value in Array: " + maxValue);
        return a;
    }

    //6. Вывести двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел от 10 до 99.
    public void printMultiArray(int row, int column) {
        Random random = new Random();
        int[][] intMultiArray = new int[row][column];
        for (int i = 0; i < intMultiArray.length; i++) {
            System.out.println("Integers in Array " + i);
            for (int j=0; j < intMultiArray[i].length; j++) {
                intMultiArray[i][j] = random.nextInt(100-10) + 10;
                System.out.println(intMultiArray[i][j]);
            }
        }
    }

    //7. Вывести двумерный массив в виде матрицы из 8 строк по 5 столбцов и случайных целых чисел от 1 до 999, выравнивание - правому краю столбца
    public static void matrixMultiArray(int row, int column) {
        Random random = new Random();
        int[][] intMultiArray = new int[row][column];
        for (int i = 0; i < intMultiArray.length; i++) {
            System.out.print("Array " + i + ": ");
            for (int j = 0; j < intMultiArray[i].length; j++) {
                intMultiArray[i][j] = random.nextInt(1000)+1;
                System.out.printf("%4d", intMultiArray[i][j]);
            }
            System.out.println();
        }
    }

    //8. ввод чисел c клавиатуры (по одному, через Enter), ввод прерывается словом “exit”. После прерывания вывести сумму всех введенных пользователем чисел.
    public double arrayManipulatorSum(int a){
        Scanner scanner = new Scanner(System.in);
        LoopsArraysRunner loopsArraysRunner = new LoopsArraysRunner();
        loopsArraysRunner.array = new double[a];
        for (int i = loopsArraysRunner.index; i < loopsArraysRunner.array.length; i++) {
            System.out.print("Введите число или впишите 'exit', чтобы завершить: ");
            if (!scanner.hasNextDouble()) {
                loopsArraysRunner.isArrayManipulator(a);
                result[0] = true;
            } else {
                loopsArraysRunner.array[i] = scanner.nextDouble();
                sum = sum + loopsArraysRunner.array[i];
                i++;
                result[1] = true;
            }
        }
        System.out.println("Сумма введенных чисел равна: " + sum);
        result [3] = true;
        return sum;
    }

    public boolean[] isArrayManipulator (int a) {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            LoopsArraysRunner loopsArraysRunner = new LoopsArraysRunner();
            System.out.print("Введите число или впишите 'exit', чтобы завершить: ");
            loopsArraysRunner.input = scanner.next();
            input = loopsArraysRunner.input;
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Сумма введенных чисел равна: " + loopsArraysRunner.sum);
                result[1] = true;
                break;
            } else if (scanner.hasNextDouble()) {
                loopsArraysRunner.array[loopsArraysRunner.index] = Double.parseDouble(loopsArraysRunner.input);
                loopsArraysRunner.arrayManipulatorSum(a);
                result[2] = true;
                break;
            }
            result [0] = true;
        }
        if (scanner.hasNextDouble()) {
            LoopsArraysRunner loopsArraysRunner = new LoopsArraysRunner();
            loopsArraysRunner.array[loopsArraysRunner.index] = Double.parseDouble(input);
            loopsArraysRunner.arrayManipulatorSum(a);
            result[3] = true;
        }
        return result;
    }


    public static void main(String[] args) {
        LoopsArraysRunner.listTasks();
        LoopsArraysRunner.launchMethod();
        //LoopsArraysRunner loopsArraysRunner = new LoopsArraysRunner();
        //loopsArraysRunner.isArrayManipulator(5);
    }
}