import java.util.Scanner;

public class Overlapping
{	
	static void Overlap(int a[][], int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n-1; j++)
			{
				if((a[i][0]==0) && (a[i][1]==0))
				{
					continue;
				}
				
				else if((a[i][1]>a[j][0]) && (a[j][1]>a[i][1]))
				{
					a[i][1] = a[j][1];
					a[j][0] = 0;
					a[j][1] = 0;
					for(int k=i+1; k<n-1; k++)
					{
						a[k][0] = a[k+1][0];
						a[k][1] = a[k+1][1];
					}
					i--;
					n--;
				}
				else if((a[j][1]<a[i][1]) && (a[i][1]>a[j][0]))
				{
					a[j][0] = 0;
					a[j][1] = 0;
				}
				
				if(a[i][1]<a[j][0])
				{
					continue;
				}
			}
		}
		
		for(int i=0; i<n; i++)
		{
			if((a[i][0]==0) && (a[i][1]==0))
			{
				continue;
			}
			else
			{
				System.out.print("("+a[i][0]+","+a[i][1]+")");
			}
		}
	}
	
	public static void main(String args[])
	{
		int Row;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Row size:");
		Row = num.nextInt();
		
		int matrix[][] = new int[Row][2];
		
		for(int row=0;row<Row;row++) //Input of 1st matrix
		{
			for(int column=0;column<2;column++)
			{
				matrix[row][column] = num.nextInt();
			}
		}
		Overlap(matrix, Row);
	}
}
