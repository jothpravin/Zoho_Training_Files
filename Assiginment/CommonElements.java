import java.util.Scanner;

public class CommonElements
{
	public static void main(String []args)
	{
		int arraySize;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the array Size :");
		arraySize = num.nextInt();
		int Numbers[] = new int[arraySize];
		int Numbers1[] = new int[arraySize];
		
		System.out.println("Enter the 1st array elements----");
		
		for(int i=0; i<arraySize; i++)
		{
			Numbers[i] = num.nextInt();
		}
				
		System.out.println("Enter the 2nd array elements----");
		for(int i=0; i<arraySize; i++)
		{
			Numbers1[i] = num.nextInt();
		}
		System.out.println("----Common Elements----");
		for(int i=0; i<arraySize; i++)
		{
			for(int j=0; j<arraySize; j++)
			{
				if(Numbers[i]==Numbers1[j])
				{
					System.out.print(Numbers[i]+" ");
				}
			}
		}
	}
}
