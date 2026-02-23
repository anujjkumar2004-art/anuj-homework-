package studentdetails;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentDetails 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        Set<Integer> s = new HashSet();
        Map<Integer, String> m = new HashMap();
        
        int choice;

        do 
        {
            System.out.println("\n*****STUDENT MANAGEMENT MENU*****");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Display Total Student Count");
            System.out.println("6. Exit");
            System.out.println("***************************");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            
            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 

                    if (s.contains(id)) 
                    {
                        System.out.println("Student ID already exists. Duplicate not allowed!");
                    } 
                    else 
                    {
                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        s.add(id);
                        m.put(id, name);
                        System.out.println("Student added successfully!");
                    }
                    break;

                case 2: 
                    System.out.print("Enter Student ID to remove: ");
                    int removeId = sc.nextInt();

                    if (s.contains(removeId)) 
                    {
                        s.remove(removeId);
                        m.remove(removeId);
                        System.out.println("Student removed successfully!");
                    } 
                    else 
                    {
                        System.out.println("Student ID not found!");
                    }
                    break;

                case 3: 
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();

                    if (m.containsKey(searchId)) 
                    {
                        System.out.println("Student Name: " + m.get(searchId));
                    } 
                    else 
                    {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    if (m.isEmpty()) 
                    {
                        System.out.println("No students to display.");    
                    } 
                    else 
                    {
                        System.out.println("\n--- Student List ---");
                        for (Map.Entry<Integer, String> entry : m.entrySet()) {
                            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
                        }
                    }
                    break;

                case 5: 
                    System.out.println("Total Students: " + s.size());
                    break;

                case 6:
                    System.out.println("Exiting program..!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }while(choice!=6);
    
    }
}
