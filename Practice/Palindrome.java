import java.util.Scanner;
import java.util.Arrays;

public class Palindrome
{
	static boolean isPalindrome(String s)
	{
		String temp="";
		for(int i=s.length()-1; i>=0;i--)
		{
			temp = temp+s.charAt(i);
		}
		return s.equals(temp);
	}
	public static void main(String []args)
	{
		String string, res[];
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the first string :");
		string = str.nextLine();
		res = new String[string.length()];
		
		res = string.split(" ");
		
		for(int i=0; i<res.length; i++)
		{
			if(!isPalindrome(res[i]))
			{
				System.out.print(res[i]+" ");
			}
		}
	}
}
