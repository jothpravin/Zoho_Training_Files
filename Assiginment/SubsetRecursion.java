import java.util.Scanner;

public class SubsetRecursion 
{
    public static void main(String[] args) 
    {
    	Scanner str = new Scanner(System.in);
    	String words;
    	System.out.print("Enter the String: ");
  	words = str.next();
  	
   	generateSubsets("", words);
    }

    private static void generateSubsets(String temp, String words) 
    {
        if(words.isEmpty())
        {
        	System.out.println(temp);		
        	return;
        }
        
        char ch = words.charAt(0);
        
        generateSubsets(temp+ch, words.substring(1));
        generateSubsets(temp, words.substring(1));
    }
}
