import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StudentRecord {
    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"));

            writer.write("101, Rahim, 3.75");
            writer.newLine();

            writer.write("102, Karim, 3.90");
            writer.newLine();

            writer.write("103, Suma, 3.60");
            writer.newLine();

            writer.write("104, Nila, 3.85");
            writer.newLine();

            writer.write("105, Rafi, 3.95");
            writer.newLine();

            writer.close();

            System.out.println("Student records written successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}