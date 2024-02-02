import java.util.Scanner;

public class CompareTwoValues
{
	public static void main(String args[])
	{
		int num1, num2;
		Scanner n = new Scanner(System.in);
		System.out.print("Enter the Number1 :");
		num1 = n.nextInt();
		System.out.print("Enter the Number2 :");
		num2 = n.nextInt();

		if(num1==num2)
		{
			System.out.println("These two numbers are equal");
		}
		else if(num1>num2)
		{
			System.out.println("Number1 is greater than Number2");
		}
		else
		{
			System.out.println("Number2 is greater than Number1");
		}
	}
}
