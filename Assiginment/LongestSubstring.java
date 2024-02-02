import java.util.Scanner;

public class LongestSubstring
{
	static boolean IsDuplicate(String Word, int start, int end)
	{
		boolean [] Distinct = new boolean[256];
		
		for(int i=start; i<=end; i++)
		{
			if(Distinct[Word.charAt(i)]==true)
			{
				return false;
			}
			Distinct[Word.charAt(i)]=true;
		}
		return true;
	}
	public static void main(String []args)
	{
		String Word;
		int result=0;
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String : ");
		Word = str.nextLine();
		
		
		for(int i=0; i<Word.length(); i++)
		{
			for(int j=0; j<Word.length(); j++)
			{
				if(IsDuplicate(Word, i, j))
				{
					result = Math.max(result, j-i+1);	
				}
			}
		}
		System.out.println("The Longest Substring is "+result);
	}
}
