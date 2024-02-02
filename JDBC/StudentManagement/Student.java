import java.util.Date;

class Student 
{
	private int studentId;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private Gender gender;
	private String address;

	// Constructor
	public Student(String firstName, String lastName, Date dateOfBirth, Gender gender, String address) 
	{
		this.studentId = 0;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.address = address;
	}
	
	public int getStudentId() 
	{
		return studentId;
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

	public String getAddress() 
	{
		return address;
	}
	
	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}

}

enum Gender
{
	MALE,
	FEMALE
}

