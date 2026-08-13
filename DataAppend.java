
import java.io.FileWriter;
import java.io.IOException;


public class DataAppend{
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("info.txt", true);
            writer.write("session:2023-2024");
            writer.close();

            System.out.println(" written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}