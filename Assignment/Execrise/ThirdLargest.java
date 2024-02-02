import java.util.Scanner;
import java.util.Arrays;

public class ThirdLargest
{
	public static void main(String []args)
	{
		int n;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		n = num.nextInt();
		
		int array[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			array[i] = num.nextInt();
		}
		Arrays.sort(array);
		if(n<2)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println("The Third Largest Number is :"+array[n-3]);
		}
	}
}
