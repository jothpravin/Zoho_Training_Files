import java.util.Scanner;
import java.util.Arrays;

public class MinimumOfGreatest
{
	public static void main(String []args)
	{
		int size,count=0, i=0;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the size of array :");
		size = num.nextInt();
		int arr[] = {2,3,17,1,8,5,11};
		int arr1[] = new int[size];
		
		/*for(int j=0; j<size; j++)
		{
			arr[j] = num.nextInt();
		}*/
		
		arr1 = Arrays.copyOf(arr, size);
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		while(size>count)
		{
			if(arr[count]==arr1[size-1])
			{
				System.out.print(arr[count]+"->  ");
				count++;
			}
			if(arr[count]==arr1[i])
			{
				System.out.print(arr[count]+"->" +arr1[i+1]+" ");
				count++;
				i=0;		
			}
			else
			{
				i++;
			}
		}
		
	}
}
