import java.util.Scanner;

public class Greetings
{
	public static void main(String args[])
	{
		String Name;
		Scanner name = new Scanner(System.in);
		System.out.print("Enter your Name:");
		Name = name.nextLine();
		System.out.println("Welcome "+Name);
	}
		
}
