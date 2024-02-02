import java.util.Scanner;

public class Diamond
{	
	
	public static void main(String args[])
	{
		int NumberOfRows;
		Scanner c = new Scanner(System.in);
		
		System.out.print("Input number of terms:");
		NumberOfRows = c.nextInt();
		
		for(int row=0;row<NumberOfRows;row++)
		{	
			for(int column=0;column<row+1;column++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int row=1; row<NumberOfRows;row++)
		{	
			for(int column=row;column<NumberOfRows;column++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
