import java.util.Scanner;

public class SumOfArrayNo
{
	public static void main(String []args)
	{
		int arraySize, sum=0;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Size of array :");
		arraySize = num.nextInt();
		
		int array[] = new int[arraySize];
		
		for(int i=0; i<arraySize; i++)
		{
			array[i] = num.nextInt();
			sum += array[i];
		}
		System.out.println("The Sum of Numbers in array are : "+sum);
		
	}
}

