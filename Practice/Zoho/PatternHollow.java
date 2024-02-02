import java.util.Scanner;

public class PatternHollow
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int space = 0;
		int space1 = 2*n-2;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-i; j++)
			{
				System.out.print("* ");
			}
			for(int k=0; k<space; k++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<n-i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space += 2;
		}
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			for(int k=0; k<space1; k++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space1 -= 2;
		}
	}
}
