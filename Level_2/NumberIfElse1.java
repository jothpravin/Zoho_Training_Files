import java.util.Scanner;

public class NumberIfElse1{
	public static void main(String args[])
	{
		float Number;
		System.out.print("Input number : ");
		Scanner n = new Scanner(System.in);
		Number = n.nextFloat();
		
		if(Number>0) //Condition check the number is Non negative Number 
		{
			if(Number<1)
			{
				System.out.println(Number+" Small Positive Number");
			}
			else if(Number>1000000)
			{
				System.out.println(Number+" Large Positive Number");
			}
			else
			{
				System.out.println(Number+" Positive Number");
			}
		}
		else if(Number<0) //Condition check the number is Non negative Number 
		{
			if(Math.abs(Number)<1)
			{
				System.out.println(Number+" Small Negative Number");
			}
			else if(Math.abs(Number)>1000000)
			{
				System.out.println(Number+" Large Negative Number");
			}
			else
			{
				System.out.println(Number+" Negative Number");
			}
		}
		else
		{	
			System.out.println("Number is Zero");
		}
	}
}
