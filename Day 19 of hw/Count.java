import java.util.Scanner;
class Count
{
	Scanner sc = new Scanner(System.in);
	int anuj[] = new int[10];
	int choice;
	
	void Menu()
	{
	do
	{
		System.out.println("\n******MENU*******");
		System.out.println("1.Enter the number");
		System.out.println("2.Display the number");
		System.out.println("3.Count Positive number");
		System.out.println("4.Count Negative number");
		System.out.println("5.Exit");
		System.out.print("Enter your choice:");
		choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
			{
				System.out.println("Enter the 10 number");
				Enternum();
				break;
			}
			case 2:
			{
				System.out.println("Display the number");
				Displaynum();
				break;
			}
			case 3:
			{
				System.out.print("Count Positive number");
				Posnum();
				break;
			}
			case 4:
			{
				System.out.print("Count Nagative number");
				Naganum();
				break;
			}
			case 5:
			{
				System.out.print("Count Zeros");
				zeronum();
				break;
			}
			case 6:
			{
				System.out.println("Exit the program...!");
				break;
			}
		}
	}while(choice!=6);
	}
	
	void Enternum()
	{
		for(int i=0; i<10; i++)
		{
			anuj[i] = sc.nextInt();
		}
	}
	
	void Displaynum()
	{
		for(int i=0; i<10; i++)
		{
			System.out.print(anuj[i]);
		}
	}
	void Posnum()
	{
		int count = 0;
		for(int i=0; i<10; i++)
		{
			if(anuj[i]>0)
				count++;
		}
		System.out.print(":"+count);
		
	}
	void Naganum()
	{
		int count = 0;
		for(int i=0; i<10; i++)
		{
			if(anuj[i]<0)
				count++;
		}
		System.out.print(":"+count);
	}
	void zeronum()
	{
		int count = 0;
		for(int i=0; i<10; i++)
		{
			if(anuj[i]==0)
				count++;
		}
		System.out.print(":"+count);
	}
	
	
	public static void main(String[] args)
	{
		Count anu = new Count();
		anu.Menu();
	}
	
	
}