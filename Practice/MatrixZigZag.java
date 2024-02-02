public class MatrixZigZag
{
	public static void main(String []args)
	{
		int [][] mat = {{1,2,7,4,5},{6,4,3,8,2},{3,4,1,6,5},{7,6,3,2,4},{2,4,5,7,9}};
		int row = 5;
		int col = 5;
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int count=0;
		int times = 0;
		while(count<2*row-1)
		{
			if(times%2!=0)
			{
				for(int i=0; i<row; i++)
				{
					for(int j=0; j<col; j++)
					{
						if(i+j==count)
						{
							System.out.print(mat[i][j]+" ");
						}
					}
					times++;
				}
				count++;
			}
			else
			{
				for(int i=row-1; i>=0; i--)
				{
					for(int j=col-1; j>=0; j--)
					{
						if(i+j==count)
						{
							System.out.print(mat[i][j]+" ");
						}
					}
					times++;
				}
				count++;
			}
		}
	}
}
