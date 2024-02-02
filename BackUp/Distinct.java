import java.util.Scanner;

public class Distinct
{
	public static void printDistinct(int [] arr)
	{
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=0;
					count++;
				}
			}
			if(count==0 && arr[i]!=0)
			{
				System.out.print(arr[i]+" ");
			}
			count=0;
		}
	}
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
		printDistinct(numb);
	}
}
