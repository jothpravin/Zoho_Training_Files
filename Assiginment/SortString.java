import java.util.Scanner;

public class SortString
{
	public static void main(String []args)
	{
		int arraySize;
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the array Size :");
		arraySize = str.nextInt();
		String words[] = new String[arraySize];
		
		for(int i=0; i<arraySize; i++)
		{
			words[i] = str.next();
		}
		String temp;
		for(int i=0; i<arraySize; i++)
		{
			for(int j=i+1; j<arraySize; j++)
			{
				if(words[i].compareTo(words[j])>0)
				{
					temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		
		for(int i=0; i<arraySize; i++)
		{
			System.out.print(words[i]+" ");
		}
	}
}
