import java.util.Arrays;
public class MatrixRotate
{
	public static void main(String[] args) 
	{
        int mat[][] = new int[][]{{1, 2, 3, 4},
					    {5, 6, 7, 8},
				          {9, 10, 11 , 12},
					    {13, 14, 15, 16}};
        int res[][] = new int[mat.length][mat[0].length];
        int row=0;
        int col=0;
        for(int j=0; j<mat[0].length; j++)      
	    {
	         for(int i=mat.length-1; i>=0; i--)
	         {
	             res[row][col++] = mat[i][j];
	         }
	         row++;
	         col=0;
	    }
	    
	    for(int []rows: res)
	    {
	       System.out.println(Arrays.toString(rows));
	    }
	    
	}
}

