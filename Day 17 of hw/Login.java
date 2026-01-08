import java.util.Scanner;
class Login
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String[] Username = new String[5];
		String[] Password = new String[5];
		
		int choice;
		int index=0;
		
		do
		{
			System.out.println("*******MENU*******");
			System.out.println("1.Registraction");
			System.out.println("2.Login");
			System.out.println("3.Exit");
			System.out.print("Enter your choice:");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					if(index<Username.length)
					{
						System.out.print("Enter Username:");
						Username[index]=sc.next();
						
						System.out.print("Enter Password:");
						Password[index]=sc.next();
						index++;
						System.out.println("Registraction Successfull");
					}
					else
					{
						System.out.println("Correct the Name and Password");
					}
					break;
					
				case 2:
					System.out.print("Enter the Username:");
					String Uname = sc.next();
					System.out.print("Enter the Password:");
					String Pass = sc.next();
					boolean loginSuccess = false;
					
					for(int i=0; i<index; i++)
					{
						if((Username[i].equals(Uname))&&(Password[i].equals(Pass)))
						{
							loginSuccess = true;
							break;
						}
					}
						if(loginSuccess)
						{
							System.out.println("loginSuccessfull");
						}							
						else 
						{
							System.out.println("lnvalid Uname and Pass");
						}
						break;
			    case 3:
					System.out.println("Exit Program");
					break;	
			}
		}while(choice!=3);
	}
}
