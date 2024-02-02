import java.util.Scanner;

public class DuplicateArrayNew
{	
	public static void DuplicateArray(int a[], int n)
	{
		
		int j = 0;
		
		for(int i=0;i<n-1;i++)
		{
			if(a[i] != a[i+1])
			{
				a[j++] = a[i];
			}
		}
		a[j++] =a[n-1];
		
		System.out.println("The New Length of the Array after removed duplicates: "+j);
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
		
		for(int row=0;row<ArraySize;row++) //Sort the Array to remove duplicate
		{
			for(int row1=row+1;row1<ArraySize;row1++)
			{
				if(array[row]>array[row1])
				{
					int temp = array[row];
					array[row] = array[row1];
					array[row1] = temp;
				}
			}
		}
		
		DuplicateArray(array,ArraySize);
		
	}
}
