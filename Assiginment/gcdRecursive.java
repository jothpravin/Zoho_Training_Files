import java.util.Scanner;

public class gcdRecursive
{
	static int gcd(int num1, int num2)
	{
		if(num1==0)
		{
			return num2;
		}
		else if(num2==0)
		{
			return num1;
		}
		else if(num1==num2)
		{
			return num1;
		}
		else if(num1>num2)
		{
			return gcd(num1-num2, num2);
		}
		else
		{
			return gcd(num1, num2-num1);
		}
		
	}	
	
	public static void main(String []args)
	{
		int Number1, Number2;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Number1 :");
		Number1 = num.nextInt();
		System.out.print("Enter the Number2 :");
		Number2 = num.nextInt();
		
		System.out.println("The GCD of two numbers are :"+gcd(Number1, Number2));
		
	}
}
