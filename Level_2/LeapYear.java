import java.util.Scanner;

public class LeapYear
{
	public static void main(String arg[])
	{
		int Year;
		Scanner n = new Scanner(System.in);
		
		System.out.print("Input the Year: ");
		Year = n.nextInt();
		
		if (Year%400==0 || Year % 4==0 && Year % 100 !=0)
		{
			System.out.println(Year+" is a Leap Year");
		}
		else
		{
			System.out.println(Year+" is not a Leap Year");
			
		}
	}
}

