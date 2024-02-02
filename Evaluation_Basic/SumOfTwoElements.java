import java.util.Scanner;

public class SumOfTwoElements
{
	public static void main(String []args)
	{
		int ArraySize, Target, flag=0;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the ArraySize:");
		ArraySize = num.nextInt();
		
		int Numbers[] = new int[ArraySize];
		for(int i=0; i<ArraySize; i++)
		{
			Numbers[i] = num.nextInt();
			
		}
		System.out.print("Enter the Target:");
		Target = num.nextInt();
		
		for(int i=0; i<ArraySize; i++)
		{
			for(int j=i+1; j<ArraySize; j++)
			{
				if(Numbers[i]+Numbers[i+1]==Target)
				{
					System.out.println("The Sum of "+Numbers[i]+" and "+Numbers[i+1]+" are equal to "+Target);
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("There is no such combination of sum is equal to target");
		}
	}
}
