import java.util.Scanner;

public class MatrixSum
{	
	public static void main(String args[])
	{
		int Row,Column;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Row size:");
		Row = num.nextInt();
		
		System.out.print("Input number of Column size:");
		Column = num.nextInt();
		
		int matrix[][] = new int[Row][Column];
		int matrix1[][] = new int[Row][Column];
		int sum[][] = new int[Row][Column];
		
		for(int row=0;row<Row;row++) //Input of 1st matrix
		{
			for(int column=0;column<Column;column++)
			{
				matrix[row][column] = num.nextInt();
			}
		}	
				
		System.out.println("Enter the Matrix Array elements");	
		System.out.println("=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<==");
		
		for(int row=0;row<Row;row++) //Input of 2nd matrix
		{
			for(int column=0;column<Column;column++)
			{
				matrix1[row][column] = num.nextInt();
			}
		}
		
		for(int row=0;row<Row;row++) //Input of 2nd matrix
		{
			for(int column=0;column<Column;column++)
			{
				sum[row][column] = matrix[row][column] + matrix1[row][column];
			}
		}
		
		System.out.println("Sum of two Matrices are");	
		System.out.println("=<=<=<=<=<=<=<=<=<=<=<=");
		
		for(int row=0;row<Row;row++) //Sum of the Two matrices
		{
			for(int column=0;column<Column;column++)
			{
				System.out.print(sum[row][column]+" ");
			}
			System.out.println();
		}
		
	}
}
