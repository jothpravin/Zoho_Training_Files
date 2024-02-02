import java.util.*;

class Employee implements Comparable<Employee>
{
	int empId;
	String name;
	public Employee(int empId, String name)
	{
		this.empId = empId;
		this.name = name;
	}
	
	public int compareTo(Employee id)
	{
		return this.empId - id.empId;
	}
	
	public void toString()
	{
		
	}
}
//class EmployeeCom implements Comparator<Employee>
//{
//	public int com
//}

public class Comparablee
{

	public static void main(String []args)
	{	
		
		ArrayList<Employee> l = new ArrayList<>();
		
		l.add(new Employee(1,"pravin"));
		l.add(new Employee(2, "jai"));
		l.add(new Employee(3, "jaya"));
		
		Collections.sort(l);
		System.out.println(l);
	}
}

