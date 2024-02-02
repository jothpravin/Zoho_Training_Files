import java.util.Scanner;

public class LeftShift
{	
	static void Rotate(int a[], int n, int d)
	{
		d=d%n;
		int k = 0;
		int temp[] = new int[n];
		
		for(int i=0;i<d;i++)
		{
			temp[i]=a[i];
		}
		
		for(int i=d;i<n;i++)
		{
			a[k++] = a[i];
		}
		
		for(int i=k, j=0;i<n;i++, j++)
		{
			a[i] = temp[j];
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
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
		
		System.out.print("Input a Number to Rotate the array: ");
		Number = num.nextInt();
		
		Rotate(array, ArraySize,Number);
	}
}
