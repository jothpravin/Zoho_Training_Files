import java.util.Scanner;

public class CelsiusToFahern{
	public static void main(String args[]){
		float fahrenheit=0f,celsius;
		System.out.print("Input a degree in Celsius: ");
		Scanner f = new Scanner(System.in);
		celsius = f.nextFloat();
		
		fahrenheit = (celsius*9/5)+32; //Formula to find the fahrenheit
		
		System.out.println(celsius+" degree Celsius is equal to "+fahrenheit+" in fahrenheit");
	}
}
