import java.util.Scanner;

public class LCM
{
	public static void main(String []args)
	{
		int Number1, Number2, LCM, GCD=1;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Number1 :");
		Number1 = num.nextInt();
		System.out.print("Enter the Number2 :");
		Number2 = num.nextInt();
		
		for(int i=1; i<=Number1 && i<=Number2; i++)
		{
			if(Number1 % i==0 && Number2 % i==0)
			{
				GCD = i;
			}
		}
		
		LCM = (Number1*Number2)/GCD;
		
		System.out.println("The LCM of the two Numbers is "+LCM);
	}
}
