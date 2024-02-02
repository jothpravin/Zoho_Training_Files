import java.util.Scanner;

public class RecursionString
{
	void Reverse(String []st, int len)
	{
		if(len==0)
		{
			return;
		}
		System.out.print(st[--len]+" ");
		Reverse(st, len);
		
	}
	public static void main(String []args)
	{
		String input;
		Scanner str = new Scanner(System.in);
		input = str.nextLine();
		RecursionString obj = new RecursionString();
		String arr[] = input.split(" ");
		int len = arr.length;
		obj.Reverse(arr, len);
	}
}
