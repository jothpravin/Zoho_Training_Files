import java.util.Scanner;
import java.util.Arrays;

public class IndexOfElement
{
	public static int SearchElement(int [] arr, int k)
	{
		int left =0;
		int right = arr.length-1;
		while(right>=left)
		{
			int mid = left + (right-left)/2;
			
			if(arr[mid]==k)
				return mid;
			else if(arr[mid]<k)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}
	public static void main(String []args)
	{
		int n,k;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Size of the array :");
		n = num.nextInt();
		System.out.print("Enter the Number to find index :");
		k = num.nextInt();
		
		int numb[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			numb[i] = num.nextInt();
		}
		Arrays.sort(numb);
		System.out.println(SearchElement(numb, k));
	}
}
