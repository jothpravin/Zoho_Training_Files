import java.util.Scanner;

public class StringDecode
{
	public static void main(String []args)
	{
		String input;
		int num=0, count=0,temp=0;
		String decode="";
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the encoded String :");
		input = str.next();
		
		for(int i=0; i<input.length(); i++)
		{
			if(Character.isDigit(input.charAt(i)))
			{
				num = Integer.parseInt(String.valueOf(input.charAt(i)));
			}
			else if(input.charAt(i)=='[')
			{
				count++;
			}
			else if(Character.isLetter(input.charAt(i)))
			{
				if(count<=1)
				{
					decode += input.charAt(i);
				}
				else
				{
					num=temp;
					while(temp>0)
					{
						decode +=input.charAt(i);
						temp--;
					}
				}
			}
			else if(input.charAt(i)==']')
			{
				count--;
			}
			if(count==0)
			{
				for(int j=0; j<num; j++)
				{
					System.out.print(decode);
				}
				decode = "";
			}
			else
			{
				for(int j=0; j<num; j++)
				{
					System.out.print(decode);
				}
			}
		}
	}
}
