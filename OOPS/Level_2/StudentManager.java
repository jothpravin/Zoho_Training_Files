class StudentManager
{
	private Student[] students;
	private int studentCount;
	
	public StudentManager(int size)
	{
		students = new Student[size];
		studentCount = 0;
	}
	
	public void addStudent(Student student)
	{
		if(studentCount<students.length)
		{
			students[studentCount] = student;
			studentCount++;
		}
	}
	
	public void printAllStudents()
	{
		System.out.println("<---------All Student Names-------->");
		for(Student student: students)
		{
			if(student != null)
			System.out.println(student.getName()+", ");
		}
	}
	
	public void printAllSubjects()
	{
		if(students != null)
		{
			String[] subjectlists = students[0].getSubjects();
			System.out.println("<----------All-Subjects-List---------->");
			for(String subjectlist : subjectlists)
			{
				System.out.print(subjectlist+", ");
			}
		}
		System.out.println();
	}
	
	public void passedStudents()
	{
		System.out.println("<------------The Passed students------------->");
		for(Student student : students)
		{
			if(student != null && student.isPassed())
			{
				System.out.print(student.getName()+", ");
				System.out.println();
			}
		}
	}
	
	public void failedStudents()
	{
		int count=0;
		System.out.println("<------------The Failed students------------->");
		for(Student student : students)
		{
			if(student != null && student.isFailed())
			{
				System.out.print(student.getName()+", ");
				System.out.println();
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("There is no failed students");
			System.out.println();
		}
	}
	
	public void TopFiveStudent()
	{
		Student[] copyStudent = new Student[studentCount];
		
		for(int i=0; i<studentCount; i++)
			copyStudent[i] = students[i];
			
		for(int i=0; i<studentCount-1; i++)
		{
			for(int j=i+1; j<studentCount; j++)
			{
				if(copyStudent[i].totalMarks()<copyStudent[j].totalMarks())
				{
					Student temp = copyStudent[i];
					copyStudent[i] = copyStudent[j];
					copyStudent[j] = temp;
				}
			}
		}
		
		System.out.println("<------The Top five Students------>");
		for(int i=0; i<Math.min(5, studentCount); i++)
		{
			System.out.println((i+1)+". "+ copyStudent[i].getName()+" - Total Marks of "+ copyStudent[i].totalMarks());
		}
	}
	
	 public void subjectsWithHighestMark(String subjectName) 
	 {
		  int highestMark = 0;
		  String subjectStudents = "";

		  for (Student student : students) 
		  {
		      if (student != null && student.getSubjects() != null) 
		      {
		          for (int i = 0; i < student.getSubjects().length; i++) 
		          {
		              if (student.getSubjects()[i].equals(subjectName) && student.getMarks()[i] > highestMark) 
		              {
		                  highestMark = student.getMarks()[i];
		                  subjectStudents = student.getName();
		              } 
		              else if (student.getSubjects()[i].equals(subjectName) && student.getMarks()[i] == highestMark) 
		              {
		                  subjectStudents += ", " + student.getName();
		              }
		          }
		      }
        }

        System.out.println("Students with the highest mark in " + subjectName + ": " + subjectStudents);
    }
	
}

