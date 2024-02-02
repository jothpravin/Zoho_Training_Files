import java.util.Scanner;

public class MultipleTable
{
	public static void main(String []args)
	{
		int N, Row;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Number to get Multiplication Table:");
		N = num.nextInt();
		System.out.print("Enter the Row to Print: ");
		Row = num.nextInt();
		
		for(int i=1; i<=Row; i++)
		{
			System.out.println(i+" X "+N+" = "+i*N);
		}
	}
}
