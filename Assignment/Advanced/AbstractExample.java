abstract class Shape 
{
    public abstract double calculateArea();
}

class Circle extends Shape 
{
    private double radius;
    
    public Circle(double radius) 
    {
        this.radius = radius;
    }

    @Override
    public double calculateArea() 
    {
        return Math.PI * radius * radius;
    }
}

public class AbstractExample 
{
    public static void main(String[] args) 
    {
        Circle circle = new Circle(5.0);

        double area = circle.calculateArea();

        System.out.println("The area of the circle is: " + area);
    }
}

