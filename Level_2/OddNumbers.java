import java.util.Scanner;

public class OddNumbers
{	
	
	public static void main(String args[])
	{
		int Number, count=0, i=1, sum=0;
		Scanner c = new Scanner(System.in);
		
		System.out.print("Input number of terms is:");
		Number = c.nextInt();
		
		System.out.println("The Odd Numbers are:");
		while(true)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				sum=sum+i;
				count++;
			}
			if(count==Number)
			{
				break;
			}
			i++;
		}
		System.out.println("The sum of Odd Numbers are upto "+Number+" terms is :"+sum);
		
		
	}
}
