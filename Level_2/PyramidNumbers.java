import java.util.Scanner;

public class PyramidNumbers
{	
	
	public static void main(String args[])
	{
		int NumberOfRows,p=1;
		Scanner c = new Scanner(System.in);
		
		System.out.print("Input number of terms:");
		NumberOfRows = c.nextInt();
		
		for(int row=0;row<=NumberOfRows;row++)
		{	
			for(int column=1;column<NumberOfRows-row;column++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=row;k++)
			{
				System.out.print(p+" ");
			}
			p++;
			System.out.println();
		}
		
	}
}
