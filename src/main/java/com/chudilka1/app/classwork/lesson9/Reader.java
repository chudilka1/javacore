package com.chudilka1.app.classwork.lesson9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    //try/catch/final exception
    public static void anyFileReader(String path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("THIS IS SUB-EXCEPTION (in the hierarchy of exceptions)");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("THIS IS MAIN EXCEPTION");
            e.printStackTrace();
        } finally {
            System.out.println("IT IS OPTIONAL. Here can be any message, that will be displayed after running, even if there are no exceptions");
        }
    }

    //throws exception. Важно или же в одном из следующих методах прописать try/catch, или же в мейне прописать throws 'exception'
    public static void readTheFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();
    }

    public static void main(String[] args) throws IOException {
       anyFileReader("C:\\Users\\User\\Desktop\\array.txt");
       readTheFile("C:\\Users\\User\\Desktop\\array.txt"); //для этого метода прописан trows IOException
    }
}
