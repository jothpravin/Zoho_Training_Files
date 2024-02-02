import java.util.*;

public class NUmberOcc
{
	public static void main(String []args)
	{
		int size, count=1;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the size of array :");
		size = num.nextInt();
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			arr[i] = num.nextInt();
		}
		
		for(int i=0; i<size-1; i++)
		{
			if(arr[i]==arr[i+1])
			{
				count++;
				//if(arr[i+1]!=arr[i+2])
				//{
				//	System.out.println(arr[i+1]+" --> "+count);
				//	count = 1;
				//}
			}
			else
			{
				System.out.println(arr[i]+" --> "+count);
				count = 1;
			}
		}
	}
}
