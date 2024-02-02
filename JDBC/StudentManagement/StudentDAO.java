import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.sql.SQLException;
import java.sql.Types;

class StudentDAO
{
	private static final String student_insert_query = "INSERT INTO students (first_name, last_name, date_of_birth, address, gender) VALUES (?, ?, ?, ?, ?)";
	private static final String student_select_query = "SELECT * FROM students";
	private static final String class_select_query = "SELECT * FROM classes";
	private static final String sec_select_query = "SELECT * FROM sections";
	private static final String student_mark_query = "INSERT INTO marks (student_id, subject_id, marks, exam_id) VALUES (?, ?, ?, ?)";
	private static final String student_class_sec_query = "INSERT INTO student_class_section_mapping VALUES (?, ?, ?)";
	//private static final String student_class_query = "select s.first_name, s.last_name, s.date_of_birth, s.gender, s.address, s.student_id, c.class_name, sec.section_name from students as s join student_class_section_mapping as scs on s.student_id = scs.student_id join classes as c on scs.class_id = c.class_id join sections as sec on scs.section_id = sec.section_id";
	private static final String student_class_query = "SELECT " +
                  "s.student_id, " +
                  "s.first_name || ' ' || s.last_name AS student_name, " +
                  "s.date_of_birth, " +
                  "s.address, " +
                  "s.gender, " +
                  "c.class_name, " +
                  "sec.section_name, " +
                  "t.first_name || ' ' || t.last_name AS teacher_name " +
                  "FROM " +
                  "students s " +
                  "JOIN " +
                  "student_class_section_mapping scsm ON s.student_id = scsm.student_id " +
                  "JOIN " +
                  "classes c ON scsm.class_id = c.class_id " +
                  "JOIN " +
                  "sections sec ON scsm.section_id = sec.section_id " +
                  "JOIN " +
                  "teacher_class_section_mapping tcsm ON scsm.class_id = tcsm.class_id AND scsm.section_id = tcsm.section_id " +
                  "JOIN " +
                  "teachers t ON tcsm.teacher_id = t.teacher_id";
                  
