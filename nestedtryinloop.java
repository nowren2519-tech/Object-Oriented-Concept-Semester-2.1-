import java.util.Scanner;

public class nestedtryinloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        for (int i = 1; i <= 3; i++) {
            System.out.println("Iteration " + i);

            try {
                System.out.print("Enter array index: ");
                int index = sc.nextInt();

                try {
                    int value = arr[index];

                    System.out.print("Enter divisor: ");
                    int divisor = sc.nextInt();
                    
           
                    try {
                        int result = value / divisor;
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: Division by zero!");
                    }

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Error: Invalid array index!");
                }

            } catch (Exception e) {
                System.out.println("Unexpected input error!");
                sc.nextLine(); 
            }
        }

        sc.close();
    }
}
