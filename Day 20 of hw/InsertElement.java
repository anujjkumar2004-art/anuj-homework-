class InsertElement
{
	public static void main(String[] args)
	{
		int n=5;
		int arr[] = new int[10];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		int newarr = 25;
		int insert = 3;
		
		for(int i=n; i>=insert; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[insert - 1] = newarr;
		n++;
		
		for(int i=0; i<5; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}