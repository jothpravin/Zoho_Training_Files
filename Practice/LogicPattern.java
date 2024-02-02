import java.util.Scanner;

public class LogicPattern
{
	public static void main(String []args)
	{
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the row: ");
		int n = num.nextInt();
		int c=1;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<; j++)
			{
				System.out.print((c++)+" ");
			}
			if(i%2==0)
			{
				c += i*2-1;
			}
			else
			{
				c -= 2;
			}
			System.out.println();
		}
	}
}


