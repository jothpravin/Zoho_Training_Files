import java.util.Scanner;

public class Xpattern
{
	public static void main(String []args)
	{
		String input;
		Scanner str = new Scanner(System.in);
		System.out.println("Enter the input String :");
		input = str.next();
		int len = input.length();
		
		if(len%2 != 0)
		{
			for(int i=0;i<len; i++)
			{  
				int j = len - 1 - i;
				for(int k=0; k<len; k++)
				{
					if(k==i || k==j)
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
		else
		{
			System.out.println("Enter the string in odd length");
		} 
	}
}
