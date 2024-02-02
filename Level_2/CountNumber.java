import java.util.Scanner;

public class CountNumber
{	
	
	public static void main(String args[])
	{
		int Number,count=0;
		Scanner num = new Scanner(System.in);
		System.out.print("Input an integer number less than ten billion: ");
		Number = num.nextInt();

		while(Number>0)
		{
			Number = Number/10;
			count++; 
		}
		System.out.println("Number of digits in the number: "+count);
		
	}
}

