import java.util.Scanner;

public class ArrayEqual
{	
	public static void ArrayEqual(int arr[], int arr1[], int arrSize, int arrSize1)
	{
		boolean Equal = true;
		if(arrSize==arrSize1)
		{
			for(int row=0; row<arr.length; row++)
			{
				if(arr[row]!=arr1[row])
				{
					Equal = false;
				}
			}
		}
		else
		{
			Equal = false;	
		}
		
		if(Equal)
		{
			System.out.println("Two arrays are Equal");
		}
		else
		{
			System.out.println("Two arrays are not Equal");
		}
		
		
	}
	
	public static void main(String args[])
	{
		int ArraySize, ArraySize1;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size for first array:");
		ArraySize = num.nextInt();
		
		int array[] = new int[ArraySize];
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array[row]=num.nextInt();
		}
		
		System.out.println("================================");		
		System.out.println("Enter the Second Array elements");		
		System.out.println("================================");
		
		System.out.print("Input number of Array size for Second array:");
		ArraySize1 = num.nextInt();
		
		int array1[] = new int[ArraySize1];
		
		for(int row=0;row<ArraySize1;row++) //To get a Input array number from User
		{	
			array1[row]=num.nextInt();
		}	
		
		ArrayEqual(array, array1, ArraySize, ArraySize1);
		
		
	}
}
