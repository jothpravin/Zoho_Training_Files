import java.util.Scanner;

public class LeaderElement
{	
	public static void CheckLeader(int a[], int n)
	{
		for(int i=0; i<n;i++)
		{
			int j;
			for(j=i+1; j<n;j++)
			{
				if(a[i]<=a[j])
				{
					break;
				}
			}
			if(j==n)
			{
				System.out.println("The leaders are :"+a[i]);
			}
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
		CheckLeader(array, ArraySize);
		
	}
}
