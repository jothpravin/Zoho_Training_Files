import java.util.Scanner;

public class IndexOfArray
{	
	
	public static void main(String args[])
	{
		int ArraySize, Number, Index=0, Flag=0;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = num.nextInt();
		
		int array[] = new int[ArraySize];
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array[row]=num.nextInt();
		}
		System.out.print("Enter the number to get Index number in array :");
		Number = num.nextInt();
		
		for(int row=0;row<ArraySize;row++)
		{
			if(array[row]==Number)
			{
				Index = row;
				Flag=1;
				break;
			}
		}
		if(Flag==1)
		{
			System.out.println("The Index Number of "+Number+" is "+Index);
		}
		else
		{
			System.out.println("This Array not contains a given Number value ");	
		}
		
	}
}
