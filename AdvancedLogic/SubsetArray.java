import java.util.Scanner;
public class SubsetArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of elements in array :");
		int n=sc.nextInt();
		System.out.println("Enter Array Elements :");
		
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		if(sum%2==0)
		{
			sum=sum/2;
			System.out.println(subsetsum(arr, 0, sum));
		}
		else
		{
			System.out.println("false");
		}
	}
	static boolean subsetsum(int a[],int i, int sum)
	{
		if(sum==0)
		{
			return true;
		}
		else if((sum<0)||(i>=a.length))
		{
			return false;
		}
		return subsetsum(a, i+1, sum-a[i])||subsetsum(a, i+1, sum);
	}
}

