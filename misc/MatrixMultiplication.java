import java.util.Scanner;

public class MatrixMultiplication
{
	public static void multiplication(int [][]mat, int[][]mat1,int size)
	{
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				int temp = 0;
				for(int k=0; k<size; k++)
				{
					temp += mat[i][k]*mat1[k][j];
				}
				System.out.print(temp+" ");
			}
			System.out.println();
		}
	}
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		int size;
		System.out.print("Enter the size :");
		size = in.nextInt();
		int[][] mat = new int[size][size];
		int[][] mat1 = new int[size][size];
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				mat[i][j] = in.nextInt();
			}
		}
		System.out.println("Second Matrix");
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				mat1[i][j] = in.nextInt();
			}
		}
		multiplication(mat, mat1, size);
	}
}