      private static final String student_marks_query = "SELECT e.exam_name, s.first_name || ' ' || s.last_name as student_name, " +
						  "ss.subject_name, m.marks " +
						  "FROM marks AS m " +
						  "JOIN students AS s ON m.student_id = s.student_id " +
						  "JOIN subjects AS ss ON m.subject_id = ss.subject_id " +
						  "JOIN exams AS e ON m.exam_id = e.exam_id " ;
                  

	
	public void addStudent(Student s)
	{
		try(Connection con = ConnectionDB.getConnection();
		    PreparedStatement ps = con.prepareStatement(student_insert_query, Statement.RETURN_GENERATED_KEYS))
		{
			Date sqlDate = new Date(s.getDateOfBirth().getTime());
			ps.setString(1, s.getFirstName());
			ps.setString(2, s.getLastName());
			ps.setDate(3, sqlDate);
			ps.setString(4, s.getAddress());
			ps.setObject(5, s.getGender(), Types.OTHER);
			
			int row = ps.executeUpdate();
			if(row > 0)
			{
				ResultSet rs = ps.getGeneratedKeys();
				if(rs.next())
				{
					s.setStudentId(rs.getInt(1));
					System.out.println("Successfully inserted into student table");
				}
			}
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void addStudent(Student s, int cls, int sec)
	{
		try(Connection con = ConnectionDB.getConnection();
		    PreparedStatement ps = con.prepareStatement(student_insert_query, Statement.RETURN_GENERATED_KEYS))
		{
			Date sqlDate = new Date(s.getDateOfBirth().getTime());
			ps.setString(1, s.getFirstName());
			ps.setString(2, s.getLastName());
			ps.setDate(3, sqlDate);
			ps.setString(4, s.getAddress());
			ps.setObject(5, s.getGender(), Types.OTHER);
			
			int row = ps.executeUpdate();
			if(row > 0)
			{
				ResultSet rs = ps.getGeneratedKeys();
				if(rs.next())
				{
					s.setStudentId(rs.getInt(1));
					System.out.println("Successfully inserted into student table");
				}
			}
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		
		try(Connection con = ConnectionDB.getConnection();
		    PreparedStatement ps = con.prepareStatement(student_class_sec_query))
		{
			ps.setInt(1, s.getStudentId());
			ps.setInt(2, cls);
			ps.setInt(3, sec);
			
			int row = ps.executeUpdate();
			if(row > 0)
			{
				System.out.println("Successfully inserted into student class mapping table");
			}
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void addStudentMarks(Marks m, int examId)
	{
		try(Connection con = ConnectionDB.getConnection();
		    PreparedStatement ps = con.prepareStatement(student_mark_query, Statement.RETURN_GENERATED_KEYS))
		{
			ps.setInt(1, m.getStudentId());
			ps.setInt(2, m.getSubjectId());
			ps.setFloat(3, m.getSubjectMark());
			ps.setInt(4, examId);
			
			int row = ps.executeUpdate();
			if(row > 0)
			{
				ResultSet rs = ps.getGeneratedKeys();
				if(rs.next())
				{
					m.setMarkId(rs.getInt(1));
					System.out.println("Successfully inserted into marks ");
				}
			}
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public List<Student> getAllStudents() 
	{
		List<Student> students = new ArrayList<>();

		try(Connection connection = ConnectionDB.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(student_select_query)) 
		{

			while(resultSet.next()) 
			{
				Student student = new Student(
									resultSet.getString("first_name"),
									resultSet.getString("last_name"),
									resultSet.getDate("date_of_birth"),
									Gender.valueOf(resultSet.getString("gender")),
									resultSet.getString("address")
									);
				student.setStudentId(resultSet.getInt("student_id"));
				students.add(student);
			}

		} 
		catch(SQLException e) 
		{
			e.printStackTrace();
		}

		return students;
	}
	
	public List<String> getAllStudentInfo()
	{
		List<String> fullInfo = new ArrayList<>();
		
		try(Connection connection = ConnectionDB.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(student_class_query)) 
		{

			while(resultSet.next()) 
			{
					String studentInfo = "Student Name :" +resultSet.getString("student_name") +"\nDOB :" +
									resultSet.getDate("date_of_birth")+"\nGender :"+
									resultSet.getString("gender")+"\nAddress :"+
									resultSet.getString("address")+"\nStudent ID:"+
									resultSet.getInt("student_id")+"\nClass :"+
									resultSet.getString("class_name")+"\nSection :"+
									resultSet.getString("section_name")+"\nTeacher Name :"+
									resultSet.getString("teacher_name");
				fullInfo.add(studentInfo);
			}

		} 
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		
		return fullInfo;
	}
	
	public Map<String, ArrayList<String>> getStudentMarks(int ExamId)
	{
		Map<String, ArrayList<String>> studentRec = new HashMap<>();
		
		try(Connection connection = ConnectionDB.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(student_marks_query +" WHERE e.exam_id = "+ExamId+
                    " ORDER BY " +
                    "student_name")) 
		{

			while(resultSet.next()) 
			{
					String studentName = "Student Name :" +resultSet.getString("student_name");
					if(!studentRec.containsKey(studentName))
					{
						ArrayList<String> studentMarks = new ArrayList<>();
						studentRec.put(studentName, studentMarks);
					}
					ArrayList<String> existingStudentMarks = studentRec.get(studentName);
					
					String studentMark =  "Subject :" +
									resultSet.getString("subject_name")+"\nMark :"+
									resultSet.getFloat("marks");
					existingStudentMarks.add(studentMark);
			}

		} 
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		
		return studentRec;
	}
	
	/*public void studentClassSection(int cls, int sec, int stu_id)
	{
		try(Connection con = ConnectionDB.getConnection();
		    PreparedStatement ps = con.prepareStatement(student_class_sec_query))
		{
			ps.setInt(1, cls);
			ps.setInt(2, sec);
			ps.setInt(3, stu_id);
			
			int row = ps.executeUpdate();
			if(row > 0)
			{
				System.out.println("Successfully inserted..");
			}
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
	}*/
	
	public List<Class> getAllClass()
	{
		List<Class> classes = new ArrayList<>();

		try(Connection connection = ConnectionDB.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(class_select_query)) 
		{

			while(resultSet.next()) 
			{
				Class classs = new Class(
								resultSet.getString("class_name")
								);
				classs.setClassId(resultSet.getInt("class_id"));
				classes.add(classs);
			}

		} 
		catch(SQLException e) 
		{
			e.printStackTrace();
		}

		return classes;
	}
	
	public List<Section> getAllSection()
	{
		List<Section> sections = new ArrayList<>();

		try(Connection connection = ConnectionDB.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sec_select_query)) 
		{

			while(resultSet.next()) 
			{
				Section sec = new Section(
								resultSet.getString("section_name")
								);
				sec.setSectionId(resultSet.getInt("section_id"));
				sections.add(sec);
			}

		} 
		catch(SQLException e) 
		{
			e.printStackTrace();
		}

		return sections;
	}
	
}
