import java.util.Scanner;

public class Leetcode
{
	public static void main(String[] args)
	{
		String myString;
		int count=0, subset=0;
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String with 0s and 1s:");
		myString = str.next();
		
		for(int i=0; i<myString.length(); i++)
		{
			if(myString.charAt(i)=='0')
			{
				count++;
			}
			else if(myString.charAt(i)=='1')
			{
				count--;
				subset++;
			}
		}
		if(count>=0)
		{
			System.out.println("The equal subset is: "+subset);
		}
		else
		{
			System.out.println("The equal subset is: "+(subset+count));
		}
	}
}
