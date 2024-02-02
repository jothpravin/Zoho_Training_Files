import java.util.Scanner;

public class BirthYear
{
	public static void main(String []args)
	{
		int BirthYear, Age, CurrentYear=2023;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Age:");
		Age = num.nextInt();
		
		BirthYear = CurrentYear - Age;
		
		System.out.println("The BirthYear is :"+BirthYear);
		
	}
}
