import java.util.Scanner;

public class ReverseWords
{	
	
	public static void main(String args[])
	{
		String Input ;
		
		System.out.print("Enter the String to get reversed:");
		Scanner str = new Scanner(System.in);
		Input = str.nextLine();
		
		String reverse[] = Input.split(" ");
		String Concat="";
		
		for(int i=reverse.length-1;i>=0;i--)
		{
			Concat += reverse[i] + " ";
		}
		System.out.println(Concat+" ");
	}
}
