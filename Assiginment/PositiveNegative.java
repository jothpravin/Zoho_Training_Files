import java.util.Scanner;

public class PositiveNegative
{
	public static void main(String args[])
	{
		int number;
		Scanner n = new Scanner(System.in);
		System.out.print("Enter the Number :");
		number = n.nextInt();

		if(number==0)
		{
			System.out.println("The numbers is Zero");
		}
		else if(number>0)
		{
			System.out.println("Number is Positive");
		}
		else
		{
			System.out.println("Number is Negative");
		}
	}
}
