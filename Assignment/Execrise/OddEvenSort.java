import java.util.Arrays;
import java.util.Scanner;

public class OddEvenSort 
{
    public static void main(String[] args) 
    {
    	  int n;
    	  Scanner s = new Scanner(System.in);
    	  n = s.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++)
        {
        	arr[i] = s.nextInt();
        }
        
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
     }

    public static void sortArray(int[] arr) 
    {
        int[] odd;
        int[] even;
        if(arr.length%2==0)
        {
            odd = new int[arr.length /2];
            even = new int[arr.length /2 ];
        }
        else
        {
            odd = new int[(arr.length /2)];
            even = new int[(arr.length /2)+1];
        }
        int oddIndex = 0, evenIndex = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            if (i % 2 == 0) 
            {
                even[evenIndex++] = arr[i];
            }
            else 
            {
                odd[oddIndex++] = arr[i];
            }
        }

        Arrays.sort(even);
        Arrays.sort(odd);
        reverse(odd);

        for (int i = 0; i < arr.length; i++) 
        {
            if (i % 2 == 0) 
            {
                arr[i] = even[--evenIndex];
            } 
            else 
            {
                arr[i] = odd[--oddIndex];
            }
        }
    }
    
  public static void reverse(int[] arr) 
  {
	  int left = 0;
	  int right = arr.length - 1;
	  while (left < right) 
	  {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		left++;
		right--;
	  }
   }
}

