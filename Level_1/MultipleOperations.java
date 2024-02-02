import java.util.Scanner;

public class MultipleOperations{
	public static void main(String args[]){
		//Initailize
		int FirstInteger, SecondInteger, Sum, Difference, Product, Distance, Maximum, Minimum;
		float Average;
		
		//Get a value From User
		System.out.print("Enter the First Integer:");
		Scanner num = new Scanner(System.in);
		FirstInteger = num.nextInt();
		
		System.out.print("Enter the Second Integer:");
		SecondInteger = num.nextInt();
		
		//Sum
		Sum = FirstInteger+SecondInteger;
		System.out.println("Sum of two Integers : "+Sum);
		
		//Difference
		Difference = FirstInteger-SecondInteger;
		System.out.println("Difference of two Integers : "+Difference);
		
		//Product
		Product = FirstInteger*SecondInteger;
		System.out.println("Product of two Integers : "+Product);
		
		//Average
		Average = (FirstInteger+SecondInteger)/2;
		System.out.println("Average of two Integers : "+Average);
		
		//Distance
		Distance = Math.abs(FirstInteger-SecondInteger);
		System.out.println("Distance of two Integers : "+Distance);
		
		//Maximum
		if(FirstInteger>SecondInteger)
		{
			Maximum = FirstInteger;
			System.out.println("Maximum of two Integers : "+FirstInteger);
		}
		else
		{
			System.out.println("Maximum of two Integers : "+SecondInteger);
		}
		
		//Minimum
		if(FirstInteger<SecondInteger)
		{
			Minimum = FirstInteger;
			System.out.println("Minimum of two Integers : "+FirstInteger);
		}
		else
		{
			System.out.println("Minimum of two Integers : "+SecondInteger);
		}
		
		
	}
}
