import java.util.Scanner;

public class SumofNumbers
{
	public static void main(String []args)
	{
		int Number1, Number2, sum;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Number1: ");
		Number1 = num.nextInt();
		System.out.print("Enter the Number2: ");
		Number2 = num.nextInt();
		
		sum=Number1+Number2;

		System.out.println("The sum of two numbers are: "+sum);
	}

}
