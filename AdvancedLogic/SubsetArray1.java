import java.util.Scanner;

public class SubsetArray
{	
	static boolean Subset(int a[], int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		
		int targetsum=0;
		
		if(sum%2!=0)
		{
			return false;
		}
		
		targetsum = sum/2;
		
		int [] dp = new int[targetsum+1];
		dp[0] = 1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=targetsum; j>=a[i]; j--)
			{
				dp[j] += dp[j-a[i]];
				System.out.print(dp[j]+"==>"+j+" ");
			}
			System.out.println("..................");
			System.out.println();
			System.out.println();
		}
		
		return dp[targetsum]>0;
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
		
		if(Subset(array, ArraySize))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}

