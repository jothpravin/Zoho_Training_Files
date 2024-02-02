import java.util.Scanner;

public class InsertArray
{	
	
	public static void main(String args[])
	{
		int ArraySize, Number, Index;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = num.nextInt();
		
		int array[] = new int[ArraySize+1];
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array[row]=num.nextInt();
		}
		System.out.print("Enter the number to Insert in an array :");
		Number = num.nextInt();
		System.out.print("Enter the Index to Insert in specific position in an array :");
		Index = num.nextInt();
		
		
		for(int row=(ArraySize-1);row>=Index-1;row--)
		{
			array[row+1] = array[row];
		}
		array[Index-1]=Number;
		System.out.println("After Inserting Number:");
		
		for(int row=0;row<ArraySize;row++)
		{
			System.out.print(array[row]+",");
		}
		System.out.print(array[ArraySize]);
		
	}
}
