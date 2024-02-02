import java.util.Scanner;

public class Adjacent
{
	public static void main(String []args)
	{
		String string1, string2, temp="", temp1="";
		Scanner str = new Scanner(System.in);
		//System.out.print("Enter the first string :");
		string1 = "asdfghij";
		//System.out.print("Enter the second string :");
		string2 = "adsfgijh";
		
		for(int i=0; i<string1.length(); i++)
		{
			if(string1.charAt(i)!=string2.charAt(i))
			{
				temp += string1.charAt(i);
				temp1 += string2.charAt(i);
			}
			else
			{
				if(temp!="")
				{
					System.out.println(temp+" - "+temp1);
					temp="";
					temp1="";
				}
			}
		}
		System.out.println(temp+" - "+temp1);
	}
}
