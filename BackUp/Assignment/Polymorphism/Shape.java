class Shape
{
	public void draw()
	{
		System.out.println("Drawing a Shape");
	}
}
class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing a Rectangle");
	}
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing a Circle");
	}
}
class PrintShape
{
	public static void main(String []args)
	{
		Shape s = new Shape();
		s.draw();
		Rectangle r = new Rectangle();
		r.draw();
		Circle c = new Circle();
		c.draw();
	}
}
