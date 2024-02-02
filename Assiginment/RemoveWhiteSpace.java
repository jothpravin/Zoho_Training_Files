import java.util.Scanner;

public class RemoveWhiteSpace
{
	public static void main(String []args)
	{
		String Word, Concat="";
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String to remove white space : ");
		Word = str.nextLine();
		
		for(int i=0; i<Word.length(); i++)
		{
			if(Word.charAt(i)>=65)
			{
				Concat += Word.charAt(i);
			}
		}
		
		System.out.println("The String After removed white spaces :"+Concat);
	}
}
