public class Person
{
	public String name;
	public int age;
	public String address;
	
	public Person(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
}
class Student extends Person
{
	public char grade;
	public String school;
	
	public Student(String name, int age, String address, char grade, String school)
	{
		super(name, age, address);
		this.grade = grade;
		this.address = address;
	}
	
	public static void main(String []args)
	{
		
	}
}
