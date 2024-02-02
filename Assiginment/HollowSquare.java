import java.util.Scanner;

public class HollowSquare
{
	public static void main(String []args)
	{
		int RowCol;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the RowCol to Hollow Square pattern:");
		RowCol = num.nextInt();
		
		for(int i=1; i<=RowCol; i++)
		{
			for(int j=1; j<=RowCol; j++)
			{
				if(i==1 || i==RowCol || j==1 || j==RowCol)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
