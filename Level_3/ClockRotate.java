import java.util.Scanner;

public class ClockRotate
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
		
		int firstElement = array[ArraySize-1];
		for(int row=ArraySize-1;row>0;row--)
		{
			array[row] = array[row-1];
		}	
		array[0] = firstElement;
		
		for(int i = 0; i<ArraySize; i++)
		{
			System.out.print(" "+array[i]);
		}
		System.out.println();
		
	}
}
