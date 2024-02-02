import java.util.Scanner;

public class EqualOrNot
{
	public static void main(String arg[])
	{
		int FirstNumber, SecondNumber, ThirdNumber;
		Scanner n = new Scanner(System.in);
		
		System.out.print("Input the FirstNumber : ");
		FirstNumber = n.nextInt();
		System.out.print("Input the SecondNumber : ");
		SecondNumber = n.nextInt();
		System.out.print("Input the ThirdNumber : ");
		ThirdNumber = n.nextInt();
		
		if (FirstNumber==SecondNumber && FirstNumber==ThirdNumber)
		{
			System.out.println("All Numbers are Equal");
		}
		else if(FirstNumber==SecondNumber || FirstNumber==ThirdNumber || SecondNumber==ThirdNumber)
		{
			System.out.println("Neither all are equal or different");
		}
		else
		{
			System.out.println("All numbers are different");
			
		}
	}
}

