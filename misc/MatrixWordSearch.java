import java.util.Scanner;

public class MatrixWordSearch
{
	private static boolean searchWord(char [][] mat, int row, int col,String input)
	{
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				if(searchCell(mat, i, j, input))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean searchCell(char [][] mat, int row, int col, String input)
	{
		int rows = mat.length;
		int cols = mat[0].length;
		int len = input.length();
		
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
			}
			if(check)
				return true;
		}
			
		// vertical
		if(row + len <= rows)
		{
			boolean check = true;
			for(int k=0; k<len; k++)
			{
				if(mat[row+len][col] != input.charAt(k))
				{
					check = false;
					break;
				}			
			}
			if(check)
				return true;
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
			}
			if(check)
				return true;
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
			}
			if(check)
				return true;
		}
	}
	
	public static void main(String []args)
	{
		char mat[][] = {{'J','O','T','H','I','J'},
				    {'A','N','J','U','A','A'},
				    {'I','N','D','I','A','Y'},
				    {'N','A','N','D','U','A'},
				    {'U','M','A','R','L','M'},
				    {'L','I','O','N','A','A'}};
				    
		String input;
		int row = mat.length;
		int col = mat[0].length;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the word to search :");
		input = in.next();
		
		if(searchWord(mat, row, col, input))
		{
			System.out.println(input+" is founded in matrix");
		}
		else
		{
			System.out.println("The Given word is not founded !!");
		}
	}
}
