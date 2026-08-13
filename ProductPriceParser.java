import java.util.Scanner;

public class ProductPriceParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] prices = new int[5];

        try {
           
            System.out.print("Enter price (as string): ");
            String priceStr = sc.nextLine();

            int price = Integer.parseInt(priceStr);

            System.out.print("Enter index (0-4): ");
            int index = sc.nextInt();

           
            prices[index] = price;

            int result = 1000 / price;
            System.out.println("Result: " + result);
        }

        
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index!");
        }

     
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        finally {
            sc.close();
            System.out.println("Program finished.");
        }
    }
}
