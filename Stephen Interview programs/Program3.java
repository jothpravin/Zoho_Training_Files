import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements :");
        for(int i=0 ; i<n ;i++){
            a[i] = in.nextInt();
        }

        int sum = 0;
        for(int i : a){
            sum+=i;
        }
        int nsum = (n*(n-1))/2;

        System.out.println(sum-nsum);
    }
}
