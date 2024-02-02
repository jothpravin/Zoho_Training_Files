import java.util.Scanner;

public class BodyMassIndex{
	public static void main(String args[]){
		double height;
		float weight, BodyMassIndex;
		
		//Get the value of Weight
		System.out.print("Input Weight in pounds :");
		Scanner wh = new Scanner(System.in);
		weight = wh.nextInt();
		
		//Get the value of height
		System.out.print("Input height in inches :");
		height = wh.nextInt();
		
		//Formula to Calculate BMI
		BodyMassIndex = (float)(weight/(Math.pow(height,2)))*703;
		
		System.out.println("Body Mass Index is "+BodyMassIndex);
	}
}
