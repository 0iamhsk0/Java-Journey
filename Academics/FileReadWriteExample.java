import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String filename = "test.txt";
        String content = "This line will be written in the file.";

        // Writing to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
            System.out.println("Successfully wrote to file: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("Reading from file: " + filename);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
