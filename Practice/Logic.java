import java.util.Scanner;

public class Logic
{
	public static void main(String []args)
	{
		int size, k, count=0;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the size of array :");
		size = num.nextInt();
		int array[] = new int[size];
		int array1[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			array[i] = num.nextInt();
		}
		k=0;
		for(int i=0; i<size-1; i++)
		{
			if(array[i]==0)
			{
				count++;
			}
			else if(array[i]==array[i+1])
			{
				array1[k++] = array[i]+array[i+1];
				count++;
				i++;
			}
			else
			{
				array1[k++] = array[i];
			}
		}
		array1[k++] = array[size-1];
		for(int i=k; i<size; i++)
		{
			array1[i] = 0;
		}
		for(int i=0; i<size; i++)
		{
			System.out.print(array1[i]+" ");
		}
	}
}
