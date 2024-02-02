import java.util.Scanner;

public class StudentData
{
	public static void main(String []args)
	{
		String name;
		int noOfStudents;
		String subjects[] = new String[]{"Tamil", "English", "Maths", "Science", "Social"};
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the noOfStudents :");
		noOfStudents = obj.nextInt();
		StudentManager studentManager = new StudentManager(noOfStudents);
		
		if(noOfStudents==0)
		{
			System.out.println("Enter minimum one student, zero is not allowed");
			System.exit(0);
		}
		for(int i=1; i<=noOfStudents; i++)
		{
			int []marks = new int[5];
			System.out.print("Enter the student name: ");
			name = obj.next();
			System.out.println("<-------Enter the student marks respectively------>");
			for(int j=0; j<5; j++)
			{
				System.out.print("Enter "+subjects[j]+" Mark: ");
				marks[j] = obj.nextInt();
				if(marks[j]>100)
				{
					while(true)
					{
						System.out.println("Mark cannont exceed 100, please enter correct mark");
						System.out.print("Enter "+subjects[j]+" Mark: ");
						marks[j] = obj.nextInt();
						if(marks[j]<=100)
						{
							break;
						}
					}
				}
			}
			studentManager.addStudent(new Student(i, name, subjects, marks));
			System.out.println();
		}
		obj.close();
		studentManager.printAllStudents();
		studentManager.printAllSubjects();
		studentManager.passedStudents();
		studentManager.failedStudents();
		studentManager.TopFiveStudent();
		System.out.println(">----Highest-mark-subject-wise----<");
		for(int i=0; i<subjects.length; i++)
		studentManager.subjectsWithHighestMark(subjects[i]);
	}
}
