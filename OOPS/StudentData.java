import java.util.Scanner;

class Student {
    private int studentId;
    private String name;
    private String[] subjects;
    private int[] marks;

    public Student(int studentId, String name, String[] subjects, int[] marks) {
        this.studentId = studentId;
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
    }

    public int getTotalMarks() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    public boolean isPassed() {
        for (int mark : marks) {
            if (mark < 40) {
                return false;
            }
        }
        return true;
    }

    public boolean isFailed() {
        return !isPassed();
    }

    public String getName() {
        return name;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int[] getMarks() {
        return marks;
    }
}

class StudentManager {
    private Student[] students;
    private int studentCount;

    public StudentManager(int maxSize) {
        students = new Student[maxSize];
        studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Cannot add more students. The student list is full.");
        }
    }

    public void printAllSubjects() {
        System.out.print("All Subjects: ");
        for (Student student : students) {
            if (student != null) {
                String[] subjects = student.getSubjects();
                for (String subject : subjects) {
                    System.out.print(subject + " ");
                }
            }
        }
        System.out.println();
    }

    public void printAllStudentNames() {
        System.out.print("All Student Names: ");
        for (Student student : students) {
            if (student != null) {
                System.out.print(student.getName() + " ");
            }
        }
        System.out.println();
    }

    public void top5Students() {
        Student[] sortedStudents = new Student[studentCount];
        System.arraycopy(students, 0, sortedStudents, 0, studentCount);

        for (int i = 0; i < studentCount - 1; i++) {
            for (int j = i + 1; j < studentCount; j++) {
                if (sortedStudents[i].getTotalMarks() < sortedStudents[j].getTotalMarks()) {
                    Student temp = sortedStudents[i];
                    sortedStudents[i] = sortedStudents[j];
                    sortedStudents[j] = temp;
                }
            }
        }

        System.out.println("Top 5 Students:");
        for (int i = 0; i < Math.min(5, studentCount); i++) {
            System.out.println((i + 1) + ". " + sortedStudents[i].getName() + " - Total Marks: " + sortedStudents[i].getTotalMarks());
        }
    }

    public void passedStudents() {
        System.out.println("Passed Students:");
        for (Student student : students) {
            if (student != null && student.isPassed()) {
                System.out.println(student.getName());
            }
        }
    }

    public void failedStudents() {
        System.out.println("Failed Students:");
        for (Student student : students) {
            if (student != null && student.isFailed()) {
                System.out.println(student.getName());
            }
        }
    }

    public void subjectsWithHighestMark(String subjectName) {
        int highestMark = 0;
        String subjectStudents = "";

        for (Student student : students) {
            if (student != null && student.getSubjects() != null) {
                for (int i = 0; i < student.getSubjects().length; i++) {
                    if (student.getSubjects()[i].equals(subjectName) && student.getMarks()[i] > highestMark) {
                        highestMark = student.getMarks()[i];
                        subjectStudents = student.getName();
                    } else if (student.getSubjects()[i].equals(subjectName) && student.getMarks()[i] == highestMark) {
                        subjectStudents += ", " + student.getName();
                    }
                }
            }
        }

        System.out.println("Students with the highest mark in " + subjectName + ": " + subjectStudents);
    }
}

public class StudentData
{
	public static void main(String []args)
	{
		String name;
		int []marks = new int[10];
		int noOfStudents;
		String subjects[] = new String[]{"Tamil", "English", "Maths", "Science", "Social"};
		StudentManager studentManager = new StudentManager(10);
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the noOfStudents :");
		noOfStudents = obj.nextInt();
		
		for(int i=1; i<=noOfStudents; i++)
		{
			System.out.print("Enter the student name: ");
			name = obj.next();
			System.out.println("<-------Enter the student marks respectively------>");
			for(int j=0; j<5; j++)
			{
				System.out.print("Enter "+subjects[j]+" Mark: ");
				marks[j] = obj.nextInt();
			}
			studentManager.addStudent(new Student(i, name, subjects, marks));
			System.out.println();
		}
		studentManager.printAllStudentNames();
		studentManager.printAllSubjects();
		studentManager.passedStudents();
		studentManager.failedStudents();
		studentManager.top5Students();
		for(int i=0; i<subjects.length; i++)
		studentManager.subjectsWithHighestMark(subjects[i]);
	}
}
