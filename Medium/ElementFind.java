import java.util.Scanner;

public class ElementFind
{	
	public static void main(String args[])
	{
		int ArraySize, Number;
		boolean check =true;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = num.nextInt();
		
		int array[] = new int[ArraySize];
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array[row]=num.nextInt();
		}
		
		System.out.print("Input a Number to Avaiable or not: ");
		Number = num.nextInt();
		
		int i=0;
		while(array[i]<ArraySize)
		{
			if(array[i]==Number)
			{
				check = true;
				break;
			}
			else
			{
				i++;
				check = false;
			}
		}
		if(check)
		{
			System.out.println("The Number is avaibable in the array");
		}
		else
		{
			System.out.println("The Number is not avaibable in the array");
		}
	}
}
