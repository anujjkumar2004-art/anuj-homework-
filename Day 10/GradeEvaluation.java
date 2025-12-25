import java.util.Scanner;
class GradeEvaluation
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		{
			System.out.print("Choose your Grade:");
			
			char mark=sc.next().charAt(0);
			
			switch(mark)
			{
				case 'A':
				{
					System.out.println("very good");
					break;
				}
				case 'B':
				{
					System.out.println("Good");
					break;
				}
				case 'c':
				{
					System.out.println("not good next typ again");
					break;
				}
				default:
				{
					System.out.println("very poor");
				}
			}
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}