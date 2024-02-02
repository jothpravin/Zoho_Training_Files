import java.util.Scanner;

public class DifferenceArray
{	
	public static void Difference(int a[], int n)
	{
		int Max = a[0], Min = a[0];
		float Difference = 0;
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
		Difference = Max - Min;
		System.out.println("The Difference Between Largest and Smallest "+Difference);
		
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
		
		Difference(array,ArraySize);
		
	}
}
