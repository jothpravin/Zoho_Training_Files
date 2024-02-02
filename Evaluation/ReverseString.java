import java.util.Scanner;

public class ReverseString
{
	public static void main(String []args)
	{
		System.out.print("Enter the input string:");
		Scanner str = new Scanner(System.in);
		String words = str.nextLine();
		
		String reverse[] = words.split(" ");
		String Concat="";
		
		for(int i=reverse.length-1;i>=0;i--)
		{
			Concat += reverse[i] + " ";
		}
		System.out.println(Concat+" ");
	}
}
