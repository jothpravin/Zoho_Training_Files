import java.util.Scanner;

public class SmallestSubArray
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
		int min=Integer.MAX_VALUE;
		int start=0;
		int count=0;
		for(int i=0; i<numb.length-1; i++)
		{
			if(numb[i]<numb[i+1])
			{
				count++;
			}
			else
			{
				if(min>count)
				{
					min=count;
					start=i-min;
				}
				count=1;	
			}
			if(i==numb.length-2)
			{
				if(min>count)
				{
					min=count;
					start=i-min+1;
				}
			}
		}
		System.out.println(" "+min+" "+start);
		
		for(int i=start; i<=start+min; i++)
		{
			System.out.print(" "+numb[i]);
		}
	}
}
