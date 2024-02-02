import java.util.Scanner;

public class MaximumMinimum
{	
	
	public static void main(String args[])
	{
		int ArraySize, Maximum=0, Minimum=0;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = num.nextInt();
		
		int array[] = new int[ArraySize];
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array[row]=num.nextInt();
		}
		
		Maximum = array[0];
		Minimum = array[0];
		
		for(int row=0;row<ArraySize;row++)
		{
			if(array[row]>Maximum)
			{
				Maximum = array[row];
			}
			if(array[row]<Minimum)
			{
				Minimum = array[row];
			}
		}
		System.out.println("The Maximum Number in array is : "+Maximum);
		System.out.println("The Minimum Number in array is : "+Minimum);	
		
		
	}
}
