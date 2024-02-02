import java.util.Scanner;

public class BubbleSort
{
	public static void main(String []args)
	{
		int ArraySize;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the ArraySize:");
		ArraySize = num.nextInt();
		
		String Words[] = new String[ArraySize];
		for(int i=0; i<ArraySize; i++)
		{
			Words[i] = num.next();
		}
		int k=0;
		
		for(int i=0; i<ArraySize; i++)
		{
			for(int j=i+1; j<ArraySize; j++)
			{
				if(Words[i].charAt(k)==Words[j].charAt(k))
				{
					k++;
				}
				if(Words[i].charAt(k)>Words[j].charAt(k))
				{
					String temp = Words[i];
					Words[i] = Words[j];	
					Words[j] = temp;
				}
			}
		}
		for(int i=0; i<ArraySize; i++)
		{
			System.out.print(Words[i]+" ");
		}
		
		
	}
}
