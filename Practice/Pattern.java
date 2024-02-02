import java.util.Scanner;

public class Pattern
{
	public static void main(String []args)
	{
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Rows :");
		int n = num.nextInt();
		System.out.print("Enter the Column :");
		int m = num.nextInt();
		char c = 'X';
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				if()
				if(j==m-1 || i==n-1 || i==0 || j==0)
				{	
					System.out.print(c);
				}
				else
				{
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}
}
