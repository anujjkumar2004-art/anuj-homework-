class BubbleSort
{
    public static void main(String[] args)
    {
        int arr[] = {5, 1, 4, 2, 8, 3};
        int passes = 0;
        for (int j= 0; j<arr.length-1; j++)
        {
            passes++;
            for (int i= 0; i<arr.length-j-1; i++)
            {
                if (arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for (int i = 0; i <arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println("Number of Passes: " + passes);
    }
}