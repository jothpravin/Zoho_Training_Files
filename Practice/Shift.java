import java.util.Scanner;

public class Shift
{
	public static void main(String []args)
	{
		String input, res1="", res2="";
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String :");
		input = str.nextLine();
		
		String arr[] = input.split(" ");
		
		for(int i=0; i<arr.length; i++)
		{
			char [] arrChar = arr[i].toCharArray();
			res1=""; res2="";
			for(int j=0; j<arrChar.length; j++)
			{
				if(j%2==0)
				{
					res1 += arrChar[j];
				}
				else
				{
					res2 += arrChar[j];
				}
			}
			System.out.print(res1+" ");
			System.out.print(res2);
			System.out.println();
		}
		
	}
}
