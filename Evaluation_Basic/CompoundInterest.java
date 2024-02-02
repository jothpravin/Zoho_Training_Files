import java.util.Scanner;

public class CompoundInterest
{
	public static void main(String []args)
	{
		int Principle, time;
		double Compound,rate;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Principle:");
		Principle = num.nextInt();
		System.out.print("Enter the Interst rate:");
		rate = num.nextDouble();
		System.out.print("Enter the time:");
		time = num.nextInt();
 
 		Compound = Principle * (Math.pow((1 + rate / 100), time));
       	
		System.out.println("The Compund Interest is "+Compound);
		
	}
}
