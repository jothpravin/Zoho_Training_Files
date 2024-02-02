import java.util.Scanner;

public class ZeroAtEnd
{	
	public static void EndZero(int a[], int n)
	{
		
		int count = 0;
		
		for(int i=0;i<n-1;i++)
		{
			if(a[i] != 0)
			{
				a[count++] = a[i];
			}
		}	
		while(count<n)
		{
			a[count++] = 0;
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
		
		EndZero(array,ArraySize);
		
		System.out.println("The Array After pushed zero at end");
		for(int row=0; row<ArraySize; row++)
		{
			System.out.print(array[row]+" ");
		}
		
	}
}
