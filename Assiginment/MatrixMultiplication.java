import java.util.Scanner;

public class MatrixMultiplication
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
		int Product[][] = new int[row][column];
		
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
		System.out.println("----Matrix Multiplication----");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{	
				Product[i][j] = 0;
				for(int k=0; k<row; k++)
				{
					Product[i][j] += Matrix[i][k]*Matrix1[k][j];
				}
				System.out.print(Product[i][j]+" ");
			}
			System.out.println();
		}
	}
}
