import java.util.Scanner;

public class Pattern2
{
	public static void main(String []args)
	{
		int input, m=1,s=0,t=0;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the row :");
		input = num.nextInt();
		
		for(int i=1; i<=input; i++)
		{
			for(int j=1; j<=input-i; j++)
			{
				System.out.print(" ");
			}
			if(i==1)
			{
				System.out.print(1);
				System.out.println();
			}
			else
			{
				s=m+i;
				for(int k=s; k>m; k--)
				{
					System.out.print(k+" ");
				}
				m=s;
				System.out.println();
			}
		}
		for(int i=0; i<input; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k=m; k>m-input+i; k--)
			{
				System.out.print(k+" ");
			}
			t=m;
			m=t-input;
			System.out.println();
		}
		
	}
}
