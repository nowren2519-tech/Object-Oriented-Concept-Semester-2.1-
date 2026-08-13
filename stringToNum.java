
import java.util.Scanner;

public class stringToNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first value: ");
            String str1 = sc.nextLine();
       System.out.print("Enter first value: ");
            String str2 = sc.nextLine();

            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);

            int result = num1/num2;

            System.err.println("Result: " + result);
}

catch(NumberFormatException e){
    System.out.println("Error: Invalid number format! Please enter valid integers.");
}
catch(ArithmeticException e) {
    System.out.println("Error: Cannot divide by zero!");
}
catch(Exception e){
System.out.println("Error: Something went wrong");
}
finally{
    sc.close();
    System.out.println("program finished");
}


    }
}