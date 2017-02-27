package com.chudilka1.app.homework.lesson9;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayFromFileReader {
    private ArrayList<String> array = new ArrayList<>();
    private double[][] arrayOfDoubles;

    //1. reads the file with arrays of numbers, arrays are split by "|", creates arrayList of String arrays
    public ArrayList<String> fileArrayReader(String path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] inputArray = line.split("\\|");
                for (int i = 0; i < inputArray.length; i++) {
                    array.add(inputArray[i]);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }

    //2. casts arrayList into arrays of doubles
    public double[][] stringToDouble() {
        arrayOfDoubles = new double[array.size()][];
        for (int i = 0; i < arrayOfDoubles.length; i++) {
            String element = array.get(i);
            String[] arrayOfElements = element.split(",");
            arrayOfDoubles[i] = new double[arrayOfElements.length];
            for (int j = 0; j < arrayOfElements.length; j++) {
                arrayOfDoubles[i][j] = Double.parseDouble(arrayOfElements[j]);
                System.out.print(arrayOfDoubles[i][j] + " ");
            }
            System.out.println();
        }
        return arrayOfDoubles;
    }

    //3. sorts numbers in array of doubles
    public double[][] arraySorter() {
        for (int i = 0; i < arrayOfDoubles.length; i++) {
            for (int k = 0; k < arrayOfDoubles[i].length - 1; k++) {
                int ind = k;
                for (int j = k + 1; j < arrayOfDoubles[i].length; j++) {
                    if (arrayOfDoubles[i][j] < arrayOfDoubles[i][ind]) {
                        ind = j; //поиск индекса с наименьшим значением
                    }
                }
                if (ind != k) {
                    double biggerValue = arrayOfDoubles[i][k];
                    arrayOfDoubles[i][k] = arrayOfDoubles[i][ind];
                    arrayOfDoubles[i][ind] = biggerValue;
                }
            }
        }
        return arrayOfDoubles;
    }

    //4. writes the arrays into file
    public static void arrayIntoFileWriter(String path, double[][] arrayToBeWritten) {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)));
            for (int i = 0; i < arrayToBeWritten.length; i++) {
                writer.append(Arrays.toString(arrayToBeWritten[i]).replace("[", "").replace("]", ""));
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        ArrayFromFileReader reader = new ArrayFromFileReader();
        //1
        reader.fileArrayReader("/home/alexandr/Desktop/input.txt");

        //2
        reader.stringToDouble();

        //3
        reader.arraySorter();

        //4
        reader.arrayIntoFileWriter("/home/alexandr/Desktop/output.txt", reader.arrayOfDoubles);
    }
}
