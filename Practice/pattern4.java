import java.util.Scanner;

public class pattern4
{
	public static void main(String []args)
	{
		int n,m=1;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the row :");
		n = num.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			m=i;
			for(int j=1, k=0; j<=2*i-1;)
			{
				if(k<n-i)
				{
					System.out.print("  ");
					k++;
				}
				else
				{
					if(i>j)
					{
						System.out.print((m++)+" ");
					}
					else
					{
						System.out.print((m--)+" ");
					}
					j++;
				}
			}
			System.out.println();
		}
		
	}
}
