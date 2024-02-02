import java.util.Scanner;

public class MatrixSpiral
{	
	static void Diagonal(int a[][], int r, int c)
	{
		int top=0, bottom=r-1, left = 0, right = c-1;
		
		while(top<=bottom && left<=right)
		{
			//right
			for(int i=left; i<=right; i++)
			{
				System.out.print(a[top][i]+" ");
			}
			top++;
			
			//top_to_bottom
			for(int i=top; i<=bottom; i++)
			{
				System.out.print(a[i][right]+" ");
			}
			right--;
			
			if(top<=bottom)
			{
				//right_to_left
				for(int i=right; i>=left;i--)
				{
					System.out.print(a[bottom][i]+" ");
				}
				bottom--;
			}
			
			if(left<=right)
			{
				//bottom_to_right
				for(int i=bottom; i>=top;i--)
				{
					System.out.print(a[i][left]+" ");
				}
			left++;
			}
		}
		
	}
	
	public static void main(String args[])
	{
		int Row, Column;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Row size:");
		Row = num.nextInt();
		
		System.out.print("Input number of Column size:");
		Column = num.nextInt();
		
		int matrix[][] = new int[Row][Column];
		
		for(int row=0;row<Row;row++) //Input of 1st matrix
		{
			for(int column=0;column<Column;column++)
			{
				matrix[row][column] = num.nextInt();
			}
		}
		Diagonal(matrix, Row, Column);
		
	}
}
