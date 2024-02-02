import java.util.Scanner;

public class TriangleNumber2
{	
	
	public static void main(String args[])
	{
		int NumberOfRows,k=1;
		Scanner c = new Scanner(System.in);
		
		System.out.print("Input number of terms:");
		NumberOfRows = c.nextInt();
		
		for(int row=1;row<=NumberOfRows;row++)
		{	
			for(int column=1;column<=row;column++)
			{
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		
	}
}
