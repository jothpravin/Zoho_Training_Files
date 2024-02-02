import java.util.Scanner;

public class FrequentCharacter
{
	public static void main(String []args)
	{
		String Word;
		char ch='a';
		int count=0, max=Integer.MIN_VALUE;
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String to Get Frequent character: ");
		Word = str.next();
		
		for(int i=0; i<Word.length(); i++)
		{
			for(int j=i+1; j<Word.length(); j++)
			{
				if(Word.charAt(i)==Word.charAt(j))
				{
					count++;
					if(count>max)
					{
						max = count;
						ch = Word.charAt(i);
					}
				}
			}
			count = 0;
		}
		
		System.out.println("The Frequent character of the Given String is :"+ch);
	}
}
