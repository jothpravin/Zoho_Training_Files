import java.util.Scanner;

public class NumbersTable
{
	public static void main(String []args)
	{
		int Number;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Number to print Numbers Table:");
		Number = num.nextInt();	
		
		System.out.println("----------The "+Number+"s Table---------");
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+" X "+Number+" = "+i*Number);
		}
	}
}
