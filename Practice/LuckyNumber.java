import java.util.Scanner;

public class LuckyNumber
{
	public static void main(String []args)
	{
		int Num, count=0, index=0;
		Scanner num = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("Enter the Number to get nth Lucky number :");
			Num = num.nextInt();
			
			while(count<Num)
			{
				index++;
				if(index==3|| index==4)
				{
					count++;
				}
				else if( index%10==3 ||index%10==4 )
				{
					count++;
				}
				else if(index/10==3 || index/10==4)
				{
					count++;
				}
			}
			System.out.println("The nth Lucky number is :"+(index));
		}
	}
}
