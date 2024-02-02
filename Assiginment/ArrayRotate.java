import java.util.Scanner;

public class ArrayRotate
{
	public static void main(String []args)
	{
		int arraySize, Target, k=0;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the array Size :");
		arraySize = num.nextInt();
		int Numbers[] = new int[arraySize];
		
		for(int i=0; i<arraySize; i++)
		{
			Numbers[i] = num.nextInt();
		}
		System.out.print("Enter the Number to rotate :");
		Target = num.nextInt();
		
		int temp[] = new int[arraySize];
		
		for(int i=Target; i<arraySize; i++)
		{
			temp[k] = Numbers[i];
			k++;
		}
		
		for(int i=0; i<Target; i++)
		{
			temp[k] = Numbers[i];
			k++;
		}
		
		for(int i=0; i<arraySize; i++)
		{
			System.out.print(temp[i]+" ");
		}
	}
}
