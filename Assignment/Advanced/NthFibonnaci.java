import java.util.Scanner;

public class NthFibonnaci
{
	public static int fib(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return fib(n-1) + fib(n-2);
	}
	public static void main(String []args)
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number to get the Nth Fibonnaci :");
		n = s.nextInt();

		System.out.println("Nth Fibonnaci :"+fib(n));
	}
}
