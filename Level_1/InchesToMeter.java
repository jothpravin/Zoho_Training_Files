import java.util.Scanner;

public class InchesToMeter{
	public static void main(String args[]){
		double inches,meter=0;
		System.out.print("Input a value in inch: ");
		Scanner i = new Scanner(System.in);
		inches = i.nextDouble();
		
		meter = (0.0254*inches); //Formula to find the Meter
		
		System.out.println(inches+" inch is equal to "+meter+" meters");
	}
}
