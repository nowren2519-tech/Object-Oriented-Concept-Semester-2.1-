import java.util.Scanner;
public class fileNameLength{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{

            System.out.println("enter a String");
            String str = sc.nextLine();

            System.out.println("Enter index: ");
            int index = sc.nextInt();

             char ch = str.charAt(index);
            System.out.println("Character at index " + index + " = " + ch);

            int num = Integer.parseInt(str);

            System.out.println("Double value = " + (num * 2));   
        } 


        catch(NullPointerException e){
            System.out.println("Error: String is null or empty!");
        }


      catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range!");
        }

        catch(NumberFormatException e){
            System.out.println("Error: Cannot convert string to number!");
        }

        catch(Exception e){
            System.out.println("Error: Something went wrong!");
        }

        finally{
            sc.close();
            System.out.println("program finished");
        }
    }
}