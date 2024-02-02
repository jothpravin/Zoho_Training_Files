import java.util.Scanner;

public class DifferenceBetweenWords

{
	public static void main(String args[])
	{
		String target1, target2;
		int len1=0, len2=0;
		String words[] = {"the","quick","brown","fox","quick"};
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the target1 string: ");
		target1 = str.next();
		System.out.print("Enter the target2 string: ");
		target2 = str.next();
		
		for(int i=0; i<words.length;i++)
		{
			if(words[i].equals(target1))
			{
				len1=i+1;
			}
			if(words[i].equals(target2))
			{
				len2= i+1;
			}
		}
		System.out.println("The difference between two words "+(len2-len1));
	}
}
