import java.util.Scanner;

public class SumZero
{	
	public static void CheckMinimum(int a[], int n)
	{
		int num1=0, num2=0, sum=0,minimum;
		
		minimum = Math.abs(a[0]+a[1]);
		for(int i=0; i<n;i++)
		{
			for(int j=i+1; j<n;j++)
			{
				sum = Math.abs(a[i]+a[j]);
				if(sum<minimum)
				{	
					num1 = i;
					num2 = j;
					minimum = sum;
				}
			}
		}
		System.out.println("Element 1: "+a[num1]);
		System.out.println("Element 2: "+a[num2]);
		System.out.println("Sum close to Zero: "+minimum);
		
		
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
		CheckMinimum(array, ArraySize);
		
	}
}
