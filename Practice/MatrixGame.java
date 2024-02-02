import java.util.Scanner;

public class MatrixGame
{
	public static void main(String []args)
	{
		int mat[][] = {{1,2,3,4,6},{4,5,6,5,4},{7,8,9,2,3},{4,5,3,1,8},{6,5,4,7,2}};
		int size = 3;
		int i1,j;
		String input, result="";
		boolean check = true;
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the start index :");
		i1 = str.nextInt();
		j = str.nextInt();
		
		for(int i=0; i<5; i++)
		{
			for(int k=0; k<5; k++)
			{
				if(i==i1 && j==k)
				{
					System.err.print(" 👉️ "+mat[i][k]+" 👈️ ");
				}
				else
				System.out.print(mat[i][k]+ " ");
			}
			System.out.println();
		}
		
		if(i1<5 && i1>=0 && j<5 && j>=0)
		{
			result += mat[i1][j]+" ";
		}
		else
		{
			System.out.println("Enter the correct start index from 0,0 to 4,4");
			System.exit(0);
		}
		
		System.out.println("/************Menu***********/                                                   > - Right   < - Left  V - Down ^ - Up");
		
		System.out.print("Enter the navigation :");
		input = str.next();
		
		for(int i=0; i<input.length(); i++)
		{
			if(input.charAt(i)=='>')
			{
				j=j+1;
				if(i1<5 && j<5)
				{
					result += mat[i1][j]+" ";
					continue;
				}
				else
				{
					check = false;
					break;
				}
			}
			else if(input.charAt(i)=='<')
			{
				j=j-1;
				if(i1>=0 && j>=0)
				{
					result += mat[i1][j]+" ";
					continue;
				}
				else
				{
					check = false;
					break;
				}
			}
			else if(input.charAt(i)=='v')
			{
				i1=i1+1;
				if(j<5 && i1<5)
				{
					
					result += mat[i1][j]+" ";
					continue;
				}
				else
				{
					check = false;
					break;
				}
			}
			else if(input.charAt(i)=='^')
			{
				i1=i1-1;
				if(j>=0 && i1>=0)
				{
					result += mat[i1][j]+" ";
					continue;
				}
				else
				{
					check = false;
					break;
				}
			}
		}
		if(check)
		{
			System.out.println("Output :"+result);
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}
