package com.chudilka1.app.homework.lesson9;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleReader {
    private String fileName;
    private ArrayList<String> array = new ArrayList<>();

    public String getFileName () {
        return fileName;
    }

    public void setfileName (String fileName) {
        this.fileName = fileName + ".txt";
    }

    //1. adds input to ArrayList untill 'exit' is written
    public ArrayList<String> consoleReader(String input) {
        array.add(input);
        return array;
    }

    //2. saves ArrayList into file
    public void arrayWriter(String path, ArrayList<String> arrayToBeWritten) {
        try {
            path = path.concat(getFileName());
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)));
            for (String i: arrayToBeWritten) {
                writer.append(i.replace("[", "").replace("]", ""));
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");

        //name the file to be saved, file name should consist only of latin letters, numbers, dashes and/or spaces
        boolean flag;
        do {
            System.out.println("Enter the file name to be saved: ");
            String fileName = scanner.nextLine();
            if (fileName.matches("^[ a-zA-Z0-9\\-]+$")) {
                reader.setfileName(fileName);
                flag = false;
            } else {
                System.out.println("Please, enter only latin letters, numbers, dashes and/or spaces\n");
                flag = true;
            }
        } while (flag);

        //enter data or write 'exit' to finish and save file
        System.out.println("Type any text to write in the file. To finish & save file, enter 'exit':");
        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("exit")) {
            reader.consoleReader(input);
            input = scanner.nextLine();
        }
        System.out.println("Please, wait. Entered data is being saved\n");

        //save entered data into file
        String path = "/home/alexandr/Desktop/";
        reader.arrayWriter(path, reader.array);
        System.out.println("File has been saved");
    }
}
