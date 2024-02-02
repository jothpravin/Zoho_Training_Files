import java.util.Scanner;

public class SecondLargest
{	
	public static void main(String args[])
	{
		int ArraySize, Large, SecondLarge;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = num.nextInt();
		
		int array[] = new int[ArraySize];
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array[row]=num.nextInt();
		}
		Large = array[0];
		for(int row=0;row<ArraySize;row++)
		{
			if(array[row]>Large)
			{
				Large =array[row];
			}
		}
		SecondLarge = array[1];
		for(int i=0; i<ArraySize;i++)
		{
			if(array[i] > SecondLarge && array[i] < Large)
			{ 	
				SecondLarge = array[i];
			}	
		}
		System.out.println("The Second Largest Number is "+SecondLarge);
	}
}
