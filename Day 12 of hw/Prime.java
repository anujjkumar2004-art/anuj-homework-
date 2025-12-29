import java.util.Scanner;
class Prime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the values:");
		
		int num = sc.nextInt();
		
		
		if(num<=1)
		{
			System.out.println("The number is not prime");
		}
		else if(num==2 || num==3 || num==5 || num==7)
		{
			System.out.println("The number is prime");
		}
		else if(num%2==0 || num%3==0 || num%5==0 || num%7==0)
		{
			System.out.println("The number is not prime");
		}
		else
		{
			System.out.println("the number is prime");
		}
	}
}	