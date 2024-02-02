import java.util.Scanner;

public class LongestSubarray
{
	public static void main(String []args)
	{
		int n;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Size of the array :");
		n = num.nextInt();
		
		int numb[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			numb[i] = num.nextInt();
		}
		int max=0;
		int start=0;
		int count=1;
		for(int i=1; i<numb.length; i++)
		{
			if(numb[i-1]<numb[i])
			{
				count++;
			}
			else
			{
				if(max<count)
				{
					max=count;
					start=i-max;
				}
				count=1;	
			}
			if(i==numb.length-1)
			{
				if(max<count)
				{
					max=count;
					start=i-max+1;
				}
			}
		}
		
		for(int i=start; i<start+max; i++)
		{
			System.out.print(" "+numb[i]);
		}
	}
}
