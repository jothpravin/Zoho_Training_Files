import java.util.Scanner;

public class Test
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();
		//s.nextLine();
		String name = s.nextLine();
		int age = s.nextInt();
		System.out.println("Id :"+id+" Name :"+name+" age :"+age);
		
	}
}
