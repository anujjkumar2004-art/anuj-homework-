import java.util.Scanner;
class Areas
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your option");
		int num=sc.nextInt();
		switch(num)
		{
			case 1:
			System.out.println("enter radius of the circle");
			double radius =sc.nextDouble();
			double formulac=3.14*radius*radius;
			System.out.println("area of circle:"+formulac);
			break;
			case 2:
			System.out.println("enter the side of the square");
			double side=sc.nextDouble();
			double formulas=side*side;
			System.out.println("area of square is:"+formulas);
			break;
			case 3:
			System.out.println("enter the lenght and witdth of rectangle");
			double l=sc.nextDouble();
			double w=sc.nextDouble();
			double formular=l*w;
			System.out.println("area of rectangle is :"+formular);
			break;
			case 4:
			System.out.println("enter breath and height of the triangle");
			double b=sc.nextDouble();
			double h=sc.nextDouble();
			double formulat=0.5*b*h;
			System.out.println("area of triangle is:"+formulat);
			break;
			default:
			System.out.println("invalid options");
			
			
			
		}
	}
}