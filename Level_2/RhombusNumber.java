import java.util.Scanner;

public class RhombusNumber
{	
	
	public static void main(String args[])
	{
		int NumberOfRows;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of terms:");
		NumberOfRows = num.nextInt();
		int count = 1;
		int Start = 0;
		
		for(int row=1;row<(NumberOfRows*2);row++)
		{	
			if(row<NumberOfRows)
			{
				Start = row;
			}
			else
			{
				Start = NumberOfRows*2 - row;
			}
			for(int column=0;column<count;column++)
			{
				System.out.print(Start);
				if(column<count/2)
				{
					Start--;
				}
				else
				{
					Start++;
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
			System.out.println();
		}
		
	}
}
