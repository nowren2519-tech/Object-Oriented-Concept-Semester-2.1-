
import java.util.Scanner;




public class SimpleBankingAccount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;

        try {
            System.out.print("Enter withdrawal amount: ");
            int withdrawal = sc.nextInt();

              if (withdrawal < 0) {
                throw new IllegalArgumentException("Withdrawal amount cannot be negative!");
            }

            int remainingBalance = balance - withdrawal;
            System.out.println("Remaining =" +remainingBalance );

            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt();

        
            int result = remainingBalance / divisor;
            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

    catch(IllegalArgumentException e){
        System.out.println("error: "+ e.getMessage());
    }
       catch (Exception e) {
            System.out.println("Error: Something went wrong!");
        }
        finally {
            sc.close();
            System.out.println("Program finished.");

        }

    }
}
