public class Sqrt
{
	private static int sqrt(int n)
	{
		int low = 0;
		int high = n - 1;
		while(low <= high)
		{
			long mid = (low+high)/2;
			long val = mid * mid;
			
			if(val <= (int) n)
			{
				low = (int)mid + 1;
			}
			else if(val >= (int) n)
			{	
				high = (int)mid - 1;
			}
		}
		return high;
	}
	public static void main(String []args)
	{
		System.out.println("Square root of 20 :"+sqrt(20));
	}	
}
