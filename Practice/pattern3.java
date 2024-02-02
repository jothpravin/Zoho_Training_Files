import java.util.Scanner;

public class pattern3
{
	public static void main(String []args)
	{
		int len = 0;
		String word, ans="";
		Scanner str = new Scanner(System.in);
		System.out.println("Enter the String");
		word = str.next();
		len = word.length();
		int n = len/2;
		
		for(int i=0;i<len; i++)
		{
			for(int j=0; j<(len-i); j++)
			{
				System.out.print("*");
			}
			ans += word.charAt(n);
			System.out.print(ans);
			n++;
			if(n==len)
			{
				n=0;
			}
			System.out.println();
		}
	}
}
