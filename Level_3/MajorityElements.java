import java.util.Scanner;

public class MajorityElements
{	
	public static void CheckMajority(int a[], int n)
	{
		int c =0;
		int index = -1;
		for(int i=0; i<n;i++)
		{
			int count =0;
			for(int j=0; j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>c)
			{
				c = count;
				index = i;
			}
		}
		if(c>n/2)
		{
			System.out.println(a[index]);
		}
		else
		{
			System.out.println("There is no majority in Array");
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
		
		System.out.println("OP");
		CheckMajority(array, ArraySize);
		
	}
}
