import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class demo
{
	int id;
	String name;
	
	public demo(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String toString()
	{
		return "id :"+id+" name :"+name+"";
	}
	
	public static void main(String[] args)
	{
		demo d = new demo(1, "jothipravin");
		demo d1 = new demo(2, "mubabi"); 
		ArrayList<demo> al = new ArrayList<demo>();
		al.add(d);
		al.add(d1);
		al.add(new demo(3, "nan"));
		al.add(new demo(4, "n"));
		al.add(new demo(5, "an"));
		al.add(new demo(6, "nn"));
		Comparator<demo> idCompare = (demo d2, demo d3) -> Integer.compare(d2.id, d3.id);
		Comparator<demo> idName = (demo d2, demo d3) -> d2.name.compareTo(d3.name);
		
		Collections.sort(al, idCompare);
		System.out.println(al);
		
		Collections.sort(al, idName);
		System.out.println(al);
	}
}
