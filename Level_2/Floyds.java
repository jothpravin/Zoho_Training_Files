import java.util.Scanner;

public class Floyds
{	
	
	public static void main(String args[])
	{
		int NumberOfRows,m=1;
		Scanner c = new Scanner(System.in);
		
		System.out.print("Input number of terms:");
		NumberOfRows = c.nextInt();
		
		for(int row=0;row<=NumberOfRows;row++)
		{	
			for(int column=1;column<=row;column++)
			{
				System.out.print(m);
				if(m==0)
				{
					m=1;
				}
				else
				{
					m=0;
				}
			}
			System.out.println();
		}
		
	}
}
