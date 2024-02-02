import java.util.Scanner;

public class ProductExceptIt
{	
	public static void main(String args[])
	{
		int ArraySize, Product=1;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = num.nextInt();
		
		int array[] = new int[ArraySize];
		int array1[] = new int[ArraySize];
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array[row]=num.nextInt();
		}
		
		for(int i=0;i<ArraySize;i++)
		{
			array1[i] = Product;
			Product = Product*array[i];
		}
		
		Product = 1;
		for(int j=ArraySize-1;j>=0;j--)
		{
			array1[j] = array1[j] * Product;
			Product = Product*array[j];
		}
		
		for(int i=0;i<ArraySize;i++)
		{
			System.out.print(array1[i]+" ");
		}
		
		System.out.println("");
	}
}
