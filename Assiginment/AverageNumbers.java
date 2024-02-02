import java.util.Scanner;

public class AverageNumbers
{
	public static void main(String []args)
	{
		int arraySize, sum=0;
		float Average;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Size of array :");
		arraySize = num.nextInt();
		
		int array[] = new int[arraySize];
		
		for(int i=0; i<arraySize; i++)
		{
			array[i] = num.nextInt();
			sum += array[i];
		}
		Average = sum/arraySize;
		System.out.println("The Average of Numbers are : "+Average);
		
	}
}

