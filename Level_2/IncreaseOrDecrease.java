import java.util.Scanner;

public class IncreaseOrDecrease
{
	public static void main(String arg[])
	{
		int FirstNumber, SecondNumber, ThirdNumber;
		Scanner n = new Scanner(System.in);
		
		System.out.print("Input First Number : ");
		FirstNumber = n.nextInt();
		System.out.print("Input Second Number : ");
		SecondNumber = n.nextInt();
		System.out.print("Input Third Number : ");
		ThirdNumber = n.nextInt();
		
		if (FirstNumber<SecondNumber && SecondNumber<ThirdNumber)
		{
			System.out.println("Increasing Order");
		}
		else if(FirstNumber>SecondNumber && SecondNumber>ThirdNumber)
		{
			System.out.println("Decreasing Order");
		}
		else
		{
			System.out.println("Neither increasing or decreasing order");
			
		}
	}
}

