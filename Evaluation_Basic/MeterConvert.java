import java.util.Scanner;

public class MeterConvert
{
	public static void main(String []args)
	{
		int Meter, Inch=0, Centimeter=0, Feet=0;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Meter:");
		Meter = num.nextInt();
		
		System.out.println("The Meter to Inches is :"+Meter*0.0254);
		System.out.println("The Meter to Feet is :"+Meter*3.28084);
		System.out.println("The Meter to Centimeters is :"+Meter*100);
		
	}
}
