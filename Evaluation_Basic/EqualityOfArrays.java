import java.util.Scanner;

public class EqualityOfArrays
{
	public static void main(String []args)
	{
		int ArraySize, ArraySize1, count=0;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Enter the ArraySize for first array:");
		ArraySize = num.nextInt();
		
		System.out.println("------Enter the First Array Elements------");
		int Numbers[] = new int[ArraySize];
		for(int i=0; i<ArraySize; i++)
		{
			Numbers[i] = num.nextInt();
		}
		
		
		System.out.print("Enter the ArraySize for second array:");
		ArraySize1 = num.nextInt();
		
		System.out.println("------Enter the Second Array Elements------");
		int Numbers1[] = new int[ArraySize1];
		for(int i=0; i<ArraySize1; i++)
		{
			Numbers1[i] = num.nextInt();
		}
		
		if(ArraySize==ArraySize1)
		{
			for(int i=0; i<ArraySize-1; i++)
			{
				if(Numbers[i]!=Numbers1[i])
				{
					count++;
				}
				
			}
		}
		else
		{
			count =-1;
		}
		if(count==0)
		{
			System.out.println("The Two arrays are Equal");
		}
		else
		{
			System.out.println("The Two arrays are not Equal");
		}
		
		
		
	}
}
