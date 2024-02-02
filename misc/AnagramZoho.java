import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class AnagramZoho
{
	public static String sort(String s)
	{
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		String temp = String.valueOf(ch);
		return temp;
	}
	public static String[] arraySort(String []s)
	{
		String temp[] = new String[s.length];
		for(int i=0; i<s.length; i++)
		{
			temp[i] = sort(s[i]);
		}
		return temp;
	}
	public static void main(String []args)
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of array :");
		n = s.nextInt();
		
		ArrayList<ArrayList<String>> result = new ArrayList<>();
		String str[] = new String[n];
		String str1[] = new String[n];
		System.out.print("Enter the array :");
		
		for(int i=0; i<n; i++)
		{
			str[i] = s.next();
		}
		str1 = arraySort(str);
		System.out.println(Arrays.toString(str1));
		boolean[] visited = new boolean[n];
		for(int i=0; i<n; i++)
		{
			if (!visited[i]) 
			{
		          ArrayList<String> res = new ArrayList<>();
		          res.add(str[i]);
		          
		          for (int j = i + 1; j < n; j++) 
		          {
		              if (str1[i].equals(str1[j])) 
		              {
		                  res.add(str[j]);
		                  visited[j] = true; // Mark the anagram as visited
		              }
		          }
		          result.add(res);
            	}
		}
		System.out.println(result);
	}
}
