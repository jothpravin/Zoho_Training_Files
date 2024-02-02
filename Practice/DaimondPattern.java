import java.util.Scanner;

public class DaimondPattern
{
	public static void main(String []args)
	{
		int row, space=0, cond=0;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the row :");
		row = num.nextInt();
		
		for(int i=1; i<=2*row; i++)
		{
			space = (row>i) ? (row-i) : (i-row);
			cond = (row>i) ? (i) : (2*row-i);
			
			for(int j=1, k=0; j<=cond; )
			{
				if(k<space)
				{
					System.out.print(" ");
					k++;
				}
				else
				{
					System.out.print("* ");
					j++;
				}
			} 
			System.out.println();
		}
	}
}
