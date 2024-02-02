import java.util.Scanner;

public class Consecutive
{	
	public static void main(String args[])
	{
		int ArraySize, count=1;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = num.nextInt();
		
		int array[] = new int[ArraySize];
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array[row]=num.nextInt();
		}
		
		for(int row=0;row<ArraySize;row++) //Sort the Array to remove duplicate
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
		/*for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			System.out.print(" "+array[row]);
		}*/
		
		for(int row=0;row<ArraySize-1;row++)
		{	
			if(array[row+1]-array[row]==1)
			{
				count++;
			}
		}
		System.out.println("The New Length of the Array after find consecutive :"+count);
	}
}
