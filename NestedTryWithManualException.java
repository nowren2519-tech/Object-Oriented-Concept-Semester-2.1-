
import java.util.InputMismatchException;
import java.util.Scanner;


public class NestedTryWithManualException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        System.out.println("enter a number: ");
        int number = sc.nextInt();

        try {
            if(age<18){
                throw new IllegalArgumentException("age cannot be less than 18");

            }
        } catch (IllegalArgumentException e) {
            System.out.println("error: " + e.getMessage());
        }

        try {
            int result = 1000/number;
            System.out.println("After divide 1000 with number " + number + " result: " + result);
        } catch (ArithmeticException e) {
        } catch(InputMismatchException e){
            System.out.println(" error: " + e.getMessage());

        }
    }
}