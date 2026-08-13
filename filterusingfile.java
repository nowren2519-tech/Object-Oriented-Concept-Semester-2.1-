import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filterusingfile {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("document.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("even.txt"));

            String line;

            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line);

                if (num % 2 == 0) {
                    writer.write(line);
                    writer.newLine();
                }
            }

            reader.close();
            writer.close();

            System.out.println("Even numbers written successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}