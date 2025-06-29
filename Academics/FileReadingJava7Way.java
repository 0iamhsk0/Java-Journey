//package filepackage;

import java.io.*;

public class FileReadingJava7Way {
    public static void main(String[] args) {
        //File file = new File("Data.txt");
        try (BufferedReader fis = new BufferedReader(new FileReader("test.txt"))) {
            int content;
            while ((content = fis.read()) != -1) {
                // convert to char and display it
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

