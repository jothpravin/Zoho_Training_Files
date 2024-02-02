import java.util.Scanner;

public class SquarePattern
{
	public static void main(String []args)
	{
		int RowCol;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the RowCol to Print Square pattern:");
		RowCol = num.nextInt();
		
		for(int i=0; i<RowCol; i++)
		{
			for(int j=0; j<RowCol; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
