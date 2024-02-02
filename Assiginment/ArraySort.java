import java.util.Scanner;

public class ArraySort
{
	public static void main(String []args)
	{
		int arraySize;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the array Size :");
		arraySize = num.nextInt();
		int Numbers[] = new int[arraySize];
		
		for(int i=0; i<arraySize; i++)
		{
			Numbers[i] = num.nextInt();
		}
		int temp;
		for(int i=0; i<arraySize; i++)
		{
			for(int j=i+1; j<arraySize; j++)
			{
				if(Numbers[i]>Numbers[j])
				{
					temp = Numbers[i];
					Numbers[i] = Numbers[j];
					Numbers[j] = temp;
				}
			}
		}
		System.out.println("Ascending Order Sort");
		for(int i=0; i<arraySize; i++)
		{
			System.out.print(Numbers[i]+" ");
		}
		System.out.println();
		
		int temp1;
		for(int i=0; i<arraySize; i++)
		{
			for(int j=i+1; j<arraySize; j++)
			{
				if(Numbers[i]<Numbers[j])
				{
					temp1 = Numbers[i];
					Numbers[i] = Numbers[j];
					Numbers[j] = temp1;
				}
			}
		}
		System.out.println("Descending Order Sort");
		for(int i=0; i<arraySize; i++)
		{
			System.out.print(Numbers[i]+" ");
		}
		System.out.println();
	}
}
