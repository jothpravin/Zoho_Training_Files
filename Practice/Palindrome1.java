import java.util.Scanner;
import java.util.StringTokenizer;

public class Palindrome1
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
		String string;
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the first string :");
		string = str.nextLine();
		
		StringTokenizer st = new StringTokenizer(string," ");
		
		while(st.hasMoreTokens())
		{
			if((isPalindrome(st.nextToken())))
			{
				System.out.println(st.nextToken()+" ");
			}
		}
	}
}
