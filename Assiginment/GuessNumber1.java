import java.util.Scanner;

public class GuessNumber1
{
	public static void main(String []args)
	{
		int max=100, min=1;
		int range = max-min+1;
		int GuessNumber, random, count=0;
		
		random = (int)(Math.random()*range+min);            //To generate the random number
		
		Scanner num = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("Enter the Number between 1 to 100 to predict :");
			GuessNumber = num.nextInt();
			
			if(random==GuessNumber)
			{
				System.out.println("Hooray you guessed the number in the "+count+" attempt");
				break;
			}
			else if(random<GuessNumber)
			{
				System.out.println("The entered Number is Too High");
				count++;
			}
			else
			{
				System.out.println("The entered Number is Too Low");
				count++;
			}
		}
	}
}
