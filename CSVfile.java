import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVfile {
    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("students.csv"));

            writer.write("ID,Name,CGPA");
            writer.newLine();

            writer.write("101,Ali,3.75");
            writer.newLine();

            writer.write("102,Sara,3.90");
            writer.newLine();

            writer.close();

            System.out.println("CSV file created successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}