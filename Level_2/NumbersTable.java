import java.util.Scanner;

public class NumbersTable
{	
	
	public static void main(String args[])
	{
		int Number;
		Scanner c = new Scanner(System.in);
		
		System.out.print("Input number of terms:");
		Number = c.nextInt();
		
		for(int i=0;i<=5;i++)
		{	
			System.out.println(Number+" X "+i+" = "+(Number*i));
		}
		
	}
}
