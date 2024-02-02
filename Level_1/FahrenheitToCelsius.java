import java.util.Scanner;

public class FahrenheitToCelsius{
	public static void main(String args[]){
		float fahrenheit,celsius=0;
		System.out.print("Input a degree in Fahrenheit: ");
		Scanner f = new Scanner(System.in);
		fahrenheit = f.nextFloat();
		
		celsius = (fahrenheit-32)*5/9; //Formula to find the Celsius
		
		System.out.println(fahrenheit+" degree Fahrenheit is equal to "+celsius+" in Celsius");
	}
}
