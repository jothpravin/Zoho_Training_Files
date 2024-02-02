import java.util.Scanner;

public class StarTriangle
{	
	
	public static void main(String args[])
	{
		int NumberOfRows;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of terms:");
		NumberOfRows = num.nextInt();
		
		for(int row=0;row<=NumberOfRows;row++)
		{	
			for(int column=1;column<=row;column++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
