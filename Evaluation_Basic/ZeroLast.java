import java.util.Scanner;

public class ZeroLast
{
	static void Zerolast(int a[], int n)
	{
		int count=0;
		int a1[] = new int[n];
		for(int i=0; i<n;i++)
		{	
			if(a[i]!=0)
			a1[count++] = a[i];
		}
		
		for(int i=count; i<n; i++)
		{
			a1[i] = 0;
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.print(a1[i]+" ");
		}
		
	}
	public static void main(String []args)
	{
		int ArraySize;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the ArraySize:");
		ArraySize = num.nextInt();
		
		int Numbers[] = new int[ArraySize];
		for(int i=0; i<ArraySize; i++)
		{
			Numbers[i] = num.nextInt();
			
		}
		
		Zerolast(Numbers, ArraySize);
		
	}
}
