import java.util.Scanner;
import java.text.DecimalFormat;

public class DecimalPlace
{
	public static void main(String arg[])
	{
		float Number1, Number2;
		Scanner n = new Scanner(System.in);
		
		System.out.print("Input floating point number: ");
		Number1 = n.nextFloat();
		
		System.out.print("Input floating point another number: ");
		Number2 = n.nextFloat();
		
		
		if (Math.abs(Number1 - Number2) <0.01)
		{
			System.out.println("The Floating Numbers "+Number1+" and "+Number2+ " are same upto two decimals");
		}
		else
		{
			System.out.println("They are different");
			
		}
	}
}

