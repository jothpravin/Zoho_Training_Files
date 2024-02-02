import java.util.Scanner;

public class TriangleNumbers
{	
	
	public static void main(String args[])
	{
		int NumberOfRows;
		Scanner c = new Scanner(System.in);
		
		System.out.print("Input number of terms:");
		NumberOfRows = c.nextInt();
		
		for(int row=1;row<=NumberOfRows;row++)
		{	
			for(int column=1;column<=row;column++)
			{
				System.out.print(column);
			}
			System.out.println();
		}
		
	}
}
