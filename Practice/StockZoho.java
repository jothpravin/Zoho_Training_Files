public class StockZoho
{
	public static void solution1(int []arr, int size)
	{
		int buy = arr[0];
		int sellProfit = 0;
		
		for(int i=1; i<size; i++)
		{
			int curSell = arr[i] - buy;
			sellProfit = Math.max(sellProfit, curSell);
			buy = Math.min(buy, arr[i]);
		}
		System.out.println(sellProfit);
	}
	public static void solution2(int []arr, int size)
	{
		int buy = arr[0];
		int sellProfit = 0;
		
		for(int i=1; i<size; i++)
		{
			int curProfit = arr[i] - buy;
			if(curProfit>sellProfit)
				sellProfit = curProfit;
			if(arr[i]<buy)
				buy = arr[i];
		}
		System.out.println(sellProfit);
	}
	
	public static void main(String []args)
	{
		int arr[] = new int[]{13, 14, 7, 12, 6, 8};
		int size = arr.length;
		
		solution2(arr, size);
	}
}
