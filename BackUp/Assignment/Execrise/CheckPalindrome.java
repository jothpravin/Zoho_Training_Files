import java.util.Scanner;

public class CheckPalindrome
{
	public static String removeSpace(String str)
	{
		String tempStr="";
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			{
				tempStr += str.charAt(i);
			}
			else
			{
				continue;
			}
		}
		return tempStr;
	} 
	public static boolean checkPalin(String input)
	{
	  input = input.toLowerCase(); 
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
	} 
	
	public static void main(String []args)
	{
		String palin;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String :");
		palin = s.nextLine();
		palin = removeSpace(palin);
		System.out.println(palin);
		System.out.println(checkPalin(palin));
		
	}
}
