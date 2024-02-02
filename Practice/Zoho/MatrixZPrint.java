import java.util.Scanner;

public class MatrixZPrint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        //int[][] matrix = new int[rows][cols];

        System.out.println("Enter the matrix elements:");

        /*for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }*/
        
        int [][]matrix = new int[][]{{1,2,3,4},
				  		 {5,6,7,8},
				  		 {9,10,11,12},
				  		 {13,14,15,16}};
				  	
		for (int i = 0; i < rows; i++) 
		{
		      for (int j = 0; j < cols; j++) 
		      {
		          System.out.print(matrix[i][j]+" ");
		      }
		      System.out.println();
		  }
	  while(true)
	  {
		  System.out.print("Enter the start position (row column): ");
		  int startRow = scanner.nextInt()-1;
		  int startCol = scanner.nextInt()-1;

		  traverseMatrixInZPattern(matrix, startRow, startCol);
	  }
    }

    private static void traverseMatrixInZPattern(int[][] matrix, int startRow, int startCol) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int bkr = startRow;
        int bkc = startCol;
        int count = 0;
        while(bkc<cols)
        {
            System.out.print(matrix[bkr][bkc++]+" ");
            count++;
        }
        bkc--;
        System.out.println();
        int i=0;
        while(bkc>=0 && bkr<rows && i<count)
        {
            System.out.print(matrix[bkr++][bkc--]+" ");
            i++;
        }
        bkr--;
        bkc++;
        System.out.println();
        while(bkc<cols)
        {
            System.out.print(matrix[bkr][bkc++]+" ");
        }
        System.out.println();

        System.out.println(); // Move to the next line
    }
}

