import java.util.Scanner;

public class PatternNew
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=0; i<2*n-1; i++)
		{
			for(int j=0; j<2*n-1; j++)
			{
				int top = i;
				int left = j;
				int right = 2*n-2 - j;
				int bottom = 2*n-2 - i;
				int min = Math.min(Math.min(top, left), Math.min(right, bottom));
				System.out.print(n-min+" ");
			}
			System.out.println();
		}
	}
}
