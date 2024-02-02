import java.util.Scanner;

public class ArrayStringReverse
{
	public static void main(String []args)
	{
		int arraySize;
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the array Size :");
		arraySize = str.nextInt();
		String words[] = new String[arraySize];
		
		for(int i=0; i<arraySize; i++)
		{
			words[i] = str.next();
		}
		
		for(int i=arraySize-1; i>=0; i--)
		{
			System.out.print(words[i]+" ");
		}
	}
}
