import java.util.Scanner;

public class Vowels
{
	public static void main(String args[])
	{
		String Character;
		Scanner c = new Scanner(System.in);
		
		System.out.print("Input an alphapet : ");
		Character = c.next().toLowerCase();
		
		boolean lowerCase = Character.charAt(0) >= 97 && Character.charAt(0) <=122;
		boolean vowels = Character.equals("a") || Character.equals("e") || Character.equals("i") || Character.equals("o") || Character.equals("u");
		
		if (Character.length()>1)
		{
			System.out.println("Error..! ,Enter a Single Character");
		}
		else if(!(lowerCase))
		{
			System.out.println("Error , Not a Letter from alphabet");
		}
		else if(vowels)
		{
			System.out.println("Input Character "+Character+" is Vowel");
		}
		else
		{
			System.out.println("Input Character is "+Character);
		}
	}
}

