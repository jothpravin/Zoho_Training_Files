import java.util.Scanner;

public class IndividualDigit{
	public static void main(String args[])
	{
		int number, backup;
		System.out.print("Input an integer between : ");
		Scanner n = new Scanner(System.in);
		number = n.nextInt();
		
		if(number>0) //Condition check the number is Non negative Number 
		{
			int value1 = number / 100000 % 10;
			int value2 = number / 10000 % 10;
			int value3 = number / 1000 % 10;
			int value4 = number / 100 % 10;
			int value5 = number / 10 % 10;
			int value6 = number % 10;
			
			System.out.println(value1+" "+value2+" "+value3+" "+value4+" "+value5+" "+value6);
		}
		else
		{
			System.out.println("Given input value is Negative number, Give a positive integer");
		}
	}
}
