import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        // Create a file and write a line to it
        String filename = "data.txt";
        try {
            // Create a FileWriter and BufferedWriter to write to the file
            FileWriter fileWriter = new FileWriter(filename);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write a line to the file
            String line = "This is a sample line.";
            bufferedWriter.write(line);
            bufferedWriter.newLine(); // Write a new line

            // Close the BufferedWriter
            bufferedWriter.close();

            // Read from the file and print every alternate character
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read the line from the file
            String fileLine = bufferedReader.readLine();

            if (fileLine != null) {
                System.out.println("Original line: " + fileLine);

                // Print every alternate character
                StringBuilder alternateChars = new StringBuilder();
                for (int i = 0; i < fileLine.length(); i += 2) {
                    alternateChars.append(fileLine.charAt(i));
                }

                System.out.println("Alternate characters: " + alternateChars.toString());
            }

            // Close the BufferedReader
            bufferedReader.close();

            // Delete the file (optional)
            File file = new File(filename);
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
