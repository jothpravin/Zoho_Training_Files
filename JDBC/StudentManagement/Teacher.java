import java.util.Date;

class Teacher
{
	private int teacherId;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private Gender gender;
	private String subjectTaught;
	private String degree;
	private String category;

	public Teacher(String firstName, String lastName, Date dateOfBirth, Gender gender, String subjectTaught, String degree, String category) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.subjectTaught = subjectTaught;
		this.degree = degree;
		this.category = category;
	}
	
	public int getTeacherId() 
	{
		return teacherId;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public Date getDateOfBirth() 
	{
		return dateOfBirth;
	}

	public Gender getGender() 
	{
		return gender;
	}

	public String getSubjectTaught() 
	{
		return subjectTaught;
	}

	public String getDegree() 
	{
		return degree;
	}
	
	public String getCategory() 
	{
		return category;
	}
	
	public void setTeacherId(int teacherId)
	{
		this.teacherId = teacherId;
	}
}
