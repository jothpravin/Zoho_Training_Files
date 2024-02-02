import java.util.Scanner;

public class NaturalNumbersSum
{	
	
	public static void main(String args[])
	{
		int Number,sum=0;
		Scanner c = new Scanner(System.in);
		System.out.print("Input the Number: ");
		Number = c.nextInt();

		System.out.println("The first n natural numbers are:");
		System.out.println(Number);
		for(int i=1;i<=Number;i++)
		{
			System.out.println(i);
			sum = sum+i;
		}
		System.out.println("The sum of n natural numbers are:");
		System.out.println(Number);
		System.out.println(sum);
		
	}
}

