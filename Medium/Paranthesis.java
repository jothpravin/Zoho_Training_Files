import java.util.Scanner;

public class Paranthesis
{	
	public static int CloseParanthesis(String str, int open)
	{
		int count =0;
		for(int i=open;i<str.length(); i++)
		{
			char c = str.charAt(i);
			if(c=='(')
			{
				count++;
			}
			else if(c == ')')
			{
				count--;
				
				if(count==0)
				{
					return i;
				}
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		int Number;
		String Sens;
		Scanner num = new Scanner(System.in);
		System.out.print("Input a String : ");
		Sens = num.nextLine();
		
		System.out.print("Input a Number of Index of opening paraenthesis: ");
		Number = num.nextInt();
		
		System.out.println("Closing position is "+CloseParanthesis(Sens, Number));
	}
}
