import java.util.Scanner;
class Studentlist 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of students: ");
        int n = sc.nextInt();
        String[] students = new String[n];
        int Num;
        int in=0;

        do {
            System.out.println("1. Add Student");
            System.out.println("2. see Student List");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            Num= sc.nextInt();

            switch (Num) {

                case 1:
                    if (in<n) {
                        System.out.print("Enter student name: ");
                        students[in] = sc.next();
                        in++;
                    } else {
                        System.out.println("Student list is full");
                    }
                    break;

                case 2:
                    System.out.println("Student List:");
                    for (int i = 0; i<in; i++) {
                        System.out.println((i + 1) + ". " + students[i]);
                    }
                    break;

                case 3:
                    System.out.println("Exit program");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (Num!= 3);
    }
}