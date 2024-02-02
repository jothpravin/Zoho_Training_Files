class Exam
{
	private int examId;
	private String examName;
	
	public Exam(String examName)
	{
		this.examId = 0;
		this.examName = examName;	
	}
	
	public int getExamId()
	{
		return examId;
	}
	
	public String getExamName()
	{
		return examName;
	}
	
	public void setExamId(int examId)
	{
		this.examId = examId;
	}
}
