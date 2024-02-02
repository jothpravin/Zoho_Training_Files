import java.util.Scanner;

public class BinarySearch
{
	public static int binarySearch(int []arr, int n)
	{
		int left = 0;
		int right = arr.length-1;
		int mid = 0;
		while(left<=right)
		{
			mid = left+ (right-left)/2;
			if(arr[mid]==n)
				return mid;
			else if(arr[mid]<n)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}
	public static void main(String []args)
	{
		int n, k;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of array :");
		n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements :");

		for(int i=0; i<n; i++)
		{
			arr[i] = s.nextInt();
		}

		System.out.print("Enter the number to search in array :");
		k = s.nextInt();
		
		if(binarySearch(arr, k)>0)
		{
			System.out.println("Number founded at the index of "+binarySearch(arr, k));
		}
		else
		{
			System.out.println("Number dosn't present in the array ");
		}
	}
}
