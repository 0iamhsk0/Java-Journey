import java.io.*;

public class FileReadingExample {
    public static void main(String[] args) {
        try {
            // Create a FileInputStream wrapped with a BufferedInputStream for efficiency
            FileInputStream fileInputStream = new FileInputStream("test.txt");
            // BufferedInputStream bufferedInputStream = new
            // BufferedInputStream(fileInputStream);

            int data;
            while ((data = fileInputStream.read()) != -1) {
                System.out.print((char) data);
            }

            // Close streams
            fileInputStream.close();
            //bufferedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
