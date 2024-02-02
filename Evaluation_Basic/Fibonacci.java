import java.util.Scanner;

public class Fibonacci
{
	public static void main(String []args)
	{
		int Number1=0, Number2=1, Number3, N;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Number to get Fibonacci Sequence:");
		N = num.nextInt();
		
		System.out.print(Number1+" "+Number2+" ");
		int i=2;
		while(i<N)
		{
			Number3 = Number1+Number2;
			System.out.print(Number3+" ");
			Number1 = Number2;
			Number2 = Number3;
			i++;
		}
		
	}
}
