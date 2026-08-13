import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import  java.io.File;

public class Readfile {
    public static void main(String[] args) {

        try {

            File file = new File("helloo.txt");
            if(file.createNewFile());
            BufferedReader reader = new BufferedReader(new FileReader("helloo.txt"));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}