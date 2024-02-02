import java.util.Scanner;

public class Fibonnaci
{
	public static void Fib(int n)
	{
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.print(" "+n1);
		System.out.print(" "+n2);
		for(int i=2; i<n; i++)
		{
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+n3);
		}
	}
	public static void main(String []args)
	{
		int n;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the range to generate Fibonnaci series : ");
		n = num.nextInt();
		Fib(n);
	}
}
