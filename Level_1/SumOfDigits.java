import java.util.Scanner;

public class SumOfDigits{
	public static void main(String args[]){
		int number,sum=0,backup,remainder;
		System.out.print("Input an integer between 0 and 1000: ");
		Scanner n = new Scanner(System.in);
		number = n.nextInt();
		backup=number;
		
		if(number<=1000) //Condition check the number is less than 1000
		{
			while(number!=0)
			{
				remainder = number%10;
				sum = sum + remainder;
				number = number/10;
			}
			System.out.println("The sum of all digit in "+backup+" is "+sum);
		}
		else
		{
			System.out.println("Given input value is "+number+" greater than 1000, Your input value must be less than 1000");
		}
	}
}
