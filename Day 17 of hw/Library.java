import java.util.Scanner;
class Library
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total no_of_books: ");
        int no_of_Books = sc.nextInt();
        String[] Books = new String[no_of_Books];
        int choice;
        int index=0;

        do 
		{
            System.out.println("1. Add Book names");
            System.out.println("2. see the Book list");
			System.out.println("3. Search the Book id");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice= sc.nextInt();

            switch (choice) 
			{

                case 1:
                    if (index<Books.length) 
					{
                        System.out.print("Enter Book name: ");
                        Books[index] = sc.next();
                        index++;
                    } else {
                        System.out.println("Books list is full");
                    }
                    break;

                case 2:
                    System.out.println("Books List:");
                    for (int i = 0; i<index; i++) {
                        System.out.println((i + 1) + ". " + Books[i]);
                    }
                    break;

                case 3:
                    System.out.print("Book id:");
					int searchid = sc.nextInt();
					boolean found = false;
					for(int i=0; i<index; i++)
					{
						if(no_of_Books == searchid)
						{
							System.out.println("Book found:" + Books[i]);
							found = true;
							break;
						}
					}
                default:
                    System.out.println("Exit program");
            }
        } while (choice!= 4);
    }
}