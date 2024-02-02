import java.util.Scanner;

public class TestInArray
{	
	
	public static void main(String args[])
	{
		int ArraySize, Number;
		boolean Check=true;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = num.nextInt();
		
		int array[] = new int[ArraySize];
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array[row]=num.nextInt();
		}
		System.out.print("Enter the number to test in array :");
		Number = num.nextInt();
		
		for(int row=0;row<ArraySize;row++)
		{
			if(array[row]==Number)
			{
				Check=true;
				break;
			}
			else
			{
				Check=false;
			}
		}
		if(Check)
		{
			System.out.println("Array contains a given "+Number+" number value");
		}
		else
		{
			System.out.println("This Array not contains a given Number value ");	
		}
		
	}
}
