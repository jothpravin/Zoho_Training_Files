import java.util.Scanner;

public class FirstNonRepeatedChar
{
	public static void main(String []args)
	{
		String Word;
		char ch[];
		int count = 0, k=0;
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String : ");
		Word = str.nextLine();
		
		ch = Word.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					ch[i]='0';
					ch[j]='0';
				}
			}
		}
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]!='0')
			{
				System.out.println(ch[i]);
				break;
			}
		}
	}
}
