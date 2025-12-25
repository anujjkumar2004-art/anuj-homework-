import java.util.Scanner;
class Vowelorconsonant
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		{
			System.out.print("Choose the letter:");
			
			char letter=sc.next().charAt(0);
			
			switch(letter)
			{
				case'a':
				case'i':
				case'e':
				case'u':
				case'o':
				case'A':
				case'I':
				case'E':
				case'U':
				case'O':
				
				System.out.println("Vowel");
				break;
				default:
				System.out.println("consonant");
				
			}
		}
		
		
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
}