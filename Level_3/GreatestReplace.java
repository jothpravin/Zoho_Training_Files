import java.util.Scanner;

public class GreatestReplace
{	
	static void GreatestNum(int a[], int n)
	{	
		int max = a[n-1];
		a[n-1] = -1;
		
		for(int i=n-2; i>=0; i--)
		{
			int temp = a[i];
			a[i] = max;
			if(max<temp)
			{
				max = temp;
			}
		}
		
		for(int i=0 ; i<n; i++)
		{
			System.out.print(" "+a[i]);
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
		GreatestNum(array, ArraySize);
	}
}
