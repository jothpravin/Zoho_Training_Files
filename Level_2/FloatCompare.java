import java.util.Scanner;

public class FloatCompare
{
	public static void main(String arg[])
	{
		float Number1, Number2;
		Scanner n = new Scanner(System.in);
		
		System.out.print("Input floating point number: ");
		Number1 = n.nextFloat();
		
		System.out.print("Input floating point another number: ");
		Number2 = n.nextFloat();
		
		Number1 = Math.round(Number1*1000);
		Number1 = Number1/1000;
		
		Number2 = Math.round(Number2*1000);
		Number2 = Number2/1000;
		
		if (Number1==Number2)
		{
			System.out.println("The Floating Numbers "+Number1+" and "+Number2+ " are same upto three decimals");
		}
		else
		{
			System.out.println("They are different");
			
		}
	}
}

