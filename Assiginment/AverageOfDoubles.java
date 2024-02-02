import java.util.Scanner;

public class AverageOfDoubles
{
	public static void main(String []args)
	{
		int arraySize;
		double Average, sum=0;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Size of array :");
		arraySize = num.nextInt();
		
		double array[] = new double[arraySize];
		
		for(int i=0; i<arraySize; i++)
		{
			array[i] = num.nextDouble();
			sum += array[i];
		}
		Average = sum/arraySize;
		System.out.println("The Average of array Numbers in Double are : "+Average);
		
	}
}

