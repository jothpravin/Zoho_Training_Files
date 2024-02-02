import java.util.Scanner;

public class EqualityArray
{
	public static void main(String []args)
	{
		int arraySize, count=0;
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the array Size: ");
		arraySize = a.nextInt();
		int array[] = new int[arraySize];
		int array1[] = new int[arraySize];

		for(int i=0; i<arraySize; i++)
		{
			array[i] = a.nextInt();
		}
		System.out.println("Enter the second array ");

		for(int i=0; i<arraySize; i++)
		{
			array1[i] = a.nextInt();
		}
		for(int i=0; i<arraySize; i++)
		{	
			for(int j=0; j<arraySize; j++)
			{
				if(array[i]==array1[j])
				{
					count++;
				}
			}
		}
		
		if(arraySize==count)
		{
			System.out.println("These two arrays are equal");
		}
		else
		{
			System.out.println("these are not equal");
		}
	}
}
