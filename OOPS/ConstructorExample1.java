import java.util.Scanner;

class ConstructorEx
{
	String name;
	float englishMark, tamilMark, mathsMark, scienceMark, socialMark, total;
	
	ConstructorEx(String name, float english, float tamil, float maths, float science, float social)
	{
		this.name = name;
		this.englishMark = english;
		this.tamilMark = tamil;
		this.mathsMark = maths;
		this.scienceMark = science;
		this.socialMark = social;
		this.total = englishMark + tamilMark + mathsMark + scienceMark + socialMark;
		CompareTotal(this.total);
	}
	
	static String firstName = "", secondName = "", thirdName = "";
	static float firstTot =0, secondTot=0, thirdTot=0;
	void CompareTotal(float total)
	{
		if(total>firstTot)
			{
				firstTot = total;
				firstName = name;
			}
			else if(total>secondTot && total<firstTot)
			{
				secondTot = total;
				secondName = name;
			}
			else
			{
				thirdTot = total;
				thirdName = name;
			}
	}
	void Result()
	{	
		System.out.println("The First student among the three students :"+firstName+" Total is "+firstTot+ " Out of 500");
		System.out.println("The Second student among the three students :"+secondName+" Total is "+secondTot+ " Out of 500");
		System.out.println("The Last student among the three students :"+thirdName+" Total is "+thirdTot+ " Out of 500");
	}
	
	void PassOrFail(float english, float tamil, float maths, float science, float social, String name)
	{
		int count=0, i=0;
		String []arr = new String[5];
		if(english<=35)
		{
			count++;
			arr[i++] = "English";
		}	
		if(tamil<=35)
		{
			count++;
			arr[i++] = "Tamil";
		}
		if(maths<=35)
		{
			count++;
			arr[i++] = "Maths";
		}
		if(science<=35)
		{
			count++;
			arr[i++] = "Science";
		}
		if(social<=35)
		{
			count++;
			arr[i++] = "Social";
		}
		if(count==0)
		{
			System.out.println("The student "+name+" is passed in all subjects");
			System.out.println();
		}
		else
		{
			System.out.println("The student "+name+" is failed in "+count+" subject ");
			for(int j=0; j<arr.length; j++)
			{
				if(arr[j]!=null)
				System.out.print(arr[j]+" ");
			}
			System.out.println();
			System.out.println(name+" Passed in all remaining subjects");
			System.out.println();
		}
	}
	
	void compareMarks(float mark1, float mark2, float mark3, String subject)
	{
		if(mark1>mark2 && mark1>mark3)
		{
			System.out.println("The Highest mark in "+subject+" is "+mark1+" mark of Jothipravin");
		}
		else if(mark2>mark1 && mark2>mark3)
		{
			System.out.println("The Highest mark in "+subject+" is "+mark2+" mark of Jai");
		}
		else
		{
			System.out.println("The Highest mark in "+subject+" is "+mark2+" mark of Meena");
		}
	}
	
	
}

public class ConstructorExample
{
	public static void main(String []args)
	{
		int n;
		ConstructorEx[] students = new ConstructorEx[10];
		students[0] = new ConstructorEx("Jothipravin", 88, 99, 89, 85, 95);
		students[1] = new ConstructorEx("Jai", 78, 89, 86, 95, 85);
		students[2] = new ConstructorEx("Meena", 73, 93, 33, 82, 75);
		
		Scanner num = new Scanner(System.in);
		
		while(true)
		{
		
			System.out.println("----------------MENU-FOR-STATS------------------");
			System.out.println("1.The three students Results");
			System.out.println("2.The three students subjects totals highest");
			System.out.println("3.Subject wise highest mark among three students");
			System.out.println("4.Exit");
			System.out.println("------------------------------------------------");
			System.out.print("Enter the options to view the stats of student :");
			n = num.nextInt();
			switch(n)
			{
				case 1:
					System.out.println("--------------The three students Results-------------");
					System.out.println();
					students[0].PassOrFail(students[0].englishMark, students[0].tamilMark, students[0].mathsMark, students[0].scienceMark, students[0].socialMark, "Jothipravin");
					students[1].PassOrFail(students[1].englishMark, students[1].tamilMark, students[1].mathsMark, students[1].scienceMark, students[1].socialMark, "Jai");
					students[2].PassOrFail(students[2].englishMark, students[2].tamilMark, students[2].mathsMark, students[2].scienceMark, students[2].socialMark, "Meena");
					System.out.println("------------------------------------------------------");
					break;
				
				case 2:
					System.out.println("---------------The three students subjects totals highest-------------");
					System.out.println();
					students[2].Result();
					System.out.println("----------------------------------------------------------------------");
					break;
				
				case 3:
					boolean s=true;
					System.out.println("--------------Subject wise highest mark among three students-------------");
					while(s)
					{
						System.out.println("-----------------MENU-FOR-HIGHEST-MARK---------------------------");
						System.out.println(" 1.Tamil\n 2.English\n 3.Maths\n 4.Science\n 5.Social\n 6.Return to stats");
						System.out.println("-----------------------------------------------------------------");
						System.out.println();
						System.out.print("Enter the options to view the subject wise highest :");
						int x = num.nextInt();
						switch(x)
						{
							case 1:
								students[0].compareMarks(students[0].tamilMark, students[1].tamilMark, students[2].tamilMark, "Tamil");
								System.out.println();
								break;
								
							case 2:
								students[0].compareMarks(students[0].englishMark, students[1].englishMark, students[2].englishMark, "English");
								System.out.println();
								break;
								
							case 3:
								students[0].compareMarks(students[0].mathsMark, students[1].mathsMark, students[2].mathsMark, "Maths");
								System.out.println();
								break;
								
							case 4:
								students[0].compareMarks(students[0].scienceMark, students[1].scienceMark, students[2].scienceMark, "Science");
								System.out.println();
								break;
								
							case 5:
								students[0].compareMarks(students[0].socialMark, students[1].socialMark, students[2].socialMark, "Social");
								System.out.println();
								break;
							case 6:
								System.out.println("Returning to the Stats......");
								s=false;
								break;
						
							default:
								System.out.println("Enter the correct option to view highest mark in each subject amoung three students");
								System.out.println();
								break;
						}
					}
					break;
							
				case 4:
					System.out.println("Program Exited...");
					System.out.println();
					return;
			
				default:
					System.out.println("Enter the correct option to view stats of three students");
					System.out.println();
					break;
			}
		}
		
	}
}
