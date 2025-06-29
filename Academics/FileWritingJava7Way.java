//package filepackage;

import java.io.*;

public class FileWritingJava7Way {
    public static void main(String[] args) {
        String s = " This line will be written in File";
        System.out.println("Writing to File Data.txt: " + s);
        try (BufferedWriter bWriter = new BufferedWriter(new FileWriter("test.txt"))) {
            bWriter.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


 