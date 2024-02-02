import java.util.Scanner;

public class CheckArray
{	
	public static void ArrayCheck(int a[], int n)
	{
		boolean Check = true;
		for(int i=0;i<n;i++)
		{
			if(a[i] == 0 || a[i] == -1)
			{
				Check = false;
			}
		}
		if(Check)
		{
			System.out.println("This array Not contain 0 and -1");	
		}
		else
		{
			System.out.println("This array contain 0 and -1");
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
		
		ArrayCheck(array,ArraySize);
		
	}
}
