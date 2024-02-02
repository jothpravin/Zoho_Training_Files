import java.util.Scanner;

public class MatrixTranspose
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
		
		System.out.println("Enter the Matrix elements----");
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				Matrix[i][j] = num.nextInt();
			}
		}
		System.out.println("----Befor Matrix Transpose----");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print(Matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("----After Matrix Transpose----");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print(Matrix[j][i]+" ");
			}
			System.out.println();
		}
	}
}
