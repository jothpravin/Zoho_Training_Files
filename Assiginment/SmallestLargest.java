import java.util.Scanner;

public class SmallestLargest
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
		int Small= array[0], Large=array[1];
		
		for(int i=0; i<arraySize; i++)
		{
			if(array[i]>Large)
			{
				Large = array[i];
			}
			else if(array[i]<Small)
			{
				Small = array[i];
			}
		}
		
		System.out.println("The Smallest Number is "+Small+" and Largest Numbers is "+Large);
		
	}
}

