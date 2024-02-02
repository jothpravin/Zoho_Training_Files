class R 
{
	private int length, width;
	
	R(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	
	public void Perimeter()
	{
		System.out.println("The perimeter of the rectangle is "+(length+width)*2);
	}
	
	public void Area()
	{
		System.out.println("The Area of the rectangle is "+(length*width));
	}
	
}
public class Rectangle
{
	public static void main(String[] args)
	{
		R p1 = new R(1, 5);
		R p2 = new R(5, 10);
		
		p1.Perimeter();
		p1.Area();
		p2.Perimeter();
		p2.Area();
	}
}
