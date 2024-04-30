import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReaderClass {
    public void readFromFile(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}

public class FileReaderApp {
    public static void main(String[] args) {
        FileReaderClass fileReader = new FileReaderClass();
        String fileName = "example.txt"; // Change this to the name of your file

        fileReader.readFromFile(fileName);
    }
}
