import java.util.Scanner;

public class PositiveOrNegative{
	public static void main(String args[])
	{
		int Number;
		System.out.print("Input number : ");
		Scanner n = new Scanner(System.in);
		Number = n.nextInt();
		
		if(Number>0) //Condition check the number is Non negative Number 
		{
			System.out.println(Number+" Number is Positive");
		}
		else
		{
			System.out.println("Given input value is Negative number");
		}
	}
}
