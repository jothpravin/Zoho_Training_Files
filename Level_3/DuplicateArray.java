import java.util.Scanner;

public class DuplicateArray
{	
	
	public static void main(String args[])
	{
		int ArraySize;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = num.nextInt();
		
		int array[] = new int[ArraySize];
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array[row]=num.nextInt();
		}
		for(int row=0;row<ArraySize;row++)
		{
			for(int row1=row+1;row1<ArraySize;row1++)
			{
				if(array[row]==array[row1] && row!=row1)
				{
					System.out.println("Duplicate Elements :"+array[row1]);
				}
			}
		}	
		
		
	}
}
