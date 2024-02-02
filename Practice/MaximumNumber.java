import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximumNumber
{
	public static void main(String []args)
	{
		int size,k;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the size of Array :");
		size = num.nextInt();
		Integer nums[] = new Integer[size];
		
		System.out.print("Enter the Array :");
		for(int i=0; i<size; i++)
		{
			nums[i] = num.nextInt();
		}
		
		System.out.print("Enter the K :");
		k = num.nextInt();
		
		Arrays.sort(nums, Collections.reverseOrder());
		
		for(int i=0; i<size; i++)
		{
			
		}
		
	}
}
