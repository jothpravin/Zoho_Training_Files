import java.util.Scanner;

public class SimpleCalculator
{
	public static void main(String []args)
	{
		int Number1, Number2, choose;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Number1:");
		Number1 = num.nextInt();
		System.out.print("Enter the Number2:");
		Number2 = num.nextInt();
		
		System.out.println(" 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Exit");	
		
		while(true)
		{
			System.out.print("Enter the Option to perform:");
			choose = num.nextInt();
			
			switch(choose)
			{
				case 1:
					System.out.println(Number1+Number2);
					break;
					
				case 2:
					System.out.println(Number1-Number2);
					break;
				
				case 3:
					System.out.println(Number1*Number2);
					break;
					
				case 4:
					System.out.println(Number1/Number2);
					break;
					
				case 5:
					System.out.println("Program Exited..");
					return;
			}
		}
	}
}
