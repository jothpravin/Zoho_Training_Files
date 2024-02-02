import java.util.Scanner;

public class MatrixDrop
{
	static Scanner in = new Scanner(System.in);
	public static void main(String []args)
	{
		int row;
		int col;
		int tempRow;
		System.out.print("Enter the row: ");
		row = in.nextInt();
		tempRow = row-1;
		System.out.print("Enter the column: ");
		col = in.nextInt();
		
		char[][] matrix = new char[row][col];
		
		initailizer(matrix, row, col);
		
		while(true)
		{
			System.out.print("Enter the column no: ");
			int colNo = in.nextInt();
			
			if(isValid(colNo, col))
			{
				System.out.println("Invalid Column input");
				continue;	
			}
			
			System.out.print("Enter the baloon color: ");
			char baloon = in.next().charAt(0);
			
			//putBaloon(matrix, colNo-1, baloon);
			if(!isRowFull(matrix, tempRow))
			{
				putBaloon1(matrix, colNo-1, tempRow, baloon);
			}
			else
			{
				tempRow--;
				putBaloon1(matrix, colNo-1, tempRow, baloon);
			}
			
			int indexCol = columnColorFind(matrix);
			if(indexCol >= 0)
			{
				columnColorBurst(matrix, indexCol);	
				tempRow=row-1;
			}
			
			if(isFull(matrix))
			{
				printBallon(matrix);
				System.out.println("Matrix filled!!. Program exited");
				System.exit(0);
			}
			
			printBallon(matrix);
			
			System.out.print("Do you want to continue Y/N: ");
			char s = in.next().charAt(0);
			if(s=='N')
			{
				System.exit(0);
			}
		}
		
	}
	
	private static void initailizer(char [][]matrix, int row, int col)
	{
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				matrix[i][j] = '-';
			}
		}
	}
	
	private static void putBaloon(char[][] mat, int col, char baloon)
	{
		int row = mat.length-1;
		for(int i=row; i>=0; i--)
		{
			if(mat[i][col] == '-')
			{
				mat[i][col] = baloon;
				return;
			}
		}
		System.out.println("Columns Filled!!!. Program is terminated");
		System.exit(0);
	}

	
	private static void putBaloon1(char[][] mat, int col, int row, char baloon)
	{
		int colum = mat[0].length;
		int updatedRow = row;
		
		for(int i=col; i>=0; i--)
		{
			if(mat[updatedRow][i]=='-')
			{
				mat[updatedRow][i] = baloon;
				return;
			}
		}
		
		for(int i=col+1; i<colum; i++)
		{
			if(mat[updatedRow][i]=='-')
			{
				mat[updatedRow][i] = baloon;
				return;
			}
		}
	}
	
	private static void printBallon(char matrix[][])
	{
		for(char[] row : matrix)
		{
			for(char col : row)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
	private static boolean isValid(int colu, int col)
	{
		return colu>col;
	}
	
	private static boolean isFull(char[][] mat)
	{
		for(char[] row : mat)
		{
			for(char col: row)
			{
				if(col=='-')
				{
					return false;
				}
			}
		}
		return true;
	}
	
	private static boolean isRowFull(char [][]mat, int row)
	{
		int col = mat[0].length;
		int count=0;
		
		
		for(int j=0; j<col; j++)
		{
			if(mat[row][j] != '-')
			{
				count++;
			}
		}
		if(count==col)
		{
			return true;
		}
		
		return false;
	}
	
	private static int columnColorFind(char [][]mat)
	{
		int row = mat.length;
		int col = mat[0].length;
		int count=0;
		
		for(int i=0; i<col; i++)
		{
			for(int j=0; j<row-1; j++)
			{
				if(mat[j][i] == mat[j+1][i])
				{
					count++;
				}
			}
			if(count == col-1)
			{
				return i;
			}
			count=0;
		}
		return -1;
	}
	
	
	private static void columnColorBurst(char [][]mat, int col)
	{
		int row = mat.length;
		for(int i=0; i<row; i++)
		{
			mat[i][col] = '-';
		}
	}
}
