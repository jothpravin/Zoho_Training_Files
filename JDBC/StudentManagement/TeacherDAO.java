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

class TeacherDAO
{
	private static final String teacher_insert = "INSERT INTO teachers (first_name, last_name, date_of_birth, gender, subject_taught, degree, category) VALUES(?,?,?,?,?,?,?)";
	private static final String teacher_class_sec_query = "INSERT INTO teacher_class_section_mapping VALUES (?, ?, ?)";
	private static final String teacher_subject_query = "INSERT INTO teacher_subject_mapping (teacher_id, subject_id)VALUES (?, ?)";
	private static final String teacher_select_query = "SELECT * FROM teachers";
	private static final String exam_select_query = "SELECT * FROM exams";
	private static final String subjects_select_query = "SELECT * FROM subjects ORDER BY subject_id";
	private static final String subject_insert_query = "INSERT INTO subjects (subject_name) VALUES (?)";
	private static final String class_insert_query = "INSERT INTO classes (class_name) VALUES (?)";
	private static final String section_insert_query = "INSERT INTO sections (class_name) VALUES (?)";
	private static final String teacher_subject_select_query = "SELECT " +
                    "t.first_name || ' ' || t.last_name as teacher_name, " +
                    "s.subject_name " +
                    "FROM teachers t " +
                    "JOIN teacher_subject_mapping tsm ON t.teacher_id = tsm.teacher_id " +
                    "JOIN subjects s ON tsm.subject_id = s.subject_id " +
                    "ORDER BY s.subject_name";
	
	
	public void addTeacher(Teacher t, int cls, int sec)
	{
		try(Connection con = ConnectionDB.getConnection();
		    PreparedStatement ps = con.prepareStatement(teacher_insert, Statement.RETURN_GENERATED_KEYS))
		{
			Date sqlDate = new Date(t.getDateOfBirth().getTime());
			ps.setString(1, t.getFirstName());
			ps.setString(2, t.getLastName());
			ps.setDate(3, sqlDate);
			ps.setObject(4, t.getGender(), Types.OTHER);
			ps.setString(5, t.getSubjectTaught());
			ps.setString(6, t.getDegree());
			ps.setString(7, t.getCategory());
			
			int row = ps.executeUpdate();
			if(row > 0)
			{
				ResultSet rs = ps.getGeneratedKeys();
				if(rs.next())
				{
					t.setTeacherId(rs.getInt(1));
					System.out.println("Successfully inserted into teacher table");
				}
			}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		try(Connection con = ConnectionDB.getConnection();
		    PreparedStatement ps = con.prepareStatement(teacher_class_sec_query))
		{
			ps.setInt(1, t.getTeacherId());
			ps.setInt(2, cls);
			ps.setInt(3, sec);
			
			int row = ps.executeUpdate();
			if(row > 0)
			{
				System.out.println("Successfully inserted into teacher class mapping table");
			}
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		
		int subId = getSubjectId(t.getSubjectTaught());
		addTeacherSubject(t.getTeacherId(), subId);
	}
	
	public void addTeacherSubject(int teachId, int subId)
	{
		try(Connection con = ConnectionDB.getConnection();
		    PreparedStatement ps = con.prepareStatement(teacher_subject_query))
		{
			ps.setInt(1, teachId);
			ps.setInt(2, subId);
			
			int row = ps.executeUpdate();
			if(row > 0)
			{
				System.out.println("Successfully inserted into teacher subject mapping table");
			}
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void addClass(Class s)
	{
		try(Connection con = ConnectionDB.getConnection();
		    PreparedStatement ps = con.prepareStatement(class_insert_query))
		{
			ps.setString(1, s.getClassName());
			
			int row = ps.executeUpdate();
			if(row > 0)
			{
				System.out.println("Successfully inserted into class table");
			}
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void addSection(Section s)
	{
		try(Connection con = ConnectionDB.getConnection();
		    PreparedStatement ps = con.prepareStatement(section_insert_query))
		{
			ps.setString(1, s.getSectionName());
			
			int row = ps.executeUpdate();
			if(row > 0)
			{
				System.out.println("Successfully inserted into section table");
			}
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	public void addSubject(Subject s)
	{
		try(Connection con = ConnectionDB.getConnection();
		    PreparedStatement ps = con.prepareStatement(subject_insert_query))
		{
			ps.setString(1, s.getSubjectName());
			
			int row = ps.executeUpdate();
			if(row > 0)
			{
				System.out.println("Successfully inserted into subject table");
			}
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public List<Teacher> getAllTeachers() 
	{
		List<Teacher> teachers = new ArrayList<>();
		try(Connection connection = ConnectionDB.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(teacher_select_query)) 
		{
			while(resultSet.next()) 
			{
				Teacher teacher = new Teacher(
									resultSet.getString("first_name"),
									resultSet.getString("last_name"),
									resultSet.getDate("date_of_birth"),
									Gender.valueOf(resultSet.getString("gender")),
									resultSet.getString("subject_taught"),
									resultSet.getString("degree"),
									resultSet.getString("category")
									);
				teacher.setTeacherId(resultSet.getInt("teacher_id"));
				teachers.add(teacher);
			}

		} 
		catch(SQLException e) 
		{
			e.printStackTrace();
		}

		return teachers;
	}
	
	public List<Exam> getAllExams()
	{
		List<Exam> exams = new ArrayList<>();
		
		try(Connection connection = ConnectionDB.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(exam_select_query)) 
		{

			while(resultSet.next()) 
			{
				Exam exam = new Exam(resultSet.getString("exam_name"));
				exam.setExamId(resultSet.getInt("exam_id"));
				exams.add(exam);
			}

		} 
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		return exams;
		
	}
	
	public List<Subject> getAllSubjects()
	{
		List<Subject> subjects = new ArrayList<>();
		
		try(Connection connection = ConnectionDB.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(subjects_select_query)) 
		{

			while(resultSet.next()) 
			{
				Subject subject = new Subject(resultSet.getString("subject_name"));
				subject.setSubId(resultSet.getInt("subject_id"));
				subjects.add(subject);
			}

		} 
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		return subjects;
		
	}
	
	public Map<String, ArrayList<String>> showTeacherSubjects()
	{
		ArrayList<String> subjects = new ArrayList<>();
		Map<String, ArrayList<String>> teachersRec = new HashMap<>();
		
		try(Connection connection = ConnectionDB.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(teacher_subject_select_query)) 
		{

			while(resultSet.next()) 
			{
				String teacher = "Teacher Name :" +resultSet.getString("teacher_name");
				
				if(!teachersRec.containsKey(teacher))
				{
					subjects = new ArrayList<>();
				}
				String sub = "Subject :" +resultSet.getString("subject_name");
				subjects.add(sub);
				teachersRec.put(teacher, subjects);
			}

		} 
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		return teachersRec;
	}
	
	private int getSubjectId(String subName)
	{
		List<Subject> subjects = getAllSubjects();
		
		for(Subject s : subjects)
		{
			if(s.getSubjectName().equals(subName))
			{
				return s.getSubId();
			}
		}
		return -1;
	}
}
