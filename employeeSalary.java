import java.util.Scanner;

public class employeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] salaries = new int[5];

        try {
            System.out.print("Enter salary (as string): ");
            String salaryStr = sc.nextLine();

            // First inner try: parsing string to integer
            try {
                int salary = Integer.parseInt(salaryStr);

                // Second inner try: storing in array
                try {
                    System.out.print("Enter index (0-4): ");
                    int index = sc.nextInt();
                    salaries[index] = salary;

                    System.out.print("Enter number of months: ");
                    int months = sc.nextInt();

                    // Third inner try: division
                    try {
                        int monthlySalary = (salary * 12) / months;
                        System.out.println("Monthly Salary: " + monthlySalary);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: Months cannot be zero!");
                    }

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Error: Invalid index! Must be between 0 and 4.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Salary must be a valid number!");
            }

        } catch (Exception e) {
            // Outer try with multiple catch
            System.out.println("Unexpected error occurred!");
        }

        sc.close();
    }
}
