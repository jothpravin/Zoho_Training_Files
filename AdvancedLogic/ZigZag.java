import java.util.Scanner;

public class ZigZag
{	
	static void ZigzagPrint(String str, int k)
	{
		if(str == null || k==0)
		{
			return;
		}
		
		if(k==1)
		{
			System.out.println(str);
		}
		
		//first row
		for(int i=0; i<str.length(); i+=(k-1)*2)
		{
			System.out.print(str.charAt(i));
		}
		
		//middle row
		for(int j=1; j<k-1; j++)
		{
			boolean shift = true;
			for(int i=j; i<str.length();)
			{
				System.out.print(str.charAt(i));
				if(shift)
				{
					i+=(k-j-1)*2;
				}
				else
				{
					i+= ((k-1)*2) - ((k-j-1)*2);
				}
				shift = !shift;
			}
		}
		
		//last_row
		for(int i=k-1; i<str.length(); i+=(k-1)*2)
		{
			System.out.print(str.charAt(i));
		}
	}
	
	public static void main(String args[])
	{
		int Number;
		String Sensentance;
		Scanner str = new Scanner(System.in);
		
		System.out.print("Input number of zigzag Row:");
		Number = str.nextInt();
		
		System.out.print("Input the target :");
		Sensentance = str.next();
		
		ZigzagPrint(Sensentance, Number);
		
	}
}
