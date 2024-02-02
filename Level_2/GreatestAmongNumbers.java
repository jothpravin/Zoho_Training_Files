import java.util.Scanner;

public class GreatestAmongNumbers
{
	public static void main(String arg[])
	{
		int FirstNumber, SecondNumber, ThirdNumber;
		Scanner n = new Scanner(System.in);
		
		System.out.print("Input FirstNumber : ");
		FirstNumber = n.nextInt();
		System.out.print("Input SecondNumber : ");
		SecondNumber = n.nextInt();
		System.out.print("Input ThirdNumber : ");
		ThirdNumber = n.nextInt();
		
		if (FirstNumber>SecondNumber && FirstNumber>ThirdNumber)
		{
			System.out.println("The Greatest Among Three Number is :"+FirstNumber);
		}
		else if(SecondNumber>FirstNumber && SecondNumber>ThirdNumber)
		{
			System.out.println("The Greatest Among Three Number is :"+SecondNumber);
		}
		else
		{
			System.out.println("The Greatest Among Three Number is :"+ThirdNumber);
			
		}
	}
}

