import java.util.Scanner;
class Railway
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		{
			System.out.print("choose your option:");
			
			int num= sc.nextInt();
			
			switch(num)
			{
				case 1:
				{
					System.out.println("General");
					break;
				}
				case 2:
				{
					System.out.println("Sleeper");
					break;
				}
				case 3:
				{
					System.out.println("Ac 3 Tier");
					break;			
				}
				case 4:
				{
					System.out.println("Ac 2 Tier");
					break;
				}
				case 5:
				{
					System.out.println("First class");
					break;			
				}
				default:
				{
					System.out.println("No classes");
				}
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}