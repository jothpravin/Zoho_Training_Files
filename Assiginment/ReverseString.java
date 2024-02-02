import java.util.Scanner;

public class ReverseString
{
	public static void main(String []args)
	{
		String Word, Reverse="";
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String to get reversed: ");
		Word = str.next();
		
		for(int i=Word.length()-1; i>=0; i--)
		{
			Reverse += Word.charAt(i);
		}
		
		System.out.println(Reverse);
	}
}
