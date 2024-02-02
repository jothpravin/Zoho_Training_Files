import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

class StudentManagement
{
	Scanner in = new Scanner(System.in);
	StudentDAO studentDAO = new StudentDAO();
	TeacherDAO teacherDAO = new TeacherDAO();
	
	public void addNewStudent()
	{
		try
		{
			System.out.print("Enter the Student first name: ");
			String f_name = in.next();
			System.out.print("Enter the Student second name: ");
			String l_name = in.next();
			System.out.print("Enter the Student date of birth(dd/mm/yyyy): ");
			String dob = in.next();
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = formatter.parse(dob);
			System.out.println("\n1.Male\n2.Female\nEnter Gender: ");
			int n = in.nextInt();
			Gender g = null;
			if(n==1)
			{
				g = Gender.MALE;
			}
			else if(n==2)
			{
				g = Gender.FEMALE;
			}
			in.nextLine();
			System.out.print("Enter the address :");
			String add = in.nextLine();
			showAllClasses();
			System.out.print("Enter the Student class id: ");
			int cls_id = in.nextInt();
			showAllSections();
			System.out.print("Enter the Student section id: ");
			int sec_id = in.nextInt();
			
			Student newStudent = new Student(f_name, l_name, date, g, add);
			studentDAO.addStudent(newStudent, cls_id, sec_id);
			System.out.println("New student added with ID: " + newStudent.getStudentId());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void addNewTeacher()
	{
		try
		{
			System.out.print("Enter the Teacher first name: ");
			String f_name = in.next();
			System.out.print("Enter the Teacher second name: ");
			String l_name = in.next();
			System.out.print("Enter the Teacher date of birth(dd/mm/yyyy): ");
			String dob = in.next();
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = formatter.parse(dob);
			System.out.println("\n1.Male\n2.Female\nEnter Gender: ");
			int n = in.nextInt();
			Gender g = null;
			if(n==1)
			{
				g = Gender.MALE;
			}
			else if(n==2)
			{
				g = Gender.FEMALE;
			}
			showAllSubjects();
			System.out.print("Enter the Subject Id :");
			int sub = in.nextInt();
			String subj = selectSubject(sub);
			System.out.print("Enter the Degree:");
			String deg = in.next();
			System.out.print("Enter the Category:");
			String cat = in.next();
			showAllClasses();
			System.out.print("Enter the Student class id: ");
			int cls_id = in.nextInt();
			showAllSections();
			System.out.print("Enter the section class id: ");
			int sec_id = in.nextInt();
			Teacher teacher = new Teacher(f_name, l_name, date, g, subj, deg, cat);
			teacherDAO.addTeacher(teacher, cls_id, sec_id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void addTeacherNewSubject()
	{
		showAllTeachers();
		System.out.print("Enter the Teacher Id :");
		int teachId = in.nextInt();
		showAllSubjects();
		System.out.print("Enter the Subject Id :");
		int subId = in.nextInt();
		teacherDAO.addTeacherSubject(teachId, subId);
	}
	
	public void addStudentMarks()
	{
		List<Subject> subject = teacherDAO.getAllSubjects();
		int count = subject.size();
		try
		{	showAllExams();
			System.out.print("Enter the Exam Id :");
			int examId = in.nextInt();
			showStudentNamesWithId();
			System.out.print("Enter the Student Id :");
			int sub = in.nextInt();
			for(int i=0; i<count; i++)
			{
				System.out.print("Enter the "+subject.get(i).getSubjectName()+" mark :");
				int subMark = in.nextInt();
				Marks m = new Marks(sub, subject.get(i).getSubId(), subMark);
				studentDAO.addStudentMarks(m, examId);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void addSubject()
	{
		System.out.print("Enter the Subject Name :");
		String sub = in.next();
		
		Subject subject = new Subject(sub);
		teacherDAO.addSubject(subject);
	}
	
	public void addNewClass()
	{
		System.out.print("Enter the Class Name :");
		in.nextLine();
		String cls = in.nextLine();
		
		Class c = new Class(cls);
		teacherDAO.addClass(c);
	}
	
	public void addNewSection()
	{
		System.out.print("Enter the Section Name :");
		String sec = in.next();
		
		Section s = new Section(sec);
		teacherDAO.addSection(s);
	}
	
	public void showAllStudents() 
	{
		List<Student> allStudents = studentDAO.getAllStudents();

		System.out.println("All Students:");
		System.out.printf("%-10s %-20s %-12s %-8s %-50s\n", "Student ID", "Name", "Date of Birth", "Gender", "Address");
		System.out.println("------------------------------------------------------------");

		for (Student student : allStudents) 
		{
			System.out.printf("%-10d %-20s %-12s %-8s %-50s\n",
			student.getStudentId(),
			student.getFirstName() + " " + student.getLastName(),
			student.getDateOfBirth(),
			student.getGender(),
			student.getAddress());
		}
	}

	
	public void showAllTeachers() 
	{
		List<Teacher> allTeachers = teacherDAO.getAllTeachers();

		System.out.println("All Teachers:");
		System.out.printf("%-12s %-20s %-12s %-8s %-20s %-20s %-10s\n",
		"Teacher ID", "Name", "Date of Birth", "Gender", "Subject Taught", "Degree", "Category");
		System.out.println("--------------------------------------------------------------------------------------------");

		for (Teacher teacher : allTeachers) 
		{
			System.out.printf("%-12d %-20s %-12s %-8s %-20s %-20s %-10s\n",
			teacher.getTeacherId(),
			teacher.getFirstName() + " " + teacher.getLastName(),
			teacher.getDateOfBirth(),
			teacher.getGender(),
			teacher.getSubjectTaught(),
			teacher.getDegree(),
			teacher.getCategory());
		}
	}

	
	public void showStudentMarks()
	{
		showAllExams();
		System.out.print("Enter the Exam Id :");
		int examId = in.nextInt();
		String examName = selectExamName(examId);
		Map<String, ArrayList<String>> studentRec = studentDAO.getStudentMarks(examId);
		
		if(studentRec.size() != 0)
		{
			System.out.println("-------------"+examName +"---Marks---------------------------");
			for(Map.Entry<String, ArrayList<String>> entry : studentRec.entrySet())
			{
				System.out.println(entry.getKey());
				ArrayList<String> rec = entry.getValue();
				for(String s : rec)
				{
					System.out.println(s);
				}  
				System.out.println("-------------------------------------------------------");
			}	
		}
		else
		{
			System.out.println(examName+" Not Yet Started");
		}
	}
	
	public void showTeacherSubs()
	{
		Map<String, ArrayList<String>> teacherRec = teacherDAO.showTeacherSubjects();
		
		System.out.println("----------------------------------------------------------");
		for(Map.Entry<String, ArrayList<String>> entry : teacherRec.entrySet())
		{
			System.out.println(entry.getKey());
			ArrayList<String> subs = entry.getValue();
			for(String s : subs)
			{
				System.out.println(s);
			}
			System.out.println("----------------------------------------------------------");
		}
	}
	
	public void showStudentInfo()
	{
		List<String> allInfo = studentDAO.getAllStudentInfo();
		System.out.println("All Students detailed info:");
		
		System.out.println("------------------------------------------------------------------");
		for(String s : allInfo)
		{
			System.out.println(s);
			System.out.println("------------------------------------------------------------------");
		}
		
	}
	
	public void showStudentNamesWithId() 
	{
		List<Student> allStudents = studentDAO.getAllStudents();

		System.out.println("-----------------------------------------------------");
		System.out.printf(" %-12s | %-30s \n", "Student ID", "Name");
		System.out.println("-----------------------------------------------------");

		for (Student student : allStudents) 
		{
			System.out.printf("| %-12d | %-30s |\n", student.getStudentId(), student.getFirstName() + " " + student.getLastName());
			System.out.println("-----------------------------------------------------");
		}
	}

	private void showAllClasses() 
	{
		List<Class> classes = studentDAO.getAllClass();

		System.out.println("----------------------------");
		System.out.printf(" %-12s | %-30s \n", "Class ID", "Name");
		System.out.println("----------------------------");

		for (Class cc : classes) 
		{
			System.out.printf(" %-12d | %-30s \n", cc.getClassId(), cc.getClassName());
			System.out.println("----------------------------");
		}
	}

	private void showAllSections() 
	{
	    List<Section> sections = studentDAO.getAllSection();

	    System.out.println("------------------------------");
	    System.out.printf(" %-11s | %-30s \n", "Section ID", "Name");
	    System.out.println("------------------------------");

	    for (Section s : sections) 
	    {
		  System.out.printf(" %-11d | %-30s \n", s.getSectionId(), s.getSectionName());
		  System.out.println("------------------------------");
	    }
	}

	private void showAllSubjects() 
	{
	    List<Subject> subjects = teacherDAO.getAllSubjects();

	    System.out.println("----------------------------");
	    System.out.printf(" %-11s | %-30s \n", "Subject ID", "Name");
	    System.out.println("----------------------------");

	    for (Subject s : subjects) 
	    {
		  System.out.printf(" %-11d | %-30s \n", s.getSubId(), s.getSubjectName());
		  System.out.println("----------------------------");
	    }
	}
	
	private void showAllExams() 
	{
	    List<Exam> exams = teacherDAO.getAllExams();

	    System.out.println("----------------------------");
	    System.out.printf(" %-11s | %-30s \n", "Exam ID", "Exam Name");
	    System.out.println("----------------------------");

	    for (Exam s : exams) 
	    {
		  System.out.printf(" %-11d | %-30s \n", s.getExamId(), s.getExamName());
		  System.out.println("----------------------------");
	    }
	}
	
	private String selectExamName(int examId)
	{
		List<Exam> exam = teacherDAO.getAllExams();
		
		for(Exam e : exam)
		{
			if(e.getExamId() == examId)
				return e.getExamName();
		}
		return null;
	}
		
	private String selectSubject(int sub)
	{
		List<Subject> s = teacherDAO.getAllSubjects();
		for(Subject ss : s)
		{
			if(ss.getSubId() == sub)
				return ss.getSubjectName();
		}
		return null;
	}
	
	
	
}
