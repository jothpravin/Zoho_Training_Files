import java.util.Scanner;

public class CheckNumber
{
	public static void main(String []args)
	{
		int Number;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Number Between 1 to 100: ");
		Number = num.nextInt();
		
		if(Number>=1 && Number<=50)
		{
			System.out.println("The number is in the lower half");
		}
		else if(Number>=51 && Number<=100)
		{
			System.out.println("The number is in the upper half");
		}
		else
		{
			System.out.println("Invalid number");
		}
	}

}
