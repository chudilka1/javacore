package com.chudilka1.app.homework.lesson9;

import java.io.*;
import java.util.ArrayList;

public class PalindromeFromFileReader {
    private ArrayList<String> array = new ArrayList<>();
    private ArrayList<String> resultsArray = new ArrayList<>();
    private final String PAL = " - this line is a Palindrome. The word/sentence can be read backwards.";
    private final String NOTPAL = " - this line is NOT a Palindrome. The word/sentence CANNOT be read backwards.";

    //1. file reader
    public ArrayList<String> fileArrayReader(String path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                array.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }

    //2. checks whether a line from a file is palindrome or not
    public ArrayList<String> palindromeChecker(){
        for (int i = 0; i < array.size(); i++) {
            String line = array.get(i).replaceAll("\\s+","");
            String revertedInput = new StringBuilder(array.get(i).replaceAll("\\s+","")).reverse().toString();
            if (line.equalsIgnoreCase(revertedInput)) {
                resultsArray.add(array.get(i) + PAL);
            } else {
                resultsArray.add(array.get(i) + NOTPAL);
            }
        }
        return resultsArray;
    }

    //3. writes resultsArray into file
    public static void arrayIntoFileWriter(String path, ArrayList<String> results) {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)));
            for (int i = 0; i < results.size(); i++) {
                writer.append(results.get(i).replace("[", "").replace("]", ""));
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        PalindromeFromFileReader palindrome = new PalindromeFromFileReader();

        //1.
        palindrome.fileArrayReader("/home/alexandr/Desktop/input1.txt");

        //2.
        palindrome.palindromeChecker();

        //3.
        palindrome.arrayIntoFileWriter("/home/alexandr/Desktop/output1.txt", palindrome.resultsArray);
    }
}
