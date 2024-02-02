import java.util.Scanner;

public class MaximumMinimumArray
{	
	public static void main(String args[])
	{
		int ArraySize, Minlen = 0, Maxlen = 0;
		boolean flag = true;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = num.nextInt();
		
		int array[] = new int[ArraySize];
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array[row]=num.nextInt();
		}
		
		for(int row=0;row<ArraySize;row++) //Sort the Array 
		{
			for(int row1=row+1;row1<ArraySize;row1++)
			{
				if(array[row]>array[row1])
				{
					int temp = array[row];
					array[row] = array[row1];
					array[row1] = temp;
				}
			}
		}
		
		Maxlen = ArraySize-1;
		for(int row=0;row<ArraySize;row++) 
		{	
			if(flag)
			{
				System.out.print(" "+array[Minlen++]);
			}
			else
			{
				System.out.print(" "+array[Maxlen--]);
			}
			flag=!flag;
		}
		System.out.println("");
	}
}
