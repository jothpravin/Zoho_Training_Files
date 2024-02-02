import java.util.Scanner;

public class SwapWithoutTemp
{
	public static void main(String []args)
	{
		int Number1, Number2;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Number1:");
		Number1 = num.nextInt();
		System.out.print("Enter the Number2:");
		Number2 = num.nextInt();
		
		System.out.println("Before Swap "+Number1+" "+Number2);
		
		Number1 = Number1 * Number2;
		Number2 = Number1 / Number2;
		Number1 = Number1 / Number2;
		
		System.out.println("After Swap "+Number1+" "+Number2);
	}
}
