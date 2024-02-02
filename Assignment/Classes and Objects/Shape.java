public class Shape 
{
    public int numSides;
    public double area;

    public Shape(int numSides, double area) 
    {
        this.numSides = numSides;
        this.area = area;
    }
}

class Rectangle extends Shape 
{
    public double length;
    public double width;

    public Rectangle(int numSides, double area, double length, double width) 
    {
        super(numSides, area);
        this.length = length;
        this.width = width;
    }
    
    public static void main(String []args)
    {
    	
    }
}

