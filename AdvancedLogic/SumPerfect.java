import java.util.Scanner;

public class SumPerfect
{	
	static int Perfect(int n)
	{
		int count = 0;
		int num = 19;
		
		while(count < n)
		{
			if(Sum(num)==10)
			{
				count++;
			}
			num++;
		}
		return num-1;
	}
	
	static int Sum(int num)
	{
		int sum=0;
		while(num>0)
		{
			sum+=num%10;
			num=num/10;
		}
		return sum;
	}
	public static void main(String args[])
	{
		int Number;
		boolean check =true;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input a Number: ");
		Number = num.nextInt();
		
		System.out.println(Perfect(Number));
	}
}
