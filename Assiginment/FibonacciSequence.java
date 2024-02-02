import java.util.Scanner;

public class FibonacciSequence
{
	public static void main(String []args)
	{
		int n1=0,n2=1,n3, Input;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Limit to print fibonacci sequence: ");
		Input = num.nextInt();
		System.out.println();
		System.out.print(n1+" "+n2+" ");
		
		for(int i=2;i<=Input; i++)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
}
