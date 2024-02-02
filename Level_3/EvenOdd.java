import java.util.Scanner;

public class EvenOdd
{	
	static void EvenFirst(int a[], int n)
	{	
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(" "+a[i]);
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(" "+a[i]);
			}
		}
		
	}
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
		EvenFirst(array, ArraySize);
	}
}
