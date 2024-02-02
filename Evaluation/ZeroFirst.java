import java.util.Scanner;

public class ZeroFirst
{
	public static void main(String[] args)
	{
		int arraySize;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Array size :");
		arraySize = num.nextInt();
		int array[] = new int[arraySize];
 
		for(int i=0; i<arraySize; i++)
		{
			array[i] = num.nextInt();
		}

		for(int i=0; i<arraySize; i++)
		{
			for(int j=i+1; j<arraySize; j++)
			{
				if(array[i]>array[j])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.println("Output");

		for(int i=0; i<arraySize; i++)
		{
			System.out.println(array[i]);
		}

	}
}
