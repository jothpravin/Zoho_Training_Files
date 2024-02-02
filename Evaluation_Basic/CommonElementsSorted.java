import java.util.Scanner;

public class CommonElementsSorted
{
	public static void main(String []args)
	{
		int ArraySize, ArraySize1,ArraySize2;
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
		System.out.print("Enter the ArraySize for Third array:");
		ArraySize2 = num.nextInt();
		
		System.out.println("------Enter the Second Array Elements------");
		
		int Numbers2[] = new int[ArraySize2];
		for(int i=0; i<ArraySize2; i++)
		{
			Numbers2[i] = num.nextInt();
		}
		
		System.out.println("------The Common Elements are------");
		for(int i=0; i<ArraySize; i++)
		{
			for(int j=0; j<ArraySize; j++)
			{
				for(int k=0; k<ArraySize2; k++)
				{
					while(i<ArraySize && j<ArraySize1 && k< ArraySize2)
					{
						if(Numbers[i]==Numbers[j] && Numbers1[j]==Numbers2[k])
						{
							System.out.print(Numbers[i]+" ");
							i++;
							j++;
							k++;
						}
						else if(Numbers[i]<Numbers1[j])
						{
							i++;
						}
						else if(Numbers1[j]<Numbers2[k])
						{
							j++;
						}
						else
						{
							k++;
						}
					}
					
				}
			}
		}
		
		
		
	}
}
