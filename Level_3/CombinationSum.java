import java.util.Scanner;

public class CombinationSum
{	
	
	public static void main(String args[])
	{
		int ArraySize, Number;
		boolean Check = true;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Input number of Array size:");
		ArraySize = num.nextInt();
		
		int array[] = new int[ArraySize];
		
		for(int row=0;row<ArraySize;row++) //To get a Input array number from User
		{	
			array[row]=num.nextInt();
		}
		
		System.out.print("Input number to Check the Four of values is equal :");
		Number = num.nextInt();
		
		
		for(int i=0;i<ArraySize;i++)
		{
			for(int j=i+1;j<ArraySize;j++)
			{
				for(int k=j+1;k<ArraySize;k++)
				{
					for(int l=k+1;l<ArraySize;l++)
					{
						if((array[i]+array[j]+array[k]+array[l])==Number)
						{
							System.out.println("The sum of Four of values "+array[i]+","+array[j]+","+array[k]+","+array[l]+" in array is equal to "+Number);
						}	
						else
						{
							Check = false; 
						}
					}
				}
			}
		}
		if(!Check)
		{
			System.out.println("There is no another combination for sum");
		}	
		
		
	}
}

				
