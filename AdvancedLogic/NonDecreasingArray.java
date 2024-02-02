import java.util.Scanner;

public class NonDecreasingArray
{	
	static boolean NonDecrease(int a[], int n)
	{
		int count =0;
		for(int i=1; i<n; i++)
		{
			if(a[i]<a[i-1])
			{
				if(i-2<0 || a[i-2]<=a[i])
				{
					a[i-1] =1;
					count ++;
				}
				else
				{
					a[i] = 1;
					count++;
				}
			}
		}
		return count<=1;
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
		
		if(NonDecrease(array, ArraySize))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
