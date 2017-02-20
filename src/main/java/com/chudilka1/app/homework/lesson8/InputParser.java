package com.chudilka1.app.homework.lesson8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InputParser {
    String delimiter = "";
    double[] convertedArray;

    //check whether a user entered !=1 delimeters
    public boolean isNumOfDelimiters (String input1) {
        delimiter = input1;
        int numOfDelimiters = delimiter.split("").length;
        return numOfDelimiters != 1 || delimiter.equals("");
    }

    //convert any number into double
    public double[] toDoubleConverter(String input) {
        String[] array1 = input.replaceAll("\\s+","").split(delimiter);
        ArrayList<String> array = new ArrayList<>();
        //add to arrayList only nonempty elements, remove them
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals("")) {
                array.add(array1[i]);
            }
        }

        //convert to double elements from ArrayList (without nulls)
        convertedArray = new double[array.size()];
        for (int j = 0; j < array.size(); j++) {
                convertedArray[j] = Double.valueOf(array.get(j));
        }
        return convertedArray;
    }

    //chose sorting from smaller to bigger (1), vice versa (2)
    public String arraySorter (int wayOfSorting) {
        switch (wayOfSorting) {
            case 1:
                for (int i = 0; i < convertedArray.length - 1; i++) {
                    int ind = i;
                    for (int j = i + 1; j < convertedArray.length; j++) {
                        if (convertedArray[j] < convertedArray[ind]) {
                            ind = j; //поиск индекса с наименьшим значением
                        }
                    }
                    if (ind != i) {
                        double biggerValue = convertedArray[i];
                        convertedArray[i] = convertedArray[ind];
                        convertedArray[ind] = biggerValue;
                }
            }
                break;

            case 2:
                for (int i = 0; i < convertedArray.length - 1; i++) {
                    int ind = i;
                    for (int j = i + 1; j < convertedArray.length; j++) {
                        if (convertedArray[j] > convertedArray[ind]) {
                            ind = j; //поиск индекса с наибольшим значением
                        }
                    }
                    if (ind != i) {
                        double biggerValue = convertedArray[i];
                        convertedArray[i] = convertedArray[ind];
                        convertedArray[ind] = biggerValue;
                    }
                }
                break;
            default:
                System.out.println("Enter appropriate number: ");
                break;
        }
        return Arrays.toString(convertedArray);
    }

    //gets only characters from the string
    public String characterFinder (String input) {
        StringBuilder onlyLetters = new StringBuilder();
        for (int i = 0; i < input.replaceAll("\\s+","").replace(delimiter, "").length(); i++) {
            char element = input.replaceAll("\\s+","").replace(delimiter, "").charAt(i);
            if (Character.isLetter(element)) {
                onlyLetters = onlyLetters.append(element);
            }
        }
        return onlyLetters.toString();
    }

    //split a string by key word
    public void keyWordSplitter (String input) {
        if (!delimiter.equals("")) {
            String[] array = input.split(delimiter);
            for (String i: array) {
                System.out.println(i.trim());
            }
        } else {
            System.out.println(input);
        }
    }

    public static void main(String[] args) {
        InputParser inputParser = new InputParser();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        String input = scanner.nextLine();

        System.out.println("Define sign for delimiter (except '.'): ");
        inputParser.delimiter = scanner.nextLine();
        while (inputParser.isNumOfDelimiters(inputParser.delimiter)) {
            System.out.println("Enter only 1 delimiter pls: ");
            inputParser.delimiter = scanner.nextLine();
        }

        //get only characters from the string
        System.out.println("Characters in string are: " + inputParser.characterFinder(input));

        //output strings splitted by keyword
        System.out.println("String splitted by a keyword: ");
        inputParser.keyWordSplitter(input);

        //convert any number into double
        inputParser.toDoubleConverter(input);


        System.out.println("Press 1 to sort to biggest & 2 - to smallest: ");
        int wayOfSorting = scanner.nextInt();
        while (wayOfSorting < 1 || wayOfSorting > 2) {
            inputParser.arraySorter(wayOfSorting);
            wayOfSorting = scanner.nextInt();
        }
        System.out.println("Result: " + inputParser.arraySorter(wayOfSorting).replace("[", "").replace("]", ""));
    }
}
