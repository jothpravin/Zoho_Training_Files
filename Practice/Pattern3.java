import java.util.Scanner;

public class Pattern3
{
	public static void main(String []args)
	{
		int n,m=1;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the row :");
		n = num.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int k=i; k<n; k++)
				System.out.print(" ");
			
			for(int j=1; j<=i; j++)
			{
				System.out.print(m--+" ");
			}
			m++;
			m+=2*i;
			System.out.println();
		}
	}
}
