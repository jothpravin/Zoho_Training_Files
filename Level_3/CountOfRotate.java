import java.util.Scanner;

public class CountOfRotate
{	
	
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
		
		int Minimum = array[0];
		int Index = -1;
		for(int row=0;row<ArraySize;row++)
		{
			if(Minimum>array[row])
			{
				Minimum = array[row];
				Index = row;
			}
		}	
		if(Index>0)
		{
			System.out.println("The Rotated Count of Sorted Rotated array is "+Index);
		}
		else
		{
			System.out.println("There is no Rotation occurs");
		}
	}
}
