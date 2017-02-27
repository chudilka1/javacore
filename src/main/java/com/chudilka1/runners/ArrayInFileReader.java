package com.chudilka1.runners;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArrayInFileReader {
    private ArrayList<String> arrOfStrings = new ArrayList<>();
    public List<List<String>> arrOfElements = new ArrayList<List<String>>();

    //1. reads the file with arrays of numbers, arrays are split by "|", creates arrayList of String arrays
    public ArrayList<String> fileArrayReader(String path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] inputArray = line.split("\\|");
                for (int i = 0; i < inputArray.length; i++) {
                    arrOfStrings.add(inputArray[i]);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrOfStrings;
    }

    //2. casts arrayList into arrays of doubles
    public List<List<String>> stringToElements() {
        int k = 0;
        for (String i: arrOfStrings) {
            //add row
            List<String> list = new ArrayList<String>();
            arrOfElements.add(list);
            String[] elements = i.split(",");

            for (int j = 0; j < elements.length; j++) {
                //add column (and all elements from string in arrOfStrings)
                list.add(elements[j]);
                System.out.print(arrOfElements.get(k).get(j) + " ");
            }
            k ++;
            System.out.println();
        }
        return arrOfElements;
    }

    public static void main(String[] args) {
        ArrayInFileReader reader = new ArrayInFileReader();
        reader.fileArrayReader("D:\\Dropbox\\Documents\\Books\\QA\\QA_automation\\GitHub\\javacore\\src\\test\\resources\\charToStringTestData(lesson7).csv");
        reader.stringToElements();
        System.out.println(reader.arrOfElements);
    }
}
