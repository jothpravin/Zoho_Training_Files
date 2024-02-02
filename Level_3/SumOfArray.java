import java.util.Scanner;

public class SumOfArray
{	
	
	public static void main(String args[])
	{
		int ArraySize, sum=0;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = num.nextInt();
		
		int array[] = new int[ArraySize];
		
		for(int row=0;row<ArraySize;row++)
		{	
			array[row]=num.nextInt();
			sum += array[row];
		}
		System.out.println("The sum of array is :"+sum);
		
		
	}
}
