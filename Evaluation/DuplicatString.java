import java.util.Scanner;

public class DuplicatString
{
	public static void main(String args[])
	{
		String str;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string :");
		str = s.nextLine();
		
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i+1; j<str.length(); j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.print(str.charAt(i));
				}
			}
		}
	}
}
