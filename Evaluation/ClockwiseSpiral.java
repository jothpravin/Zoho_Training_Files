import java.util.Scanner;

public class ClockwiseSpiral
{
	public static void main(String []args)
	{
		int N, M; //Size of row and Column
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the row: ");
		N = num.nextInt();
		System.out.print("Enter the column: ");
		M = num.nextInt();
		int matrix[][] = new int[N][M];

		for(int i=0; i<N; i++)
		{
			for(int j=0; j<M; j++)
			{
				matrix[i][j] = num.nextInt();
			}
		}

		int top, bottom, left, right;
		top = 0;
		bottom = N-1;
		left = 0;
		right = M-1;
		
		while(top<=bottom && left<=right)
		{
			for(int i=left; i<=right; i++)
			{
				System.out.print(matrix[top][i]+" ");
			}
			top++;

			for(int i=top;i<=bottom; i++)
			{
				System.out.print(matrix[i][right]+" ");
			}
			right--;
			
			if(top<=bottom)
			{
				for(int i=right; i>=left; i--)
				{
					System.out.print(matrix[bottom][i]+" ");
				}
				bottom--;
			}

			if(left<=right)
			{
				for(int i=bottom; i>=top; i--)
				{
					System.out.print(matrix[i][left]+" ");
				}
				left++;
			}
		}	

	}
}
