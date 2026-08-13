
import java.io.File;
import java.io.IOException;


public class createFile{
public static void main(String[] args) {
    try {
      File file = new File("document.txt") ;
      if(file.createNewFile()){
        System.out.println("file created successfully");
      } else{
        System.out.println("file already exist");
      }
    }catch(IOException e){
        e.printStackTrace();

    }
    

}
}