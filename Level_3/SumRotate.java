import java.util.Scanner;

public class SumRotate
{	
	public static boolean RotateSum(int a[], int arrSize, int n)
	{
		int max = 0;
		for(int i=0;i<arrSize;i++)
		{
			if(a[i]>a[i+1])
			{
				max = i+1;
				break;
			}
		}
		int left = max;
		int right = max-1;
		
		while(left!=right)
		{
			if(a[left]+a[right]==n)
			{
				return true;
			}
			else if(a[left]+a[right]<n)
			{
				left = (left+1) % n;
			}
			else
			{
				right = (right-1+n) % n;
			}
		}
		return false;
		
		
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
		
		System.out.print("Input number :");
		Number = num.nextInt();
		
		System.out.println(RotateSum(array, ArraySize, Number));
		
		
	}
}
