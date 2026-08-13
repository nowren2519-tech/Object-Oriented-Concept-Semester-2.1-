import java.io.FileWriter;
import java.io.IOException;
public class writeInFile{
public static void main(String[] args) {
    try {
       FileWriter writer = new FileWriter("info.txt");
       writer.write("Name: nowren akter\n");
       writer.write("department: IIT\n");
       writer.write("University: NSTU\n");

       writer.close();
       System.out.println("data written successsfully");
    }catch(IOException e){
        System.out.println("Error creating in file");
        e.printStackTrace();
    }
    
}
}