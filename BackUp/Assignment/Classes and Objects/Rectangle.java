public class Rectangle
{
	private int length;
	private int width;
	
	Rectangle(int length, int width)
	{
		this.length = length;
		this.width	= width;
	}
	
	public int getArea()
	{
		return length*width;
	}
	
	public int getPerimeter()
	{
		return 2*(length+width);
	}
	
	public static void main(String []args)
	{
		Rectangle r = new Rectangle(2,2);
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
	}
}
