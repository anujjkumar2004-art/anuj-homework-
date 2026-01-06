import java.util.Scanner;
class City
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row city :");
		String row = sc.nextLine();
		System.out.print("Enter the Column city :");
		String col = sc.nextLine();
		
		String arr[][] = new String[4][3];
		
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = 0;j<arr[i].length;j++)
			{
				System.out.print("Enter the city of "+ i +","+ j +" index :");
				arr[i][j]= sc.nextLine();
			}
		}
		
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = 0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+ "  ");
			}
				System.out.println("");
		}
	}
}