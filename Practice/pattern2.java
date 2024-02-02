public class pattern2
{
	public static void main(String []args)
	{
		for(int i=1; i<=3; i++)
		{
			for(int k=0; k<6-i+1; k++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<7; i++)
		{
		 	System.out.print("*");
		}
		System.out.println();
		for(int i=0; i<3; i++)
		{
			for(int j=i; j<3; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
