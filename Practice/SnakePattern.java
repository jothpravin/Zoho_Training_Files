import java.util.Scanner;

public class SnakePattern
{
	public static void main(String []args)
	{
		int row,m=1;
		Scanner num =new Scanner(System.in);
		System.out.print("Enter the row: ");
		row = num.nextInt();
		
		
		for(int i=0; i<row; i++)
		{
			if(i%2==0)
			{
				for(int k=0; k<2*row-i; k++)
				{
					if(k<row-i)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print(m++);
					}
				}
				m+=row-1;
				System.out.println();
			}
			else
			{
				for(int j=0; j<2*row-i; j++)
				{
					if(j<row-i)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print(m--);
					}
				}
				m+=row+1;
				System.out.println();
			}
		}
	}
}
