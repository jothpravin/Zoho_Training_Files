import java.util.Scanner;

public class Problem1
{
	public static void main(String []args)
	{
		int input, consec, count=0;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		input = num.nextInt();
		int Number[] = new int[20];
		System.out.println("Enter the array elements: ");
		for(int i=0; i<input; i++)
		{
			Number[i] = num.nextInt();
		}
		System.out.print("Enter the consecutive number: ");
		consec = num.nextInt();
		
		for(int i=0; i<input; i++)
		{
			if(Number[i]==1)
			{
				count++;
			}
			else
			{
				count = 0;
			}
			if(count==consec)
			{
				input++;
				for(int j=input-1; j>i; j--)
				{
					Number[j] = Number[j-1];
				}
				Number[i+1]=0;
			}
		}
		for(int i=0; i<input; i++)
		{
			System.out.print(Number[i]+" ");
		}
	}
}
