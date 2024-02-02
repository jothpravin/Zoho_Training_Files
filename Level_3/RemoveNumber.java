import java.util.Scanner;

public class RemoveNumber
{	
	
	public static void main(String args[])
	{
		int ArraySize, Number, Index=0;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = num.nextInt();
		
		int array[] = new int[ArraySize];
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array[row]=num.nextInt();
		}
		System.out.print("Enter the number to remove from array :");
		Number = num.nextInt();
		
		for(int row=0;row<ArraySize;row++) //To find the Index number of Given number for remove
		{
			if(array[row]==Number)
			{
				Index = row;
				break;
			}
		}
		
		for(int row=Index;row<ArraySize-1;row++)
		{
			array[row] = array[row+1];
		}
		System.out.println("After removed Number:");
		for(int row=0;row<ArraySize-1;row++)
		{
			System.out.print(array[row]);
		}
		
	}
}
