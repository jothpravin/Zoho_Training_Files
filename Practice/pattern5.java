import java.util.Scanner;

class pattern5
{
	public static void main(String []args)
	{
		Scanner n =new Scanner(System.in);
		System.out.print("Enter the row :");
		int row = n.nextInt();
		for(int i=1; i<=2*row-1; i++)
		{
			int m = i<row ? i : 2*row-i;
			int l = i<row ? row-i : i-row;
			for(int j=0, k=0; j<m; )
			{
				if(k<l)
				{
					System.out.print(" ");
					k++;
				}
				else
				{
					System.out.print("*");
					j++;
				}
			}
			System.out.println();
		}
	}
}
