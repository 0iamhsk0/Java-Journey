
// import java.io.*;
/* 
public class FileClass {
    public static void main(String[] args) {
        File ref1 = new File("C:\\Users\\Salil\\Desktop\\Java\\UNIT-5\\Codes\\JavaIO");
        System.out.println(ref1.isFile());// It will give false as JavaIO is not a file
        System.out.println(ref1.isDirectory());// It will give true as JavaIO is a folder/or directory
        File ref2 = new File("C:\\Users\\Salil\\Desktop\\Java\\UNIT-5\\Codes\\JavaIO\\abc.txt");
        System.out.println(ref2.exists());
        System.out.println(ref2.getName());
        System.out.println(ref2.getPath());
        File ref3 = new File("C:\\Users\\Salil\\Desktop\\Java\\UNIT-5\\Codes\\JavaIO\\abc2.txt");
        File ref4 = new File("C:\\Users\\Salil\\Desktop\\Java\\UNIT-5\\Codes\\JavaIO\\newname.txt");
        System.out.println(ref3.isHidden());
        System.out.println(ref3.canRead());
        System.out.println(ref3.canWrite());
        File ref5 = new File("abc.txt");
        System.out.println(ref5.getPath());
        System.out.println(ref5.getAbsolutePath());
        System.out.println("Last modified on " + new java.util.Date(ref5.lastModified()));
        System.out.println("Length:" + ref5.length());
        
         * File ref6=new File("abc3.txt");
         * if(ref6.delete())
         * System.out.println("File deleted successfully");
         * else
         * System.out.println("File does not exists");
        
        File x[] = ref1.listFiles();
        for (File var : x)
            System.out.println(var);
        boolean flag = ref5.renameTo(ref4);
        if (flag == true) {
            System.out.println("File Successfully Renamed");
        } else {
            System.out.println("Operation Failed");
        }
    }
}
*/

/*for creating a file:
 * first specifiy the path
 * can be created using FileOutputStream and File classes
 * then create the file object
 * then create the file in the file system in the try and catch blocks
 * open a FileoutputStream to write the data
 * then write the data into the file
 * 
 */
import java.io.*;

public class FileClass{
    public static void main(String[] args){
        String newPath = "example.txt";
        File file = new  File(newPath);  
        //create a file 
        try{
            if(!file.exists()){                       //if file doesn't exist, then create it
                file.createNewFile();
                System.out.println("File is Created!");             
            }else {
                System.out.println("File already exists.");                          
            }
            
            //true means append the data at end of file
            //false means overwrite the existing content of file
            FileOutputStream fop = new FileOutputStream(file,true);        
            byte[] input = "This is the text written to the file".getBytes();    
            fop.write(input);     
            fop.close();                  
        }catch(IOException e){
            e.printStackTrace();
        }              
        }
}

// To read from a file:
/*
 * for reading we use FileInputStream instead of FileOutputStream
 * get the number of bytes present in the file by calling available() method on
 * FileInputStream
 * create an array of that size and read all the contents of the file in one go
 * using read() method
 * print those characters using System.out.print() or any other way you prefer
 

import java.io.*;

class ReadFromFile {
    public static void main(String[] args) throws IOException {
        String path = "example.txt";
        File file = new File(path);
        int size;
        byte[] b;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            size = fis.available();
            b = new byte[size];
            fis.read(b);
            System.out.println("The contents of the file are :");
            System.out.print(new String(b));
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found.");
        } finally {
            if (fis != null) {
                fis.close();
            }
        }
    }
}

*/