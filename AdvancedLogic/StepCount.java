import java.util.Scanner;

public class StepCount
{
	public static void CountSteps(int n)
	{
		int a[] = new int[n+1];
		a[0] = 1;
		a[1] = 1;
		for(int i=2;i<=n;i++)
		{
			a[i] = a[i-1] + a[i-2];
		}
		System.out.println("Number of ways :"+a[n]);
 	}
	public static void main(String args[])
	{
		int Number;
		
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		Number = a.nextInt();
		
		CountSteps(Number);
		
	}
}
