
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class FileOperation{
    public static void main(String [] args) 
    {

        try{
            File file = new File("Operation.txt");

            if(file.createNewFile()){
                System.out.println(" create new file ");
            }else{
                System.out.println("file already exist");
            }

            FileWriter writer = new FileWriter(file);
            writer.write("hello nuri");

            writer.close();
            System.out.println(" file opened and closed successfully");

              if (file.exists()) {
                System.out.println("File exists.");
            }

               System.out.println("File Name: " + file.getName());
               System.out.println("File Size: " + file.length() + " bytes");
                if (file.canWrite()) {
                System.out.println("File is writable.");
            } else {
                System.out.println("File is not writable.");
            }


               if (file.canWrite()) {
                System.out.println("File is writable.");
            } else {
                System.out.println("File is not writable.");
            }
        
                    File newFile = new File("studentData.txt");

            if (file.renameTo(newFile)) {
                System.out.println("File renamed successfully.");
            } else {
                System.out.println("Rename failed.");
            }


        } catch(IOException e){
            e.printStackTrace();
        }

}
}