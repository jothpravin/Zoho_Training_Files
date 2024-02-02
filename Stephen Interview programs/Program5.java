import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements :");
        for(int i=0 ; i<n ;i++){
            a[i] = in.nextInt();
        }
        System.out.println("Enter value of k:");
        int k = in.nextInt();
        rotateArray(a,k);
        
        System.out.println("Output :");
        for(int i=0 ; i<n ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    private static void rotateArray(int[] a, int k) {
        k = k%a.length;
        reverse(a,0,a.length);
        reverse(a,0,k);
        reverse(a,k,a.length);
    }

    private static void reverse(int[] a, int i, int j) {
        j--;
        while(i<j){
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
    }
}
