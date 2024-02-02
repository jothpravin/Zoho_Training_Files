import java.util.Scanner;

public class SumAndAverage
{	
	
	public static void main(String args[])
	{
		int Number,sum=0;
		float Average;
		Scanner c = new Scanner(System.in);

		System.out.println("Input the 5 numbers:");
		for(int i=1;i<=5;i++)
		{
			Number = c.nextInt();
			sum = sum+Number;
		}
		System.out.println("The Sum of 5 :"+sum);
		Average = sum/5;
		System.out.println("The Average of 5 :"+Average);
		
	}
}

