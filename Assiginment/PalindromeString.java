import java.util.Scanner;

public class PalindromeString
{
	public static void main(String []args)
	{
		String Word, Reverse="";
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String to check Palindrome or Not: ");
		Word = str.next();
		
		for(int i=Word.length()-1; i>=0; i--)
		{
			Reverse += Word.charAt(i);
		}
		if(Word.equals(Reverse))
		{
			System.out.println("The given String is Plaindrome");
		}
		else
		{
			System.out.println("The given string is not a plaindrome");
		}
	}
}
