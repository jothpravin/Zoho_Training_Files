import java.util.Arrays;

public class QuickSort
{
	public static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void quickSort(int arr[], int low, int high)
	{
		if(low < high)
		{
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
			
		}
	}
	
	public static int partition(int arr[], int low, int high)
	{
		int pivot = arr[high];
		int i = low -1;
		
		for(int j=low ; j<high; j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, high);
		return i+1;
	}
	
	public static void main(String []args)
	{
		int arr[] = {7,4,6,9,1,2,3};
		quickSort(arr, 0, 6);
		System.out.println(Arrays.toString(arr));		
	}
}
