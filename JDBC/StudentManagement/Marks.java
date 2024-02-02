class Marks
{
	private int markId;
	private int studentId;
	private int subjectId;
	private float subjectMark;
	
	public Marks(int studentId, int subjectId, float subjectMark)
	{
		this.markId = 0;
		this.studentId = studentId;
		this.subjectId = subjectId;
		this.subjectMark = subjectMark;
	}
	
	public int getMarkId() 
	{
		return markId;
	}

	// Getter for studentId
	public int getStudentId() 
	{
		return studentId;
	}

	// Getter for subjectId
	public int getSubjectId() 
	{
		return subjectId;
	}

	// Getter for subjectMark
	public float getSubjectMark() 
	{
		return subjectMark;
	}
	
	public void setMarkId(int markId)
	{
		this.markId = markId;
	}
	
	
}
