import java.util.*;

public class Employee implements Comparable<Employee>
{
	int age;
	String name;
	
	Employee(int age, String name)
	{
		this.age = age;
		this.name = name;
	} 
	
	public String toString()
	{
		return age+" "+name;
	}
	
	public int compareTo(Employee e1)
	{
		return this.age > e1.age ? 1 : -1;
	}
	public static void main(String []args)
	{
		List<Employee> l = new ArrayList<>();
		l.add(new Employee(22, "Pravin"));
		l.add(new Employee(21, "jai"));
		l.add(new Employee(2, "mubabi"));
		l.add(new Employee(1, "Noor"));
		
		
		Collections.sort(l);
		
		for(Employee e: l)
		{
			System.out.println(e);
		}
	}
}
