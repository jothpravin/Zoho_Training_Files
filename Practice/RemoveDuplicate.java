import java.util.Scanner;

public class RemoveDuplicate
{
	public static void main(String []args)
	{	
		String input, result="";
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String :");
		input = str.next();
		
		for(int i=0; i<input.length(); i++)
		{
			char currentChar = input.charAt(i);
			boolean check = false;
			
			for(int j=i+1; j<input.length(); j++)
			{
				if(currentChar==input.charAt(j))
				{
					result += (++currentChar);
					check = true;
					break;
				}	
			}
			if(!check)
				result += currentChar;
		}
		System.out.println(result);

	}
}
