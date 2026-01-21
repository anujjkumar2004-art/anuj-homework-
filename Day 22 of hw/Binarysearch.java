class Binarysearch
{
	public static void main(String[] args)
	{
		int arr[] = {2,5,8,12,16,23,38};
		int searchvalue = 16;
		int left = 0;
		int right = arr.length-1;
		int index = -1;
		
		
		while(left <= right)
		{
			int mid = (left + right)/2;
			if(arr[mid] == searchvalue)
			{
				index=mid;
				break;
			}
			else if(arr[mid] > searchvalue)
			{
				left = mid+1;
			}
			else if(arr[mid] < searchvalue)
			{
				left = mid-1;
			}
			mid = (left+right)/2;
		}
		System.out.println("index:" + index);
	}
}