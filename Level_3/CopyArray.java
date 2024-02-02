import java.util.Scanner;

public class CopyArray
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
		
		int copyArray[] = new int[ArraySize];
		
		for(int row=0;row<ArraySize;row++) //To copy the Input array to another array
		{
			copyArray[row] = array[row];
		}
		
		System.out.println("Copied Array:");
		for(int row=0;row<ArraySize;row++)
		{
			System.out.print(copyArray[row]);
		}
		
	}
}
