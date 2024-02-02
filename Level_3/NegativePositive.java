import java.util.Scanner;

public class NegativePositive
{	
	public static void NegativeFirst(int a[], int n)
	{
		int j=0, a1[] = new int[n];
		for(int i=0; i<n;i++)
		{
			if(a[i]<0)
			{
				a1[j++]=a[i];
			}
		}
		for(int i=0; i<n;i++)
		{
			if(a[i]>0)
			{
				a1[j++] = a[i];
			}
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+a1[i]);
		}
		System.out.println();
		
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
		
		NegativeFirst(array, ArraySize);
		
		
	}
}
