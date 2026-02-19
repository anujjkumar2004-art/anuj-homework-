
package institution;

import java.util.Scanner;

public class Institution
{
    String institutionName = "Magizhchi institution";
    Student student;

    class Student
    {
        String StudentName;
        int rollno;
        int Marks[];
        double average;
        String grade;
        
        void addStudent(String name,int roll)
        {
            StudentName = name;
            rollno = roll;
        }
        
        void addMarks(int subjectCount, Scanner sc)
        {
            Marks = new int[subjectCount];
            
            System.out.println("Enter your marks:");
            for (int i = 0; i < subjectCount; i++) 
            {
                Marks[i]=sc.nextInt();
            }
        }
        
        void calculateGrade()
        {
            int total = 0;
            for(int mark : Marks)
            {
                total += mark;
            }
            average = (double) total/Marks.length;
            
            if(average >=90)
            {
                grade = "A";
            }
            else if(average >=75)
            {
                grade = "B";
            }
            else if(average >=50)
            {
                grade = "c";
            }
            else
            {
                grade = "Fail";
            }
        }
        
        void display()
        {
            System.out.println("\nInstitution Name:" + institutionName);
            System.out.println("Student Name:" + StudentName);
            System.out.println("Roll No:" + rollno);
            System.out.print("Marks:");
            for (int mark : Marks) 
            {
                System.out.println(mark +" ");
            }
            System.out.println("\nAverage:"+average);
            System.out.println("\nGrade:" + grade);
        }
    }
}
