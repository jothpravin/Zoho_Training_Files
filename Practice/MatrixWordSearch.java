import java.util.Scanner;

public class MatrixWordSearch
{
	public static void main(String []args)
	{
		char mat[][] = {{'J','O','T','H','I','J'},
				    {'A','N','J','U','A','A'},
				    {'I','N','D','I','A','Y'},
				    {'N','A','N','D','U','A'},
				    {'U','M','A','R','L','M'},
				    {'L','I','O','N','A','A'}};
		int row=6, column=6;
		String input, result="";
		boolean check = true;
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the search word :");
		input = str.next();
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		// LEFT TO RIGHT
		for(int i=0; i<row; i++)
		{
			int k=0;
			for(int j=0; j<=row-input.length(); j++)
			{
				while(k<input.length() && input.charAt(k)==mat[i][j+k])
				{
					k++;
				}
				if(k==input.length())
				{
					int tem=0;
					System.out.println("True");
					while(tem<k)
					{
						System.out.print("("+i+","+(tem++)+") ");
						System.out.println();
					}
					break;
				}
			}
		}
		
		//RIGHT TO LEFT
		for(int i=0; i<column; i++)
		{
			int k=0;
			for(int j=0; j<=column-input.length(); j++)
			{
				while(k<input.length() && input.charAt(k)==mat[i+k][j])
				{
					k++;
				}
				if(k==input.length())
				{
					int tem=0;
					System.out.println("True");
					while(tem<k)
					{
						System.out.print("("+(tem++)+","+i+") ");
						System.out.println();
					}
					break;
				}
			}
		}
		
		for(int i=0; i<column; i++)
		{
			int k=0;
			for(int j=0; j<=column-input.length(); j++)
			{
				while(k<input.length() && input.charAt(k)==mat[i+k][j+k])
				{
					k++;
				}
				if(k==input.length())
				{
					int tem=0;
					System.out.println("True");
					while(tem<k)
					{
						System.out.print("("+(++tem)+","+(tem)+") ");
						System.out.println();
					}
					break;
				}
			}
		}
		
	}
}
