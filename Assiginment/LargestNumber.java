import java.util.Scanner;

public class LargestNumber
{
	public static void main(String []args)
	{
		int arraySize;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Size of array :");
		arraySize = num.nextInt();
		
		int array[] = new int[arraySize];
		
		for(int i=0; i<arraySize; i++)
		{
			array[i] = num.nextInt();
		}
		int max=array[0];
		
		for(int i=0; i<arraySize; i++)
		{
			if(array[i]>max)
			{
				max = array[i];
			}
		}
		
		System.out.println("The Largest Numbers is "+max);
		
	}
}

