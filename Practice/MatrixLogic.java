import java.util.Scanner;

public class MatrixLogic
{
	public static void main(String []args)
	{
		int [][] mat = new int[][]{{1, 2, 3, 4, 6}, {5, 3, 8, 1, 2}, {4, 6, 7, 5, 5}, {2, 4, 8, 9, 4} };
		int i,j,m,n, sum=0;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the start index i, j:");
		i = num.nextInt();
		j = num.nextInt();
		System.out.print("Enter the end index m, n:");
		m = num.nextInt();
		n = num.nextInt();
		
		
		for(int k=i; k<=m; k++)
		{
			for(int l=j; l<=n; l++)
			{
				sum += mat[k][l];
			}
		}
		System.out.print("The sum of given index matrix is : "+sum);
	}
}
