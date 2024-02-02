import java.util.Date;

class User
{
	private long userID;
	private String userName;
	private String password; 
	private String email;
	private Date dob;
	private String bio;
	private Status status;
	private Gender gender;
	
	public User(String userName, String password, String email, Date dob, String bio, Gender gender)
	{
		this.userID = 0;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.dob = dob;
		this.bio = bio;
		this.gender = gender;
	}
	
	public long getUserID() 
	{
		return userID;
	}

	public void setUserID(long userID) 
	{
		this.userID = userID;
	}

	public String getUserName() 
	{
		return userName;
	}
	
	public String getPassword() 
	{
		return password;
	}

	public String getEmail() 
	{
		return email;
	}

	public Date getDob() 
	{
		return dob;
	}

	public String getBio() 
	{
		return bio;
	}
	
	public Status getStatus()
	{
		return status;
	}
	
	public Gender getGender()
	{
		return gender;
	}
}


enum Status
{
	ONLINE,
	OFFLINE
}

enum Gender
{
	male,
	female
}
