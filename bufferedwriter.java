import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class bufferedwriter{
    public static void main(String[] args){ 
        try{ 
            BufferedWriter writer = new BufferedWriter( new FileWriter("lines.txt"));
            for(int i = 1; i<=10; i++){
                writer.write("This, is, line " + i);
                writer.newLine();
            }
                writer.close();
            } catch(IOException e){
            e.printStackTrace();
            }
        }
    }


