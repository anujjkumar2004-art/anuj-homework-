
package studentmarkssystem;
import java.util.Scanner;

class StudentMarksSystem 
{

    static int marks = -1; 
    
    public static void enterMarks(int m) 
    {
        if (m < 0 || m > 100) 
        {
            throw new IllegalArgumentException("Marks must be between 0 and 100!");
        }
        marks = m;
        System.out.println("Marks entered successfully.");
    }

    public static void displayMarks() 
    {
        if (marks == -1) 
        {
            System.out.println("No marks entered yet.");
        } else 
        {
            System.out.println("Student Marks: " + marks);
        }
    }

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n*****STUDENT MARKS MENU*****");
            System.out.println("1. Enter Marks");
            System.out.println("2. Display Marks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            try 
            {
                switch (choice) 
                {

                    case 1:
                        System.out.print("Enter student marks (0-100): ");
                        int m = sc.nextInt();
                        enterMarks(m);
                        break;

                    case 2:
                        displayMarks();
                        break;

                    case 3:
                        System.out.println("Exit...!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } 
            catch (IllegalArgumentException e) 
            {
                System.out.println("Exception: " + e.getMessage());
            }

        } while (choice != 3);
    }
}
