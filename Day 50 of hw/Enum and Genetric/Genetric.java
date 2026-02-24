
package genetric;

import java.util.Scanner;

public class Genetric 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Box<Object> box = new Box<>();
        int choice;

        do {
            System.out.println("\n===== GENERIC STORAGE BOX =====");
            System.out.println("1. Store Integer");
            System.out.println("2. Store String");
            System.out.println("3. Display Value");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Integer value: ");
                    int num = sc.nextInt();
                    box.setValue(num);
                    System.out.println("Integer Stored");
                    break;

                case 2:
                    System.out.print("Enter String value: ");
                    String str = sc.next();
                    box.setValue(str);
                    System.out.println("String Stored");
                    break;

                case 3:
                    box.displayValue();
                    break;

                case 4:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);
    }   
}
