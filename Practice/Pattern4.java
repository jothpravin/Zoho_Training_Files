import java.util.Scanner;

public class Pattern4
{
	public static void main(String []args)
	{
		int N, k=1;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		N= num.nextInt();
		for(int i=0;i<2*N; i++)
		{
			int m = i<N ? N-i : i-N+1;
			for(int j=0; j<m; j++)
			{
				System.out.print(k+" ");
				k++;
			}
			k=1;
			System.out.println();
		}
	}
}
