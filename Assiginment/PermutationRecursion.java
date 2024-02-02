import java.util.Scanner;

public class PermutationRecursion
{
	static void swap(char []chars, int i, int j)
	{
		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
	}
	static void Permutation(char []chars, int CurrentIndex)
	{	
		if(CurrentIndex==chars.length-1)
		{
			System.out.println(String.valueOf(chars));
		}
		for(int i=CurrentIndex; i<chars.length; i++)
		{
			swap(chars, CurrentIndex, i);
			Permutation(chars, CurrentIndex+1);
			swap(chars, CurrentIndex, i);
		}
	}
	public static void main(String []args)
	{
		String Word;
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String :");
		Word = str.next();
		
		if(Word==null || Word.length()==0)
		{
			System.out.println("Null");
		}
		
		Permutation(Word.toCharArray(), 0);
		
		
	}
}
