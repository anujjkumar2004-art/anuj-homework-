
package pkgenum;

import java.util.Scanner;

public class Enum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        String signal;

        do {
            System.out.println("\n===== TRAFFIC SIGNAL SYSTEM =====");
            System.out.println("1. Show Signal Meaning");
            System.out.println("2. Check Stop or Go");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1 || choice == 2) 
            {
                System.out.print("Enter Signal (RED / YELLOW / GREEN): ");
                signal = sc.next().toUpperCase();

                switch (signal) 
                {

                    case "RED":
                        if (choice == 1)
                            System.out.println("RED Signal → Stop");
                        else
                            System.out.println("STOP");
                        break;

                    case "YELLOW":
                        if (choice == 1)
                            System.out.println("YELLOW Signal → Ready / Slow Down");
                        else
                            System.out.println("STOP");
                        break;

                    case "GREEN":
                        if (choice == 1)
                            System.out.println("GREEN Signal → Go");
                        else
                            System.out.println("GO");
                        break;

                    default:
                        System.out.println("Invalid Signal!");
                }
            }
        } while (choice != 3);
    }
}
    
