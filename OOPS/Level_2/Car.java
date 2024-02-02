class CarClass
{
	private String carName;
	private String carModel;
	private String carColor;
	private String carType;
	private int carSeats;
	private int carGears;
	
	CarClass(String carName, String carModel, String carColor,String carType,int carSeats, int carGears)
	{
		this.carModel = carModel;
		this.carName = carName;
		this.carColor = carColor;
		this.carType = carType;
		this.carSeats = carSeats;
		this.carGears = carGears;
		PrintDetails(this.carName, this.carModel, this.carColor, this.carType, this.carSeats, this.carGears);
	}
	void PrintDetails(String carName, String carModel, String carColor,String carType,int carSeats, int carGears)
	{
		System.out.println("Car Name: "+carName);
		System.out.println("Model Name: "+carModel);
		System.out.println("Engine Type: "+carType);
		System.out.println("Car Color: "+carColor);		
		System.out.println("No of Seats : "+carSeats);	
		System.out.println("No of Gears : "+carGears);
		System.out.println("<=========================>");
	}
}

public class Car
{
	
	public static void main(String []args)
	{
		CarClass car = new CarClass("Mahindra", "XUV700", "Blue", "Electric Engine", 7, 6);
		CarClass car1 = new CarClass("Telsa", "X100", "Black", "Electric Engine", 4, 6);
		CarClass car2 = new CarClass("Ferrai", "F10", "Red", "Petrol Engine", 2, 7);
		CarClass car3 = new CarClass("Mahindra", "THAR", "Black", "Diesel Engine", 6, 6);
		CarClass car4 = new CarClass("BMW", "B20", "Blue", "Electric Engine", 4, 5);
	}
}
