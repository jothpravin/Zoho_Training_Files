import java.util.Scanner;

public class SecondSmallestArray
{	
	public static void main(String args[])
	{
		int ArraySize, Small, SecondSmall;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = num.nextInt();
		
		int array[] = new int[ArraySize];
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array[row]=num.nextInt();
		}
		Small = array[0];
		for(int row=0;row<ArraySize;row++)
		{
			if(array[row]<Small)
			{
				Small =array[row];
			}
		}
		SecondSmall = array[1];
		for(int i=0; i<ArraySize;i++)
		{
			if(array[i] < SecondSmall && array[i] > Small)
			{ 	
				SecondSmall = array[i];
			}	
		}
		System.out.println("The Smallest element is "+Small+" and Second Smallest is "+SecondSmall);
	}
}
