import java.util.Scanner;
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
		
		String str[] = new String[n];
		String str1[] = new String[n];
		System.out.print("Enter the array :");
		
		for(int i=0; i<n; i++)
		{
			str[i] = s.next();
		}
		str1 = arraySort(str);
		//System.out.println(Arrays.toString(str1));
		boolean[] visited = new boolean[n];
		System.out.print("[");
		for(int i=0; i<n; i++)
		{
			if(!visited[i]) 
			{
		          String res = str[i];
		          
		          System.out.print("[");
		          for(int j = i + 1; j < n; j++) 
		          {
		              if(!visited[j] && str1[i].equals(str1[j])) 
		              {
		              	res += ", "+str[j];
		                  visited[j] = true; // Mark the anagram as visited
		              }
		          }
			    System.out.print(res); 
		          System.out.print("], "); 
            	}
		}
		System.out.println("]");
	}
}
