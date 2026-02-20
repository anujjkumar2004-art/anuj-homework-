
package acer;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassMain 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        ArrayList<Acer> list = new ArrayList<>();

        int choice;

        while (true) 
        {
            System.out.println("\n1 for Entry 2 for Search 3 for Exit");
            choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) 
            {
                System.out.println("Enter the model of laptop");
                String model = sc.nextLine();

                System.out.println("Color of the laptop");
                String colour = sc.nextLine();

                System.out.println("It is RGB keyboard (true/false)");
                boolean rgb = sc.nextBoolean();
                sc.nextLine();

                System.out.println("Processor");
                String processor = sc.nextLine();

                System.out.println("Price");
                double price = sc.nextDouble();

                Acer a = new Acer(model, colour, rgb, processor, price);
                list.add(a);

                System.out.println("Laptop details added successfully");

            } 
            else if (choice == 2) 
            {
                System.out.println("Enter model to search");
                String searchModel = sc.nextLine();

                boolean found = false;
                for (Acer a : list) 
                {
                    if (a.model.equalsIgnoreCase(searchModel)) 
                    {
                        a.display();
                        found = true;
                        break;
                    }
                }

                if (!found) 
                {
                    System.out.println("Laptop model not found");
                }
            } 
            else if (choice == 3) 
            {
                break;
            } 
            else 
            {
                System.out.println("Invalid choice");
            }
        }
    }
}

