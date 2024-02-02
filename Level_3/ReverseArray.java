import java.util.Scanner;

public class ReverseArray
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
		System.out.println("The Reversed Array  is ");
		for(int row=ArraySize-1;row>=0;row--)
		{
			System.out.print(array[row]+" ");
		}	
		
		
	}
}
