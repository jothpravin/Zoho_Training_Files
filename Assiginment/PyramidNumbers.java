import java.util.Scanner;

public class PyramidNumbers
{
	public static void main(String []args)
	{
		int RowCol, temp=1;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the RowCol to Print PyramidNumbers pattern:");
		RowCol = num.nextInt();
		
		for(int i=1; i<=RowCol; i++)
		{
			for(int k=1; k<=RowCol-i+1; k++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			for(int j=i-1; j>=1; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
