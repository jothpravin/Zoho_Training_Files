import java.util.Scanner;

public class PatternHollowDiamond
{
	public static void main(String []args)
	{
		int num;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		for(int i=0; i<num*2; i++)
		{
			for(int j=0; j<num*2-i*2; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
