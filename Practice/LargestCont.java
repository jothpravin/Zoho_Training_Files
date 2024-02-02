import java.util.Scanner;
import java.util.Arrays;

public class LargestCont
{
	public static void main(String []args)
	{
		int size;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the size of array :");
		size = num.nextInt();
		int arr[] = new int[size];
		int arr1[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			arr[i] = num.nextInt();
		}
		int sum=0;
		int max=0;
		int m=0;
		for(int i=0; i<size; i++)
		{
			if(m==0)
			{
				Arrays.fill(arr1, 0);
			}
			if(arr[i]>=0)
			{
				sum += arr[i];
				arr1[m++] = arr[i];
			}
			else
			{
				if(max<sum)
				{
					max = sum;
					System.out.println(Arrays.toString(arr1));
				}
				m=0;
				sum=0;
			}
		}
		System.out.println("Largest Contiguous sum: "+max);
		System.out.print("Elements are: ");
		for(int i : arr1)
		{
			if(i!=0)
			System.out.print(i+" ");
		}
	}
}
