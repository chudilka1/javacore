package com.chudilka1.app.classwork.lesson9;

import java.io.*;

public class WriterToFile {

    //1. Writes strings to file
    public static void toFileWriter () throws IOException {
        String firstLine = "The first line";
        String secondLine = "The second line";
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\User\\Desktop\\input.txt")));
        writer.append(firstLine);
        writer.newLine();
        writer.append(secondLine);
        writer.close();
    }

    //2. Reads the file with a string & check whether it is a palindrome
    public boolean isPalindromeInFile (String path) throws IOException {
        String pal = "Your input is Palindrome. The word/sentence can be read backwards.";
        String notpal = "Your input is NOT Palindrome. The word/sentence CANNOT be read backwards.";
        String input = "";

        //reading the file
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = reader.readLine()) != null){
            input = line;
            System.out.println("The sentence/word in the file --> " + line);
        }
        reader.close();

        //checking whether a line is a palindrome and writing it to a file
        input = input.replaceAll("\\s+","");
        String revertedInput = new StringBuilder(input).reverse().toString();
        if (input.equalsIgnoreCase(revertedInput)) {
            System.out.println(pal);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\User\\Desktop\\output.txt")));
            writer.append(input);
            writer.newLine();
            writer.append(pal);
            writer.close();
            return true;
        } else {
            System.out.println(notpal);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\User\\Desktop\\output.txt")));
            writer.append(input);
            writer.newLine();
            writer.append(notpal);
            writer.close();
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        //1. Write string to file
        toFileWriter();

        //2. Read the file and check whether the string is a palindrome
        WriterToFile writerToFile = new WriterToFile();
        writerToFile.isPalindromeInFile("C:\\Users\\User\\Desktop\\input.txt");
    }
}
