import java.util.Scanner;
class Trafficlight
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		{
			System.out.print("Choose your month:");
			
			String signal = sc.next();
			
			switch(signal)
			{
				case "Red":
				{
					System.out.println("Stop");
					break;
				}
				case "Yellow":
				{
					System.out.println("get ready");
					break;
				}
				case "Green":
				{
					System.out.println("Go");
					break;			
				}
				default:
				{
					System.out.println("Not go");
				}
			}
		}
	}
}