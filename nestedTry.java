import java.util.Scanner;

public class nestedTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        try {
            // First inner try: character access
            try {
                System.out.print("Enter index to access character: ");
                int index = sc.nextInt();
               
                System.out.println("Character: " + input.charAt(index));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Error: Invalid index for string!");
            }

            try {
                int number = Integer.parseInt(input);
                System.out.println("Converted integer: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Error: Cannot convert string to integer!");
            }

        } catch (Exception e) {
            System.out.println("Unexpected error occurred!");
        }

        sc.close();
    }
}


