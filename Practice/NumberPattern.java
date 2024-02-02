import java.util.Scanner;

public class NumberPattern
{
	public static void main(String [] args)
	{
		int n,m=1;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the row :");
		n = num.nextInt();
		
		for(int i=0; i<n; i++)
		{	
			/*for(int k=i; k<n; k++)
				System.out.print(" ");*/
			for(int j=0, k=0; j<=i; )
			{
				if(k<n-i)
				{
					System.out.print(" ");
					k++;
				}
				else
				{
					if(i==0 || j==0)
					{
						m=1;
					}
					else
					{
						m=m*(i-j+1)/j;
					}		
					System.out.print(m+" ");
					j++;
				}
			}
			System.out.println();
		}
	}
}
