class C
{
	private String make;
	private String model;
	private int year;
	private float mileage;
	
	C(String make, String model, int year, float mileage)
	{
		this.make = make;
		this.model = model;
		this.year = year;
		this.mileage = mileage;
	}
	
	private String getMake()
	{
		return make;
	}
	
	private String getModel()
	{
		return model;
	}
	
	private int getYear()
	{
		return year;
	}
	
	public float getMileage()
	{
		return mileage;
	}
	
	private void setMake(String make)
	{
		this.make=make;
	}
	
	private void setModel(String model)
	{
		this.model=model;
	}
	
	private void setYear(int year)
	{
		this.year=year;
	}
	
	public void setMileage(float mileage)
	{
		this.mileage=mileage;
	}
	
	
}

public class Car
{
	public static void main(String []args)
	{
		C c1 = new C("Telsa", "X100", 2020, 55.6f);	
		System.out.println(c1.getMileage());
		c1.setMileage(57.7f);
		System.out.println(c1.getMileage());
	}
}
