import java.util.Scanner;

public class CompareAndPrint
{
	public static void main(String arg[])
	{
		float Number;
		Scanner n = new Scanner(System.in);
		
		System.out.print("Input a Number: ");
		Number = n.nextFloat();
		
		if (Number>0)
		{
			System.out.println("The Value of m = "+Number);
			System.out.println("The Value of n = 1");
		}
		else if(Number==0)
		{
			System.out.println("The Value of m = "+Number);
			System.out.println("The Value of n = 0");
		}
		else
		{
			System.out.println("The Value of m = "+Number);
			System.out.println("The Value of n = -1");
			
		}
	}
}

