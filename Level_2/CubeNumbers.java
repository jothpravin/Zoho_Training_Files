import java.util.Scanner;

public class CubeNumbers
{	
	
	public static void main(String args[])
	{
		int Number,sum=0;
		Scanner c = new Scanner(System.in);
		
		System.out.print("Input number of terms:");
		Number = c.nextInt();
		
		for(int i=1;i<=Number;i++)
		{	
			System.out.println("Number is : "+i+" and cube of "+i+" is : "+Math.pow(i,3));
		}
		
	}
}
