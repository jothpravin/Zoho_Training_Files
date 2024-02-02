import java.util.Scanner;

public class CaptializeFirst
{
	public static void main(String []args)
	{
		String Word, Concat="";
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String to captialize the first character : ");
		Word = str.nextLine();
		
		Concat += Character.toUpperCase(Word.charAt(0));
		
		int len = Word.length()-1;
		
		for(int i=1; i<Word.length(); i++)
		{
			if(Word.charAt(i)==' ' && Word.charAt(i) != Word.charAt(len))
			{
				Concat += Word.charAt(i);
				Concat += Character.toUpperCase(Word.charAt(i+1));
				i++;
				continue;	
			}
			Concat += Word.charAt(i);
		}
		
		System.out.println("The String After captialized first character :"+Concat);
	}
}
