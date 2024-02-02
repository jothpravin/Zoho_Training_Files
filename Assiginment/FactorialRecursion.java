import java.util.Scanner;

public class FactorialRecursion
{
	static int Fact(int num)
	{	
		if(num==0)
		{
			return 1;
		}
		else
			return (num*(Fact(num-1)));
		
	}
	public static void main(String []args)
	{
		int Number;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Number :");
		Number = num.nextInt();
	
		System.out.println("The Factorial of the Number is :"+Fact(Number));
		
		
	}
}
