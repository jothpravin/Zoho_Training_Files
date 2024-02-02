import java.util.Scanner;

public class SumOfArrays
{
	public static void main(String []args)
	{
		int ArraySize, sum=0;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the ArraySize:");
		ArraySize = num.nextInt();
		
		int Numbers[] = new int[ArraySize];
		for(int i=0; i<ArraySize; i++)
		{
			Numbers[i] = num.nextInt();
			sum += Numbers[i];
			
		}
		
		System.out.println("The Sum of all numbers in the array :"+sum);
		
		
	}
}
