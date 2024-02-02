class Student
{
	private int studentId;
	private String name;
	private String[] subjects;
	private int[] marks;

	public Student(int studentId, String name, String[] subjects, int[] marks) 
	{
        this.studentId = studentId;
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
      }
      
      public String[] getSubjects()
      {
      	return subjects;
      }
      
      public String getName()
      {
      	return name;
      }
      
      public boolean isPassed()
      {
      	for(int mark: marks)
      	{
      		if(mark<35)
      		{
      			return false;
      		}
      	}
      	return true;
      }
      
      public boolean isFailed()
      {
      	return !isPassed();
      }
      
      public int totalMarks()
      {
      	int totalMark=0;
      	for(int mark: marks)
      	{
      		totalMark += mark;
      	}
      	return totalMark;
      }
      
      public int[] getMarks() 
      {
        return marks;
   	}
      
      
}
