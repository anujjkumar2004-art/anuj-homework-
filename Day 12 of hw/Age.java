import java.util.Scanner;
class Age
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Select the age:");
		
		int a = sc.nextInt();
		
		
		if(a<=13)
		{
			System.out.println("child");
		}
		else if(a>13  && a<=19)
		{
			System.out.println("Teenager");
		}
		else if(a>20 && a<=59)
		{
			System.out.println("Adult");
		}
		else
		{
			System.out.println("Senior");
		}
	}
}