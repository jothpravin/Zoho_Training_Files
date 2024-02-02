import java.util.Scanner;

public class AverageOfArray
{	
	
	public static void main(String args[])
	{
		int ArraySize, sum=0;
		float Average;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = num.nextInt();
		
		int array[] = new int[ArraySize];
		
		for(int row=0;row<ArraySize;row++)
		{	
			array[row]=num.nextInt();
			sum += array[row];
		}
		Average = sum/ArraySize;
		System.out.println("The Average of array is :"+Average);
		
		
	}
}
