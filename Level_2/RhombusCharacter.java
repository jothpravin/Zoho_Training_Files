import java.util.Scanner;

public class RhombusCharacter
{	
	
	public static void main(String args[])
	{
		int NumberOfRows;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of terms:");
		NumberOfRows = num.nextInt();
		int count = 1;
		char c = 'A';
		
		
		for(int row=1;row<(NumberOfRows*2);row++)
		{	
			for(int column=0;column<count;column++)
			{
				System.out.print(c);
				if(column<count/2)
				{
					c++;
				}
				else
				{
					c--;	
				}
			}
			if(row<NumberOfRows)
			{
				count += 2;
			}
			else
			{
				count -= 2;
			}
			c='A';
			System.out.println();
		}
		
	}
}
