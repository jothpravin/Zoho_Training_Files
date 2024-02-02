import java.util.Arrays;

public class QuickSortEx
{
	public static void swap(int []arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void quickSort(int []arr, int low, int high)
	{
		if(low < high)
		{
			int part = partition(arr, low, high);
			quickSort(arr, low, part-1);
			quickSort(arr, part+1, high);
		}
	}
	
	public static int partition(int []arr, int low, int high)
	{
		int pivot = arr[high];
		int i = low - 1;
		for(int j = low; j<high; j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, high);
		//System.out.println(Arrays.toString(arr));
		return i+1;
	}
	
	public static void bubbleSort(int arr[])
	{
		int n = arr.length - 1;
		boolean swapped;
		for(int i=0; i<n; i++)
		{
			swapped = false;
			for(int j=0; j<n - i; j++)
			{
				if(arr[j+1] < arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true; 
				}
			}
			if(!swapped)
			{
				break;
			}
		}
	}
	
	public static void selectionSort(int arr[])
	{
		int n = arr.length;
		int minIndex;
		for(int i=0; i<n-1; i++)
		{
			minIndex = i;
			for(int j= i + 1; j<n; j++)
			{
				if(arr[j]<arr[minIndex])
				{
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	
	public static void insertionSort(int []arr)
	{
		int n = arr.length;
		for(int i=1; i<n; i++)
		{
			int key = arr[i];
			int j = i - 1;
			while(j>=0 && arr[j]> key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			//System.out.println("Insertion: "+Arrays.toString(arr));
		}
	}
	
	public static void main(String []args)
	{
		int arr[] = new int[]{2,6,5,1,7,3,4,0};
		int[] arrBubble = arr.clone();
		int[] arrSelection = arr.clone();
		int[] arrInsertion = arr.clone();
		quickSort(arr, 0, arr.length-1);
		bubbleSort(arrBubble);
		selectionSort(arrSelection);
		insertionSort(arrInsertion);
		System.out.println("Quick: "+Arrays.toString(arr));
		System.out.println("Bubble: "+Arrays.toString(arrBubble));
		System.out.println("Selection: "+Arrays.toString(arrSelection));
		System.out.println("Insertion: "+Arrays.toString(arrInsertion));
	}
}
