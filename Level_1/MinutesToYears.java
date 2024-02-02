import java.util.Scanner;

public class MinutesToYears{
	public static void main(String args[]){
		long Minutes,MinutesInYears;
		System.out.print("Input the numnber of minutes :");
		Scanner m = new Scanner(System.in);
		Minutes = m.nextLong();
		
		//Minutes in year
		MinutesInYears = 24*60*365;
		
		//To caluclate Years
		int Years = (int)(Minutes/MinutesInYears);
		
		//To calculate Days
		long RemainingMinutes = Minutes-(MinutesInYears*Years);
		int Days = (int)(RemainingMinutes/1440);
		
		System.out.println(Minutes+" minutes is equal to "+Years+" years "+Days+" Days");
	}
}
