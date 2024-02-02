import java.util.*;

public class NumberOccurans
{
	public static void main(String []args)
	{
		int size, count=0;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the size of array :");
		size = num.nextInt();
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			arr[i] = num.nextInt();
		}
		
		Map <Integer, Integer> m = new HashMap<>();
		
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			m.put(arr[i], count);
			count=0;
		}
		
		for(Map.Entry ma : m.entrySet())
		{
			System.out.println(ma.getKey()+" - "+ma.getValue());
		}
		
		System.out.println(m);
	}
}
