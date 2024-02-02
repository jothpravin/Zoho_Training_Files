import java.util.Scanner;

public class CommonArray
{	
	
	public static void main(String args[])
	{
		int ArraySize;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = num.nextInt();
		
		int array[] = new int[ArraySize];
		int array1[] = new int[ArraySize];
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array[row]=num.nextInt();
		}
		
		System.out.println("================================");		
		System.out.println("Enter the Second Array elements");		
		System.out.println("================================");
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array1[row]=num.nextInt();
		}
		
		for(int row=0;row<ArraySize;row++)
		{
			for(int row1=0;row1<ArraySize;row1++)
			{
				if(array[row]==array1[row1])
				{
					System.out.println("Common Elements :"+array[row]);
				}
			}
		}	
		
		
	}
}
