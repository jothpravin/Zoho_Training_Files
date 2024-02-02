import java.util.Scanner;

public class SumEqual
{	
	public static boolean CheckEqual(int a[], int n, int target)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]+a[j]==target)
				{
					return true;
				}
			}
		}
		return false;
		
	}
	
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
		
		System.out.print("Target Value :");
		Number = num.nextInt();
		
		if(CheckEqual(array, ArraySize, Number))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
	}
}
