import java.util.Scanner;

public class Pascals
{	
	
	public static void main(String args[])
	{
		int NumberOfRows,m=1;
		Scanner c = new Scanner(System.in);
		
		System.out.print("Input number of terms:");
		NumberOfRows = c.nextInt();
		
		for(int row=0;row<=NumberOfRows;row++)
		{	
			for(int column=0;column<=row;column++)
			{
				if(row==0||column==0)
				{
					m=1;
				}
				else
				{
					m=m*(row-column+1)/column;
				}
				System.out.print(m);
			}
			System.out.println();
		}
		
	}
}
