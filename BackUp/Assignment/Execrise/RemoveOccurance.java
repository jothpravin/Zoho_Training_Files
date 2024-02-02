import java.util.Scanner;

public class RemoveOccurance
{
	public static void removeChar(String str, char c)
	{
		char temp=' ';
		if(Character.isUpperCase(c))
		{
			temp = Character.toLowerCase(c);
		}
		else
		{
			temp = Character.toUpperCase(c);
		}
		String tempstr="";
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=c && str.charAt(i)!=temp)
			{
				tempstr += str.charAt(i);
			}
		}
		System.out.print(tempstr);
	}
	public static void main(String []args)
	{
		String input;
		char c;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Input String :");
		input = s.nextLine();
		System.out.print("Enter the character to remove from String :");
		c = s.next().charAt(0);
		removeChar(input, c);
		
	}
}
