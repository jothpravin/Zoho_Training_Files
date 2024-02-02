import java.util.Scanner;

public class HollowDiamond
{
	public static void main(String []args)
	{
		int RowCol;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the RowCol to Hollow Diamond pattern:");
		RowCol = num.nextInt();
		
		if(RowCol%2!=0)
		{
			RowCol++;
		}
		int Mid = RowCol/2;
		
		for(int i=1; i<=Mid; i++)
		{
			for(int j=1; j<=Mid-i; j++)
			{
				System.out.print(" ");
			}
			if(i==1)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("* ");
				for(int k=1; k<2*i-3; k++)
				{
					System.out.print(" ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=Mid+1; i<RowCol; i++)
		{
			for(int j=1; j<=i-Mid; j++)
			{
				System.out.print(" ");
			}
			if(i==RowCol-1)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("* ");
				for(int k=1; k<2*(RowCol-i)-3; k++)
				{
					System.out.print(" ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
