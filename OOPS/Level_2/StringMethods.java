import java.util.Scanner;

public class StringMethods
{
	private String word;
	
	StringMethods(String word)
	{
		this.word = word;
	}
	
	String concat(String str)
	{
		return word+" "+str;
	}
	
	char CharAt(int index)
	{
		char []ch;
		if(index>word.length())
		{
			System.out.println("Invalid Index Number");
		}
		else
		{
			ch = word.toCharArray();
			return ch[index];
		}
		return 0;
	}
	
	boolean endsWith(String suffix)
	{
		int wordlen = word.length()-1, count=0;
		if(word.length()<suffix.length())
		{
			System.out.println("suffix length is longer than word length");
		}
		else
		{
			for(int i=suffix.length()-1; i>0; i--)
			{
				if(suffix.charAt(i)==word.charAt(wordlen--))
				{
					count++;
				}
			}
			if(count==suffix.length()-1)
			{
				return true;
			}
		}
		return false;
	}
	
	static String copyValueOf(char[] data)
	{
		String charSeq="";
		for(int i=0; i<data.length; i++)
		{
			charSeq += data[i];
		}
		return charSeq;
	}
	
	int indexOf(String str)
	{
		for(int i=0; i<word.length(); i++)
		{
			if(word.charAt(i)==str.charAt(0))
			{
				return i;
			}
		}
		return -1;
	}
	
	boolean startsWith(String str)
	{
		int count=0;
		if(str.length()>word.length())
		{
			System.out.println("Given sub string length is longer than string");
		}
		else
		{
			for(int i=0; i<str.length(); i++)
			{
				if(word.charAt(i)==str.charAt(i))
				{
					count++;
				}
			}
			if(count==str.length())
			{
				return true;
			}
		
		}
		return false;
	}
	
	String subString(int beginIndex)
	{
		String substring="";
		
		for(int i=beginIndex; i<word.length(); i++)
		{
			substring += word.charAt(i);
		}
		
		return substring;
	}
	
	
	public static void main(String []args)
	{
		String input;
		int choose;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the input String: ");	
		input = obj.next();
		
		StringMethods str = new StringMethods(input);
		
		System.out.println("<-/-/--------String Methods----------/-/->");
		System.out.println(" 1.Concatenate\n 2.CharAt\n 3.endsWith\n 4.copyValueOf\n 5.indexOf\n 6.startsWith\n 7.subString\n 8.Assign new values\n 9.exit");
		while(true)
		{
			System.out.print("Enter the Option to perform string methods: ");	
			choose = obj.nextInt();
			switch(choose)
			{
				case 1:
					System.out.print("Enter the input String to Concatenate: ");
					String s1 = obj.next();
					System.out.println(str.concat(s1));
					break;
					
				case 2:
					System.out.print("Enter the index to get character from string: ");
					int in = obj.nextInt();
					System.out.println(str.CharAt(in));
					break;
					
				case 3:
					System.out.print("Enter the input String to check the string is endswith the string: ");
					String s2 = obj.next();
					System.out.println(str.endsWith(s2));
					break;
				
				case 4:
					System.out.print("Enter the size of character array: ");
					int size = obj.nextInt();
	
					System.out.println("Enter the input character to String: ");
					char[] c = new char[size];
					for(int i=0; i<size; i++)
					{
						c[i] = obj.next().charAt(0);
					}
					System.out.println(str.copyValueOf(c));
					break;
					
				case 5:
					System.out.print("Enter the input String to get the index of first character from : ");
					String s3 = obj.next();
					
					System.out.println(str.indexOf(s3));
					break;
				
				case 6:
					System.out.print("Enter the input String to check the string is starts with the string: ");
					String s4 = obj.next();
					System.out.println(str.startsWith(s4));
					break;
				
				case 7:
					System.out.print("Enter the index to get substring from string: ");
					int in2 = obj.nextInt();
					System.out.println(str.subString(in2));
					break;
				
				case 8:
					System.out.println("-----Assign New String-----");	
					System.out.print("Enter the input String: ");	
					input = obj.next();
					str = new StringMethods(input);
					break;
				
				case 9:
					System.exit(0);
				
				default:
					System.out.println("Enter the correct options to perfrom string method");
			}
		}
		
	}
}
