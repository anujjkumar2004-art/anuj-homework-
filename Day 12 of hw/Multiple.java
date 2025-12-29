import java.util.Scanner;
class Multiple
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value:");
		
		int mul=sc.nextInt();
		
		if(mul%3==0 && mul%7==0)
		{
			System.out.println("Multiple of 3 and 7");
		}
		else if(mul%3==0)
		{
			System.out.println("Multiple of 3");
		}
		else if(mul%7==0)
		{
			System.out.println("Multiple of 7");
		}
		else
		{
			System.out.println(" Not a multiple of 3 or 7");
		}
	}
}	