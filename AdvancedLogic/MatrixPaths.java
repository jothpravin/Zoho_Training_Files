import java.util.Scanner;

public class MatrixPaths
{	
	static int CountPath(int r, int c)
	{
		int m = r+c-2;
		int n = r-1;
		int o = c-1;
		int ans;
		
		ans = Fact(m)/(Fact(n)*Fact(o));
		return ans;
	}
	static int Fact(int num)
	{
		int fact=1;
		if(num==0)
		{
			return -1;
		}
		for(int i=1;i<=num; i++)
		{
			fact*=i;
		}
		return fact;
	}
	
	public static void main(String args[])
	{
		int Row, Column;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Row size:");
		Row = num.nextInt();
		
		System.out.print("Input number of Column size:");
		Column = num.nextInt();
		
		int Result = CountPath(Row, Column);
		
		System.out.println("The matirxs paths are :"+Result);
		
		
	}
}
