import java.util.Scanner;

public class AdultOrNot
{
	public static void main(String args[])
	{
		int age;
		Scanner n = new Scanner(System.in);
		System.out.print("Enter the age :");
		age = n.nextInt();

		if(age>=18)
		{
			System.out.println("You are an adult");
		}
		else
		{
			System.out.println("You are not yet an adult");
		}
	}
}
