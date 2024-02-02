import java.util.Scanner;

public class MatrixWordSearch
{
	private static int[][] searchWord(char [][] mat, int row, int col,String input)
	{
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				int[][] path = searchCell(mat, i, j, input);
				if(path != null)
				{
					return path;
				}
			}
		}
		return null;
	}
	
	private static void print(char mat[][])
	{
		for(char[] row : mat)
		{
			for(char col : row)
			{
				System.out.print(" "+col);
			}
			System.out.println();
		}
	}
	
	private static int[][] searchCell(char [][] mat, int row, int col, String input)
	{
		int rows = mat.length;
		int cols = mat[0].length;
		int len = input.length();
		int index[][] = new int[len][2];
		
		// horizontal
		if(col + len <= cols)
		{
			boolean check = true;
			for(int k=0; k<len; k++)
			{
				if(mat[row][col+k] != input.charAt(k))
				{
					check = false;
					break;
				}
				index[k] = new int[]{row, col+k};
			}
			if(check)
				return index;
		}
			
		// vertical
		if(row + len <= rows)
		{
			boolean check = true;
			for(int k=0; k<len; k++)
			{
				if(mat[row+k][col] != input.charAt(k))
				{
					check = false;
					break;
				}
				index[k] = new int[]{row+k, col};			
			}
			if(check)
				return index;
		}
		
			
		//diagonal top-right to bottom-left
		if(row + len <= rows && col + len <= rows)
		{
			boolean check = true;
			for(int k = 0; k<len; k++)
			{
				if(mat[row+k][col+k] != input.charAt(k))
				{
					check = false;
					break;
				}
				index[k] = new int[]{row+k, col+k};
			}
			if(check)
				return index;
		}
		
		//diagonal top-left to bottom-right
		if(row + len <=rows && col-len + 1 >=0)
		{
			boolean check = true;
			for(int k=0; k<len; k++)
			{
				if(mat[row+k][col-k] != input.charAt(k))
				{
					check = false;
					break;
				}
				index[k] = new int[]{row+k, col-k};
			}
			if(check)
				return index;
		}
		
		
		return null;
		
	}
	
	public static void main(String []args)
	{
		char mat[][] = {{'J','O','T','H','I','J'},
				    {'J','A','I','N','U','L'},
				    {'I','N','D','I','A','Y'},
				    {'N','A','N','D','U','A'},
				    {'U','M','A','R','L','M'},
				    {'L','I','O','N','A','A'}};
				    
		String input;
		int row = mat.length;
		int col = mat[0].length;
		
		while(true)
		{
			print(mat);
			Scanner in = new Scanner(System.in);
			System.out.print("Enter 1 to search or 2 to exit :");
			int n = in.nextInt();
			if(n==1)
			{
				
				System.out.print("Enter the Name to search :");
				input = in.next().toUpperCase();
				
				int [][]path = searchWord(mat, row, col, input);
				
				if(input.length()>col)
				{
					System.out.println();
				}
				
				if(path != null)
				{
					System.out.println(input+" is founded in Array");
					for(int[] rows: path)
					{
						System.out.println("("+rows[0]+", "+rows[1]+")");
					}
				}
				else
				{
					System.out.println("The Given word is not founded !!");
				}
			}
			else
			{
				System.out.print("Exiting...!");
				System.exit(0);
			}
		}
	}
}
