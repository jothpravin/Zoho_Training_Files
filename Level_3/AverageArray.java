import java.util.Scanner;

public class AverageArray
{	
	public static void Average(int a[], int n)
	{
		int Max = a[0], Min = a[0], sum=0;
		float Average = 0;
		for(int i=0;i<n;i++)
		{
			if(a[i]> Max)
			{
				Max = a[i];
			}
			else if(a[i] < Min)
			{
				Min = a[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			if(!(Max==a[i] || Min==a[i]))
			{
				sum = sum+a[i];
			}
		}
		Average = sum/(n-2);
		System.out.println("The Average of array except  Largest and Smallest "+Average);
		
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
		
		Average(array,ArraySize);
		
	}
}
