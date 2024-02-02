public class BinarySearch
{
	public static int binarySearch(int arr[], int n)
	{
		int right = arr.length-1;
		int left = 0;
		int mid = 0;
		while(left<=right)
		{
			mid = (right+left)/2;
			if(arr[mid]==n)
			{
				return mid;
			}
			else if(arr[mid]<n)
			{	
				left = mid + 1;
			}
			else
			{
				right = mid - 1;
			}
		}
		return -1;
		
	}
	public static void main(String[] args)
	{
		int []arr = new int[]{1,2,3,4,5,6,7,8};
		int index = binarySearch(arr, 1);
		System.out.println(index);
	}
}
