import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class margeFile {
    public static void main(String[] args) {

        try {
            BufferedReader reader1 = new BufferedReader(new FileReader("info.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("helloo.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("file3.txt"));

            String line;

            // Copy contents of file1.txt
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Copy contents of file2.txt
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader1.close();
            reader2.close();
            writer.close();

            System.out.println("Files merged successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}