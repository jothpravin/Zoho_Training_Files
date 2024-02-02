import java.util.Scanner;

public class DiamondPattern
{
	public static void main(String []args)
	{
		int RowCol;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the RowCol to Print Diamond pattern:");
		RowCol = num.nextInt();
		
		for(int i=1; i<=RowCol; i++)
		{
			for(int k=1; k<=RowCol-i; k++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
		
		for(int i=RowCol-1; i>=0; i--)
		{
			for(int k=1; k<=RowCol-i; k++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
