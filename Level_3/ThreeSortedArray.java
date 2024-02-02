import java.util.Scanner;

public class ThreeSortedArray
{	
	public static void main(String args[])
	{
		int ArraySize, ArraySize1, ArraySize2;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
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
		
		System.out.println("================================");		
		System.out.println("Enter the Third Array elements");		
		System.out.println("================================");
		
		System.out.print("Input number of Array size for Third array:");
		ArraySize2 = num.nextInt();
		
		int array2[] = new int[ArraySize2];
		
		for(int row=0;row<ArraySize2;row++) //To get a Input array number from User
		{	
			array2[row]=num.nextInt();
		}
		
		int i=0, j=0, k=0;
		while(i < ArraySize && j < ArraySize1 && k < ArraySize2)
		{
			if(array[i] == array1[j] && array1[j] == array2[k])
			{
				System.out.print(array[i]+" ");
				i++;
				j++;
				k++;
			}
			else if(array[i]<array1[j])
			{
				i++;
			}
			else if(array1[j]<array2[k])
			{
				j++;
			}
			else
			{
				k++;
			}
			
		}
		
		
	}
}
