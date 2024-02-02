import java.util.Scanner;

public class LargestSmallest
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
		int min= array[0], max=array[1];
		
		for(int i=0; i<arraySize; i++)
		{
			if(array[i]>max)
			{
				max = array[i];
			}
			else if(array[i]<min)
			{
				min = array[i];
			}
		}
		
		System.out.println("The Minimum Number is "+min+" and Maximum Numbers is "+max);
		
	}
}

