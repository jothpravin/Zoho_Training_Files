class Section 
{
	private int sectionId;
	private String sectionName;

	public Section(String sectionName) 
	{
		this.sectionId = 0;
		this.sectionName = sectionName;
	}

	public int getSectionId() 
	{
		return sectionId;
	}

	public void setSectionId(int sectionId) 
	{
		this.sectionId = sectionId;
	}

	public String getSectionName() 
	{
		return sectionName;
	}

	public void setSectionName(String sectionName) 
	{
		this.sectionName = sectionName;
	}
}
