import java.util.Scanner;

public class SumofTens
{	
	public static void Sum(int a[], int n)
	{
		int CheckSum = 30, sum=0;
		for(int i=0;i<n;i++)
		{
			if(a[i] == 10)
			{
				sum = sum+ a[i];
			}
		}
		if(CheckSum==sum)
		{
			System.out.println("True");	
		}
		else
		{
			System.out.println("False");
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
		
		Sum(array,ArraySize);
		
	}
}
