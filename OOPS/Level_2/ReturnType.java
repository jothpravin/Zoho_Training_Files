import java.util.Scanner;
import java.util.Arrays;

class Return
{
	public void VoidReturn()
	{
		System.out.println("Example of Returning a void from a method");
	}
	public String[] StringReturn()
	
	{
		String[] words = {"Zoho is one of the top MNC in the world"};
		return words;
	}
	
	public int[] IntReturn()
	{
		int[] Numbers = {3, 7, 8, 7, 2, 1, 2, 2};
		return Numbers;
	}
	
	public void PassingNumbers(int a, int b)
	{
		System.out.println("The Passed two Numbers are "+a+" and "+b);
	}
}

public class ReturnType
{
	public static void main(String []args)
	{
		int a, b;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		a = num.nextInt();
		System.out.print("Enter the Number: ");
		b = num.nextInt();
		Return r = new Return();
		r.VoidReturn();
		System.out.println(Arrays.toString(r.StringReturn()));
		System.out.println(Arrays.toString(r.IntReturn()));
		r.PassingNumbers(a, b);
	}
}
