class Person1 
{
	
	private String name;
	private int age;
	
	Person1(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
}
public class Person
{
	public static void main(String[] args)
	{
		Person1 p1 = new Person1("JothiPravin", 22);
		Person1 p2 = new Person1("Jainul", 21);
		
		System.out.println("The Name is "+p1.getName()+" and the age is "+p1.getAge());
		System.out.println("The Name is "+p2.getName()+" and the age is "+p2.getAge());
	}
}
