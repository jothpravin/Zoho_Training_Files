import java.util.Scanner;

public class CheckString
{
	public static void main(String []agrs)
	{
		String Target = "java", Words, wordArray[];
		int Count = 0;
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String :");
		Words = str.nextLine();
		
		wordArray = Words.split(" ");
		
		for(int i=0; i<wordArray.length; i++)
		{
			if(wordArray[i].equals(Target))
			{
				Count++;
				break;
			}
		}
		if(Count==1)
		{
			System.out.println("The string contains Java");
		}
		else
		{
			System.out.println("The string does not contains Java");
		}
	}
}
