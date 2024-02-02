public class pattern1
{
	public static void main(String []args)
	{
		for(int i=0; i<4; i++)
		{
			for(int k=0; k<4-i; k++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<4; i++)
		{
			for(int k=1; k<i; k++)
			{
				System.out.print(" ");
			}
			for(int j=i; j<2*i-1; j++)
			{
				System.out.print("*");
			}
		}
	}
}
