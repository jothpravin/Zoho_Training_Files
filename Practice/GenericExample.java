import java.util.*;

public class GenericExample
{
	public static void main(String []args)
	{
		ArrayList<String> l = new ArrayList<String>();
		l.add("Pravin");
		l.add("Jai");
		l.add("Mubabi");
		m1(l);
		System.out.println(l);
		
	}
	
	public static void m1(ArrayList l)
	{
		l.add(10);
		l.add(10.5);
		l.add(true);
	} 
}
