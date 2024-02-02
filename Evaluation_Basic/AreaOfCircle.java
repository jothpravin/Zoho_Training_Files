import java.util.Scanner;

public class AreaOfCircle
{
	public static void main(String []args)
	{
		int Radius;
		float Pi = 3.14f,AreaOfCircle;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Radius:");
		Radius = num.nextInt();
		
		AreaOfCircle = Pi*Radius*Radius;
		
		System.out.println("The AreaOfCircle is :"+AreaOfCircle);
		
	}
}
