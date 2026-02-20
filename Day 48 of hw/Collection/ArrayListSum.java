
package arraylistsum;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSum 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();

        int choice;

        while (true) 
        {
            System.out.println("1 for Entry 2 for Exit");
            choice = sc.nextInt();

            if (choice == 1) 
            {
                System.out.print("Enter the value: ");
                int value = sc.nextInt();
                list.add(value);
            } 
            else if (choice == 2) 
            {
                break;
            } 
            else 
            {
                System.out.println("Invalid choice");
            }
        }

        int sum = 0;
        for (int num : list) 
        {
            sum = sum + num;
        }

        System.out.println("Sum of the values you have entered " + sum);
    }
}
