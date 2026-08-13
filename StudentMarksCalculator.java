
import java.util.*;


public class StudentMarksCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = {80, 76, 85, 77, 90};
    try{
        System.out.println("Enter index(0-4)");
        int index = sc.nextInt();

         System.out.println("Marks: " + marks[index]);

          System.out.print("Enter number to divide the mark: ");
          int divisor = sc.nextInt();

          int result = marks[index]/divisor;
           System.out.println("Result after division: " + result);
    }

    catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Error: Invalid index! Please enter between 0 and 4.");
    }

    catch(ArithmeticException e){
        System.out.println("Error: Cannot divide by zero!");
    }

    catch(InputMismatchException e){
        System.out.println("Error: Invalid input! Please enter integers only.");
    }

        finally {
            sc.close();
            System.out.println("Program finished.");
        }
    }
}