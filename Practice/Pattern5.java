import java.util.Scanner;

public class Pattern5
{
	public static void main(String []args)
	{
		String input;
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String :");
		input = str.next();
		
		int len = input.length();
		
		if(len%2==0)
		{
			System.out.println("Enter the character with length of odd");
			System.exit(0);
		}
		
		for(int i=0; i<len; i++)
		{
			int j = len - i - 1;
			for(int k=0; k<len; k++)
			{
				if(i==k || k==j)
				{
					System.out.print(input.charAt(k));
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
