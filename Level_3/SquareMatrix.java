import java.util.Scanner;

public class SquareMatrix
{	
	static void Diagonal(int a[][], int n)
	{
		int count=0;
		while(count<=2*(n-1))
		{
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<n; j++)
				{
					if(i+j==count)
					{
						System.out.print("["+a[i][j]+"]");	
					}
				}
				
			System.out.println();
			}
			count++;
		}
	}
	
	public static void main(String args[])
	{
		int RowColumn;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of RowColumn size:");
		RowColumn = num.nextInt();
		
		int matrix[][] = new int[RowColumn][RowColumn];
		
		for(int row=0;row<RowColumn;row++) //Input of 1st matrix
		{
			for(int column=0;column<RowColumn;column++)
			{
				matrix[row][column] = num.nextInt();
			}
		}
		Diagonal(matrix, RowColumn);
		
	}
}
