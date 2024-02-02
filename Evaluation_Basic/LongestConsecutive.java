import java.util.Scanner;

public class LongestConsecutive
{
	public static void main(String []args)
	{
		int ArraySize, count=1;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the ArraySize:");
		ArraySize = num.nextInt();
		
		int Numbers[] = new int[ArraySize];
		for(int i=0; i<ArraySize; i++)
		{	
			Numbers[i] = num.nextInt();
			
		}
		
		for(int i=0; i<ArraySize; i++)
		{
			for(int j=i+1; j<ArraySize; j++)
			{
				if(Numbers[i]>Numbers[j])
				{
					int temp = Numbers[i];
					Numbers[i] = Numbers[j];
					Numbers[j] = temp;
				}
			}
		}
		int max=0;
		
		for(int i=0; i<ArraySize-1; i++)
		{
			if(Numbers[i+1]-Numbers[i]==1)
			{
				count++;
			}
			if(max<count)
			{
				max = count;
			}
			if(Numbers[i+1]-Numbers[i]>1)
			{
				count = 1;
			}
		}
		
		System.out.println("The Longest Consecutive is: "+max);
	}
}
