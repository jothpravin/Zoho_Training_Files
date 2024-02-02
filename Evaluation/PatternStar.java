import java.util.Scanner;

public class PatternStar
{
	public static void main(String []args)
	{
		int N, k=1;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		N= num.nextInt();
		for(int i=0;i<N; i++)
		{
			for(int j=0; j<N-i; j++)
			{
				System.out.print(k+" ");
				k++;
			}
			k=1;
			System.out.println();
		}
		for(int i=0;i<N; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(k+" ");
				k++;
			}
			k=1;
			System.out.println();
		}
	}
}
