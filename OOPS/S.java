public class S
{
	private String name;
	private char grade;
	private int age;
	
	S(String name, int age, char grade)
	{
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	private String getName()
	{
		return name;
	}
	
	private int getAge()
	{
		return age;
	}
	
	public char getGrade()
	{
		return grade;
	}
	
	private void setName(String name)
	{
		this.name = name;
	}
	
	private void setAge(int age)
	{
		this.age = age;
	}
	
	public void setGrade(char grade)
	{
		this.grade = grade;
	}

}
