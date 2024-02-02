import java.util.Scanner;

public class sample
{
	public static void main(String args[])
	{
		char ch,ch1;
		int count=0;
		Scanner str =new Scanner(System.in);
		String word = "hello world", temp="";
		System.out.print("Enter the character to remove ");
		ch = str.next().charAt(0);
		ch1 = Character.toLowerCase(ch);
		
		for(int i =0; i<word.length(); i++)
		{
			if(word.charAt(i)!=ch1)
			{
				temp += word.charAt(i);
				count++;
			}
		}
		if(count!=word.length())
		{
			System.out.println(temp);
		}
		else
		{
			System.out.println("The character you entered is not present in the string ");
		}
	}
}
