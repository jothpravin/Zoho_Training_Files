import java.util.Scanner;

public class CommonElements
{
	public static void main(String []args)
	{
		int ArraySize	;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the ArraySize:");
		ArraySize = num.nextInt();
		
		System.out.println("------Enter the First Array Elements------");
		int Numbers[] = new int[ArraySize];
		for(int i=0; i<ArraySize; i++)
		{
			Numbers[i] = num.nextInt();
		}
		
		System.out.println("------Enter the Second Array Elements------");
		int Numbers1[] = new int[ArraySize];
		for(int i=0; i<ArraySize; i++)
		{
			Numbers1[i] = num.nextInt();
		}
		
		System.out.println("------The Common Elements are------");
		for(int i=0; i<ArraySize; i++)
		{
			for(int j=0; j<ArraySize; j++)
			{
				if(Numbers[i]==Numbers1[j])
				{
					System.out.print(Numbers[i]+" ");
				}
			}
		}
		
		
		
	}
}
