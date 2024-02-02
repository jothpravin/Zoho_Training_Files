import java.util.Scanner;

public class NprimeNumbers
{
	public static void main(String []args)
	{
		int Input, count=0, flag=0, m=2;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Limit to print Prime Numbers: ");
		Input = num.nextInt();
		
		System.out.println("-----The Prime Numbers are-----");
		while(count<Input)
		{
			flag =1;
			for(int i=2; i<=m-1; i++)
			{
				if(m%i==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				System.out.print(m+" ");
				count++;
			}
			m++;
		}
	}
}
