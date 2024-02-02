import java.util.Scanner;

public class NumberPowers{
	public static void main(String args[]){
		//Initailize
		int Number, Square, Cube, Fourth;
		
		//Get a value From User
		System.out.print("Enter the Number to get power series:");
		Scanner num = new Scanner(System.in);
		Number = num.nextInt();
		
		//Square
		Square = Number*Number;
		System.out.println("Square : "+Square);
		
		//Cube
		Cube  = Number*Number*Number;
		System.out.println("Cube : "+Cube);
		
		//Fourth power
		Fourth = Number*Number*Number*Number;
		System.out.println("Fourth : "+Fourth);
		
		
	}
}
