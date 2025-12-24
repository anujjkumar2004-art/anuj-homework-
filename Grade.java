class Grade
{
	public static void main(String[] args)
	{
		int mark =90;
		
		if((mark>=70)&&(mark<=95))
		{
			System.out.println("A Grade");
		}
		else if((mark>=70)&&(mark<80))
		{
			System.out.println("B Grade");		
		}
		else if((mark>=35)&&(mark<50))
		{
			System.out.println("C Grade");		
		}
		else if((mark<35)&&(mark>=0))
		{
			System.out.println("D Grade");		
		}
	}
}