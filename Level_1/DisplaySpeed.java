import java.util.Scanner;

public class DisplaySpeed{
	public static void main(String args[]){
		//Initialize
		float Distance,Hour,Minutes,Seconds,TimeSeconds;
		float MeterPerSecond, KilometerPerHour, MilesPerHour;
		
		//Get the value of Distance
		System.out.print("Input Distance in meters :");
		Scanner input = new Scanner(System.in);
		Distance = input.nextFloat();
		
		//Get the value of Hour
		System.out.print("Input Hour :");
		Hour = input.nextFloat();
		
		//Get the value of Minutes
		System.out.print("Input Minutes :");
		Minutes = input.nextFloat();
		
		//Get the value of Seconds
		System.out.print("Input Seconds :");
		Seconds = input.nextFloat();
		
		TimeSeconds = (3600*Hour) + (60*Minutes) + Seconds;
		
		MeterPerSecond = Distance/TimeSeconds;
		KilometerPerHour = (Distance/1000.0f)/(TimeSeconds/3600.0f);
		MilesPerHour = (KilometerPerHour/1.609f);
		
		System.out.println("Your speed in meters/seconds is "+MeterPerSecond);
		System.out.println("Your speed in km/h is "+KilometerPerHour);
		System.out.println("Your speed in miles/h is "+MilesPerHour);
	}
}
