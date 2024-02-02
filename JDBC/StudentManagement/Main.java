import java.util.Scanner;
public class Main
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String []args)
	{
		StudentManagement sm = new StudentManagement();
		while(true)
		{
			System.out.println("------------------------------------------------------");
			System.out.println("| Option |            Description                    |");
			System.out.println("------------------------------------------------------");
			System.out.println("|   1    | Add Student Record                        |");
			System.out.println("|   2    | Show Student Record                       |");
			System.out.println("|   3    | Exit                                      |");
			System.out.println("------------------------------------------------------");

			System.out.print("Enter the Option to perform :");	
			int n = in.nextInt();
			switch(n)
			{
				case 1:
					int temp = 1;
					while(temp==1)
					{
						System.out.println("------------------------------------------------------");
						System.out.println("| Option |            Description                    |");
						System.out.println("------------------------------------------------------");
						System.out.println("|   1    | Add Student                               |");
						System.out.println("|   2    | Add Student Marks                         |");
						System.out.println("|   3    | Add Teacher                               |");
						System.out.println("|   4    | Add New Subject                           |");
						System.out.println("|   5    | Add New Class                             |");
						System.out.println("|   6    | Add New Section                           |");
						System.out.println("|   7    | Add New Teacher Subject                   |");
						System.out.println("|   8    | Main Menu        	                     |");
						System.out.println("------------------------------------------------------");
						
						System.out.print("Enter the Option to perform :");	
						int l = in.nextInt();
						
						switch(l)
						{
							case 1:
								sm.addNewStudent();
								break;
								
							case 2:
								sm.addStudentMarks();
								break;
								
							case 3:
								sm.addNewTeacher();
								break;
								
							case 4:
								sm.addSubject();
								break;
								
							case 5:
								sm.addNewClass();
								break;
								
							case 6:
								sm.addNewSection();
								break;
							
							case 7:
								sm.addTeacherNewSubject();
								break;
								
							case 8:
								temp = 0;
								break;
							
							default:
								System.out.println("Enter the correct option to perform!!");
								
								
						}
					}
						break;
				
					
				case 2:
					int tem=1;
					while(tem==1)
					{
						System.out.println("------------------------------------------------------");
						System.out.println("| Option |            Description                    |");
						System.out.println("------------------------------------------------------");
						System.out.println("|   1    | Show Student                              |");
						System.out.println("|   2    | Show Teacher                              |");
						System.out.println("|   3    | Show Student Full Info                    |");
						System.out.println("|   4    | Show Student Marks                        |");
						System.out.println("|   5    | Show Teacher Taught Subjects              |");
						System.out.println("|   6    | Main Menu                                 |");
						System.out.println("------------------------------------------------------");
						System.out.print("Enter the Option to perform :");	
						int m = in.nextInt();
						switch(m)
						{
							case 1:
								sm.showAllStudents();
								break;
							
							case 2:
								sm.showAllTeachers();
								break;
								
							case 3:
								sm.showStudentInfo();
								break;
								
							case 4:
								sm.showStudentMarks();
								break;
								
							case 5:
								sm.showTeacherSubs();
								break;
							
							case 6:
								tem=0;
								break;
							
							default:
								System.out.println("Enter the correct option to perform");
								
						}
					
					}
					break;
					
				case 3:
					System.out.println("Apllication exiting...");
					System.exit(0);
					
				default:
					System.out.println("Enter the correct option to perform!!");
					
			}
		}
	}
}
