import java.util.*;
import java.lang.*;
import java.io.*;

class UniqueElements
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int cases;
		int arraysize;
		Scanner in = new Scanner(System.in);
		cases = in.nextInt();
		int temp = 0;
		while(temp < cases)
		{
			arraysize = in.nextInt();
			int array[] = new int[arraysize];
			for(int i=0; i<arraysize; i++)
			{
				array[i] = in.nextInt();
			}
			Map<Integer, Integer> paris = new HashMap<>();
			for(int i=0; i<arraysize; i++)
			{
				Integer nn = paris.get(array[i]);
				if(nn != null)
				{
					paris.put(array[i], nn+1);
				}
				else
				{
					paris.put(array[i], 1);
				}
			}
			System.out.println("Output :");
			for(Map.Entry<Integer, Integer> pair : paris.entrySet())
			{
				if(pair.getValue()==1)
				{
					System.out.println(pair.getKey());
				}
			}
			temp++;
		}
	}				
}

