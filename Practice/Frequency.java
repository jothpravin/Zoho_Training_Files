import java.util.Scanner;

public class Frequency
{
	public static void main(String []args)
	{
		int size, k=0, count=1;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the size of array :");
		size = num.nextInt();
		int array[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			array[i] = num.nextInt();
		}
		
		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(array[i]==array[j])
				{
					count++;
					array[j] = 0;
				}
			}
			if(count>=1 && array[i]!=0)
			{
				System.out.println("The frequency of "+array[i]+" this number is :"+count);
				count=1;
			}
		}
	}
}
