import java.util.Scanner;

class pattern6
{
	public static void main(String []args)
	{
		Scanner n =new Scanner(System.in);
		System.out.print("Enter the row :");
		int row = n.nextInt();
		for(int i=1; i<=2*row-1; i++)
		{
			int m; //= i<row ? i==row ? i+1 : i : 2*row-i;
			int l = i<row ? 2*row-i : 0;
			if(i<row)
			{
				m=i;
			}
			else
			{
				m = 2*row-i;
			}
			if(i==row)
			{
				m=2*row;
			}
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
