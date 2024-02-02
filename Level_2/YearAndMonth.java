import java.util.Scanner;

public class YearAndMonth
{
	public static void main(String args[])
	{
		int Year, Month, NoOfDays=0;
		String MonthName = "";
		Scanner n = new Scanner(System.in);
		System.out.print("Input a Month Number : ");
		Month = n.nextInt();
		System.out.print("Input a Year : ");
		Year = n.nextInt();
		
		switch(Month)
		{
			case 1:
				MonthName = "January";	
				NoOfDays = 31;
				break;
			case 2:
				MonthName = "February";
				if(Year % 400 == 0 || Year % 4==0 && Year % 100 !=0)
				{	
					NoOfDays = 29;
				}
				else
				{
					NoOfDays = 28;	
				}
				break;
			case 3:
				MonthName = "March";	
				NoOfDays = 31;
				break;
			case 4:
				MonthName = "Apirl";	
				NoOfDays = 30;
				break;
			case 5:
				MonthName = "May";	
				NoOfDays = 31;
				break;
			case 6:
				MonthName = "June";	
				NoOfDays = 30;
				break;
			case 7:
				MonthName = "July";	
				NoOfDays = 31;
				break;
			case 8:
				MonthName = "August";	
				NoOfDays = 31;
				break;
			case 9:
				MonthName = "Septemper";	
				NoOfDays = 30;
				break;
			case 10:
				MonthName = "October";	
				NoOfDays = 31;
				break;
			case 11:
				MonthName = "November";	
				NoOfDays = 30;
				break;
			case 12:
				MonthName = "December";	
				NoOfDays = 31;
				break;
			default:
				System.out.println("Please enter a value from 1 to 12");
		}
		System.out.println(MonthName+" "+Year+" has "+NoOfDays+" days");
		
	}
}
