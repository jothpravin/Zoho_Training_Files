import java.util.Scanner;
import java.util.Arrays;

public class Anagram
{
	public static String toString(char [] a)
	{
		String string = new String(a);
		return string;
	}
	
	static String Sort(char[] str)
	{
		for(int i=0; i<str.length; i++)
		{
			for(int j=i+1; j<str.length; j++)
			{
				if(str[i]>str[j])
				{
					char temp = str[i];
					str[i] = str[j];
					str[j] = temp; 
				}
			}
		}
		return toString(str);
	}
	
	public static void main(String []args)
	{
		int size;
		String s;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the size :");
		size = num.nextInt();
		String anagram[] = new String[size];
		
		for(int i=0; i<size; i++)
		{
			anagram[i] = num.next();
		}
		
		System.out.print("Enter the target :");
		s = num.next();
		String target = Sort(s.toCharArray());
		
		System.out.println("The Anagrams are ");
		for(int i=0; i<size; i++)
		{
			String temp = Sort(anagram[i].toCharArray());
			if(temp.equals(target))
			{
				System.out.println(anagram[i]+" ");
			}
		}
		
	}
}
