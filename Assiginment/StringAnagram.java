import java.util.Scanner;

public class StringAnagram
{
	static void sort(char a[])
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					char temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	public static void main(String []args)
	{
		String Word1, Word2;
		boolean check = true;
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String1: ");
		Word1 = str.next();
		System.out.print("Enter the String2: ");
		Word2 = str.next();
		
		char[] ch1 = Word1.toCharArray();
		char[] ch2 = Word2.toCharArray();
		
		if(ch1.length!=ch2.length)
		{
			check = false;
		}		
		sort(ch1);
		sort(ch2);
		
		for(int i=0; i<ch1.length; i++)
		{
			if(ch1[i]!=ch2[i])
			{
				check = false;
			}
		}
		if(check)
		{
			System.out.println("The Given Strings are Anagrams");
		}
		else
		{
			System.out.println("The Given Strings are not Anagrams");
		}
		
	}
}
