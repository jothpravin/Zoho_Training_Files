import java.util.Scanner;

public class CountString
{
	public static void main(String []args)
	{
		String Word;
		int count=1;
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String to Get the words count : ");
		Word = str.nextLine();
		
		for(int i=0; i<Word.length()-1; i++)
		{
			if(Word.charAt(i)==' ')
			{
				count++;
			}
		}
		
		System.out.println("The Count of the Given String is :"+count);
	}
}
