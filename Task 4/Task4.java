import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {
        String fileName = "example.txt"; // Change this to your file's name or path

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            System.out.println("Contents of the file '" + fileName + "':\n");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            System.out.println("Error: " + e.getMessage());
        }
    }
}
