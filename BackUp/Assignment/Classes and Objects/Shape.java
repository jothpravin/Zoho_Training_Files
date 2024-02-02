public class Shape 
{
    public int numSides;
    public double area;

    Shape(int numSides, double area) 
    {
        this.numSides = numSides;
        this.area = area;
    }
    public static void main(String[] args)
    {
        Shape s = new Shape(12, 2.5);
        System.out.println(s.area);
    }
}

class Rectanglee extends Shape 
{
    public double length;
    public double width;

    Rectanglee(int numSides, double area, double length, double width) 
    {
        super(numSides, area);
        this.length = length;
        this.width = width;
    }
    
    
}

