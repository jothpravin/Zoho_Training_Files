import java.util.Scanner;

public class Pattern3{
	public static void main(String args[]){
		int row;
		Scanner n = new Scanner(System.in);
		row = n.nextInt();
		int space = row-1;
		for(int i=0;i<row;i++)
		{
			for(int k=0;k<=space;k++)
			{
				System.out.print(" ");
			}
			space--;
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}		
	}
}
