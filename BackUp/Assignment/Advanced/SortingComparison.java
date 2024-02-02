import java.util.Arrays;
import java.util.Random;

public class SortingComparison 
{
    public static void main(String[] args) 
    {
        int n = 100000; 
        int[] arr = generateRandomArray(n);
        int[] arrBubble = arr.clone();
        int[] arrSelection = arr.clone();
        int[] arrInsertion = arr.clone();
        int[] arrQuick = arr.clone();

        long startTime, endTime;

        // Bubble Sort
        startTime = System.currentTimeMillis();
        bubbleSort(arrBubble);
        endTime = System.currentTimeMillis();
        System.out.println("Bubble Sort Time: " + (endTime - startTime) + " ms");

        // Selection Sort
        startTime = System.currentTimeMillis();
        selectionSort(arrSelection);
        endTime = System.currentTimeMillis();
        System.out.println("Selection Sort Time: " + (endTime - startTime) + " ms");

        // Insertion Sort
        startTime = System.currentTimeMillis();
        insertionSort(arrInsertion);
        endTime = System.currentTimeMillis();
        System.out.println("Insertion Sort Time: " + (endTime - startTime) + " ms");

        // Quick Sort
        startTime = System.currentTimeMillis();
        quickSort(arrQuick, 0, arrQuick.length - 1);
        endTime = System.currentTimeMillis();
        System.out.println("Quick Sort Time: " + (endTime - startTime) + " ms");
    }

    public static int[] generateRandomArray(int size) 
    {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) 
	  {
            arr[i] = random.nextInt(10000);
        }
        return arr;
    }

    public static void bubbleSort(int[] arr) 
    {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) 
	  {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) 
	      {
                if (arr[j] > arr[j + 1]) 
		    {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) 
	      {
                break;
            }
        }
    }

    public static void selectionSort(int[] arr) 
    {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++)
        {
            int minIndex = i;
            for(int j = i + 1; j < n; j++) 
	      {
                if (arr[j] < arr[minIndex]) 
		    {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void insertionSort(int[] arr) 
    {
        int n = arr.length;
        for (int i = 1; i < n; i++) 
	  {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) 
	      {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void quickSort(int[] arr, int low, int high) 
    {
        if (low < high) 
	  {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) 
    {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) 
	  {
            if (arr[j] < pivot) 
	      {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }	
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}

