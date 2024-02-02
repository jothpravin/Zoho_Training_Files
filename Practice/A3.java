import java.util.Scanner;

public class A3
{
	public static void main(String [] args)
	{
		StringBuilder s = new StringBuilder();
		String s2="", s1;
		Scanner str = new Scanner(System.in);
		s1 = str.nextLine();
		
		if(s1 != null)
		{
			for(int i=s1.length()-1; i>=0; i--)
			{
				s2 += s1.charAt(i);
			}
		}
		s.append(s2);
		StringBuilder s3 = s.reverse();
		System.out.println(s3);
		System.out.println(s2);
	}
}
