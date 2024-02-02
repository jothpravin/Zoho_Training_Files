import java.util.Scanner;

public class CommonArrayString
{	
	
	public static void main(String args[])
	{
		int ArraySize;
		Scanner str = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = str.nextInt();
		
		String array[] = new String[ArraySize];
		String array1[] = new String[ArraySize];
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array[row]=str.next();
		}
		
		System.out.println("=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<==");		
		System.out.println("Enter the Second Array elements");		
		System.out.println("=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<==");
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array1[row]=str.next();
		}
		
		for(int row=0;row<ArraySize;row++)
		{
			for(int row1=0;row1<ArraySize;row1++)
			{
				if(array[row].equals(array1[row1]))
				{
					System.out.println("Common Elements :"+array[row]);
				}
			}
		}	
		
		
	}
}
