public class Vehicle 
{
    public String make;
    public String model;
    public int year;

    public Vehicle(String make, String model, int year) 
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle 
{
    public String color;
    public int numDoors;

    public Car(String make, String model, int year, String color, int numDoors) 
    {
        super(make, model, year);
        this.color = color;
        this.numDoors = numDoors;
    }
    
    public static void main(String []args)
    {
    	
    }
}

