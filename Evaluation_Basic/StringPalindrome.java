import java.util.Scanner;

public class StringPalindrome
{
	public static void main(String []args)
	{
		String word, temp="";
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String to check palindrome:");
		word = str.next();
		
		for(int i=word.length()-1; i>=0; i--)
		{
			temp += word.charAt(i);
		}
		
		if(word.equals(temp))
		{
			System.out.println("The given String is plaindrome");
		}
		else
		{
			System.out.println("The given string is not plaindrome");
		}
	}
}
