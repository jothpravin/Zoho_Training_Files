import java.util.Scanner;

public class PairsEqual
{	
	
	public static void main(String args[])
	{
		int ArraySize, Number;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = num.nextInt();
		
		int array[] = new int[ArraySize];
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array[row]=num.nextInt();
		}
		
		System.out.print("Input number to Check the pairs of value is equal :");
		Number = num.nextInt();
		
		
		for(int row=0;row<ArraySize;row++)
		{
			for(int row1=row+1;row1<ArraySize;row1++)
			{
				if((array[row]+array[row1])==Number)
				{
					System.out.println("The sum of pairs of value "+array[row]+" and "+array[row1]+" in array is equal to "+Number);
				}
			}
		}	
		
		
	}
}
