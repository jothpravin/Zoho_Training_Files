class Vehicle
{
	public void engine()
	{
		System.out.println("This vehicle is Electric engine");
	}
	public void brake()
	{
		System.out.println("This vehicle is used Disk brakes");
	}
}
class Yamaha extends Vehicle
{
	public void wheels()
	{
		System.out.println("This brand bikes have two wheels");
	}

	public void color()
	{
		System.out.println("This brand Most used color is black !");
	}
}
class PrintVehicle
{
	public static void main(String []args)
	{
		Vehicle v = new Vehicle();
		v.engine();
		v.brake();
		Yamaha y = new Yamaha();
		y.wheels();
		y.color();
		y.engine();
		y.brake();
	}
}
