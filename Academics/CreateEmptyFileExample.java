import java.io.File;
import java.io.IOException;

public class CreateEmptyFileExample {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "C:\\Users\\Hemant\\OneDrive\\Desktop\\B.tech\\FOURTH SEM\\JAVA\\rambo.txt";
        
        /*  or we can give the path then writing the file name seperately by:
         * String filename = "my_custom_file.txt";
         * File file = new File(directoryPath + filename);
        */


        // Create a File object representing the file
        File file = new File(filePath);

        try {
            // Attempt to create the empty file
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
 
/*
 * so main steps for creation of an empty file in Java
 * 1 specify the path
 * 2 create the file object and pass the filepath into it
 * 3 then using try catch block to 
 */