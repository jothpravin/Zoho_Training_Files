import java.util.Scanner;

public class MaxProductArray
{	
	
	public static void main(String args[])
	{
		int ArraySize;
		boolean check =true;
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
		
		if(!(ArraySize<3))
		{
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
							check = true;
						}
					}
				}
			}
		}
		else
		{
			check =false;
		}
		if(check)
		{
			System.out.println("The Highest Product is "+MaximumProduct);	
		}
		else
		{
			System.out.println("There is no triplet in the Array");
		}
		
	}
}
