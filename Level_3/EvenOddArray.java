import java.util.Scanner;

public class EvenOddArray
{	
	public static void EvenOdd(int a[], int n)
	{
		int EvenCount = 0, OddCount = 0;
		for(int i=0;i<n;i++)
		{
			if(a[i]%2 == 0)
			{
				EvenCount++;
			}
			else
			{
				OddCount++;
			}
		}
		System.out.println("The even numbers in array are: "+EvenCount);
		System.out.println("The odd numbers in array are: "+OddCount);
		
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
		
		EvenOdd(array,ArraySize);
		
	}
}
