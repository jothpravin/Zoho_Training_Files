import java.util.Scanner;

public class Grid
{	
	
	public static void main(String args[])
	{
		int NumberOfRows;
		Scanner c = new Scanner(System.in);
		
		System.out.print("Input number of terms:");
		NumberOfRows = c.nextInt();
		
		for(int i=0;i<=NumberOfRows;i++)
		{	
			for(int j=1;j<=NumberOfRows;j++)
			{
				System.out.print("- ");
			}
			System.out.println();
		}
		
	}
}
