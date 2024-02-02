import java.util.Scanner;

public class FindWords
{	
	static boolean FindWords(char a[][], int row, int column, String target)
	{
		//left_to_right
		for(int i=0; i<row; i++)
		{
			int k = 0;
			for(int j=0; j<=column-target.length(); j++)
			{
				while(k<target.length() && a[i][j+k]==target.charAt(k))
				{
					k++;
				}
				if(k==target.length())
				{
					return true;
				}
				k=0;
			}
		}
		
		//top_to_bottom
		for(int i=0; i<column; i++)
		{
			int k = 0;
			for(int j=0; j<=row-target.length(); j++)
			{
				while(k<target.length() && a[i+k][j]==target.charAt(k))
				{
					k++;
				}
				if(k==target.length())
				{
					return true;
				}
				k=0;
			}
		}
		return false;
		
	}
	
	public static void main(String args[])
	{
		int Row, Column;
		String Target;
		Scanner str = new Scanner(System.in);
		
		System.out.print("Input number of Row size:");
		Row = str.nextInt();
		
		System.out.print("Input number of Column size:");
		Column = str.nextInt();
		
		char matrix[][] = new char[Row][Column];
		
		for(int row=0;row<Row;row++) //Input of 1st matrix
		{
			for(int column=0;column<Column;column++)
			{
				matrix[row][column] = str.next().charAt(0);
			}
		}
		
		System.out.print("Input the target :");
		Target = str.next();
		
		
		
		for(int row=0;row<Row;row++)
		{
			for(int column=0;column<Column;column++)
			{
				System.out.print(matrix[row][column]+" ");
			}
			System.out.println();
		}
		
		System.out.println(FindWords(matrix, Row, Column, Target));
		
	}
}
