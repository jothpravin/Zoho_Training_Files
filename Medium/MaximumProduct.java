import java.util.Scanner;

public class MaximumProduct
{	
	
	public static void main(String args[])
	{
		int ArraySize;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = num.nextInt();
		
		int array[] = new int[ArraySize];
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array[row]=num.nextInt();
		}
		double MaxProduct, MaximumProduct;
		
		MaximumProduct=array[0];
		
		for(int i=0;i<ArraySize;i++)
		{
			for(int j=i+1;j<ArraySize;j++)
			{
				for(int k=j+1;k<ArraySize;k++)
				{
					MaxProduct = array[i]*array[j]*array[k];
					if(MaximumProduct<MaxProduct)
					{
						MaximumProduct = MaxProduct;
					}
				}
			}
		}
		System.out.println("The Highest Product is "+MaximumProduct);	
		
		
	}
}
