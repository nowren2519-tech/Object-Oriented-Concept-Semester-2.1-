import java.util.Scanner;

public class StringToNumber{
    public static void main(String[] args) {
                 Scanner sc = new Scanner(System.in);
        try {
          
            System.out.println("first string: ");
            String str1 = sc.nextLine();

            System.out.println("2nd string: ");
            String str2 = sc.nextLine();


            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);

            int result = num1 / num2;

            System.out.println("Result = " + result);

        }   catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }

        sc.close();
    }
}