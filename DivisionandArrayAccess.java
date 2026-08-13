import java.util.Scanner;
public class DivisionandArrayAccess{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

     try{
        System.out.print("enter first value");
        int num1 = sc.nextInt();     

         System.out.print("enter second value");
        int num2 = sc.nextInt();  

        int result = num1/num2;

        int[] arr = new int[3];

        System.out.print("enter index(o-2)");
        int index = sc.nextInt();

        arr[index] = result;
               System.out.println("Result stored successfully!");
            System.out.println("arr[" + index + "] = " + arr[index]);
        }

        catch(ArithmeticException e){
             System.out.println("Error: Cannot divide by zero!");
        }
       catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        }
      catch(Exception e){
            System.out.println("Error: Invalid input type! Please enter integers only.");
        }
      
        sc.close();


    }
    }
