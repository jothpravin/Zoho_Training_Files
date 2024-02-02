class Subject
{
	private int subId;
	private String subjectName;
	 
	public Subject(String subjectName)
	{
		this.subId = 0;
		this.subjectName = subjectName;
	}
	
	public int getSubId()
	{
		return subId;
	}
	
	public String getSubjectName()
	{
		return subjectName;
	}
	
	public void setSubId(int subId)
	{
		this.subId = subId;
	}
}
