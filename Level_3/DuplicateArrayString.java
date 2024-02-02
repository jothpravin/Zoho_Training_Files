import java.util.Scanner;

public class DuplicateArrayString
{	
	
	public static void main(String args[])
	{
		int ArraySize;
		Scanner str = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = str.nextInt();
			
		String array[] = new String[ArraySize];
		
		for(int row=0;row<ArraySize;row++) //To get a Input array String from User
		{	
			array[row]=str.next();
		}
		for(int row=0;row<ArraySize;row++)
		{
			for(int row1=row+1;row1<ArraySize;row1++)
			{
				if(array[row].equals(array[row1]) && row!=row1)
				{
					System.out.println("Duplicate Elements :"+array[row]);
				}
			}
		}	
		
		
	}
}
