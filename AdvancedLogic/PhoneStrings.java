import java.util.Scanner;

public class PhoneStrings
{
	static void PrintString(int num, String[] a, String output)
	{
		if(num ==0)
		{
			System.out.println(output);
		}
		
		int n = num%10;
		String str = a[n];
		for(int i=0; i<str.length(); i++)
		{
			PrintString(num/10, a,str.charAt(i)+output);
		}
	}
	
	public static void main(String args[])
	{
		int Number;
		String output="";
		String DigitChar[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		Scanner str = new Scanner(System.in);
		
		System.out.print("Input number :");
		Number = str.nextInt();
		
		PrintString(Number, DigitChar, output);
		
	}
}
