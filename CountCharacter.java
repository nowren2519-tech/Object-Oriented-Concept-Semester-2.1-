import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class CountCharacter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String w = sc.nextLine();
        try {
            FileWriter writer = new FileWriter("text.txt");
            writer.write(w);
            writer.close();

            System.out.println("data written.\n");
            System.out.println("text length: "+ w.length());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}