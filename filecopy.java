import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filecopy{
    public static void main(String[] args) {
        try{
          BufferedReader reader = new BufferedReader(new FileReader("info.txt"));
          BufferedWriter writer = new BufferedWriter(new FileWriter("destination.txt"));
          String line;

          while((line = reader.readLine())!= null){
            writer.write(line);
            writer.newLine();
          }
             reader.close();
            writer.close();

              System.out.println("File copied successfully.");

          } catch(IOException e){
            e.printStackTrace();
          }
    }
}