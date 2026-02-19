
package institution;

import java.util.Scanner;

public class AcademicMain 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Institution ins = new Institution();
        Institution.Student student = ins.new Student();

        int choice;
        int subjectCount = 0;

        do {
            System.out.println("\n*****MENU*****");
            System.out.println("1. Add Student");
            System.out.println("2. Add Marks");
            System.out.println("3. Calculate Grade");
            System.out.println("4. Display Student Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) 
            {

                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();

                    student.addStudent(name, roll);
                    break;

                case 2:
                    System.out.print("Enter Number of Subjects: ");
                    subjectCount = sc.nextInt();

                    student.addMarks(subjectCount, sc);
                    break;

                case 3:
                    student.calculateGrade();
                    System.out.println("Grade Calculated Successfully!");
                    break;

                case 4:
                    student.display();
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);
    }
}
