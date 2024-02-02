import java.util.Scanner;

public class PrimeNumRecursive
{
	static boolean Prime(int num, int i)
	{
		if(num<=2)
		{
			return (num==2) ? true: false;
		}
		else if(num%i==0)
		{
			return false;
		}
		else if(i*i>num)
		{
			return true;
		}
		return Prime(num, i++);
		
	}
	public static void main(String []args)
	{
		int Number, N=2;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Number :");
		Number = num.nextInt();
		
		if(Prime(Number, N))
		{
			System.out.println("It is a Prime Number");
		}
		else
		{
			System.out.println("It is a Non prime Number");
		}
		
	}
}
