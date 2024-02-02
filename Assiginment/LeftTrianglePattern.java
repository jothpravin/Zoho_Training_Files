import java.util.Scanner;

public class LeftTrianglePattern
{
	public static void main(String []args)
	{
		int RowCol;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the RowCol to Print Right triangle pattern:");
		RowCol = num.nextInt();
		
		for(int i=1; i<=RowCol; i++)
		{
			for(int k=1; k<=RowCol-i; k++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
