import java.util.Scanner;

class Calculator
{
	private int Number1, Number2;
	
	Calculator(int Number1, int Number2)
	{
		this.Number1 = Number1;
		this.Number2 = Number2;
	}
	
	public void add(int Number1,int Number2)
	{
		System.out.println("The Addition of two Numbers :"+(Number1+Number2));
		System.out.println();
	}
	
	public void sub(int Number1,int Number2)
	{
		System.out.println("The Subraction of two Numbers :"+(Number1-Number2));
		System.out.println();
	}
	
	public void mul(int Number1,int Number2)
	{
		System.out.println("The Multiplication of two Numbers :"+(Number1*Number2));
		System.out.println();
	}
	
	public void div(int Number1,int Number2)
	{
		if(Number2!=0)
		{
			System.out.println("The Division of two Numbers :"+(Number1/Number2));
			System.out.println();
		}
		else
		{
			System.out.println("Zero is not divisible Number");
			System.out.println();
		}
	}
}

public class CalculatorDemo
{
	public static void main(String []args)
	{
		int Number1, Number2, choose;
		Scanner num = new Scanner(System.in);
		System.out.println(" *********************");
		System.out.print("* Enter the Number1:");
		Number1 = num.nextInt();
		System.out.print("* Enter the Number2:");
		Number2 = num.nextInt();
		System.out.println(" *********************");
		
		System.out.println(" 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Assign New values\n 6.Exit");
		Calculator c = new Calculator(Number1, Number2);
		while(true)
		{
			System.out.println(" ------------------------------");
			System.out.print("| Enter the Option to perform:");
			choose = num.nextInt();
			System.out.println(" ------------------------------");
			
			switch(choose)
			{
				case 1:
					c.add(Number1, Number2);
					break;
					
				case 2:
					c.sub(Number1, Number2);
					break;
				
				case 3:
					c.mul(Number1, Number2);
					break;
					
				case 4:
					c.div(Number1, Number2);
					break;
					
				case 5:
					System.out.println("-----Assigining New Values-----");
					System.out.println();
					System.out.println(" *********************");
					System.out.print("* Enter the Number1:");
					Number1 = num.nextInt();
					System.out.print("* Enter the Number2:");
					Number2 = num.nextInt();
					System.out.println(" *********************");
					c = new Calculator(Number1, Number2);
					System.out.println(" 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Assign New values\n 6.Exit");
					break;
					
				case 6:
					System.out.println("Program Exited...");
					return;
				
				default:
					System.out.println("-----Enter the proper options-----\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Assign New values\n 6.Exit");
			}
		}
	}
}
