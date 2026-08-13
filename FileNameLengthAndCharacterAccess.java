
import java.util.Scanner;


public class FileNameLengthAndCharacterAccess{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("enter a string: ");
            String str1 = sc.nextLine();

            if(str1.equalsIgnoreCase("null")){
            str1 = null;
            }
            System.out.println("enter index: ");
            int index = sc.nextInt();
            System.out.println("Character: " + str1.charAt(index));
       
            int num = Integer.parseInt(str1);

            System.out.println("Double Value = " + (num * 2));
        }

        catch (NullPointerException e) {
            System.out.println("Error: String is null!");
        }

        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index!");
        }

        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        }

        sc.close();
    }
}

  