class Linearsearch
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50};
		int searchvalue = 30;
		int index = -1;
		
		for(int i=0; i<arr.length; i++)
		{
			if(searchvalue == arr[i])
			{
				index = i;
				break;
			}
		}
		if(index!=-1)
		{
			System.out.println("index:" + index);
		}
		else
		{
			System.out.println("Correct taa podu da vennaa");
		}
	}
}