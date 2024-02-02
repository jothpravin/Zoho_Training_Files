import java.util.Scanner;

public class MatrixSum
{
	public static void main(String []args)
	{
		int row, column;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the row :");
		row = num.nextInt();
		System.out.print("Enter the column :");
		column = num.nextInt();
		int Matrix[][] = new int[row][column];
		int Matrix1[][] = new int[row][column];
		
		System.out.println("Enter the 1st Matrix elements----");
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				Matrix[i][j] = num.nextInt();
			}
		}
				
		System.out.println("Enter the 2nd Matrix elements----");
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				Matrix1[i][j] = num.nextInt();
			}
		}
		System.out.println("----Matrix Sum----");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print(Matrix[i][j]+Matrix1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
