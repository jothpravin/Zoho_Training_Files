import java.util.Scanner;

public class Program1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements :");
        for(int i=0 ; i<n ;i++){
            a[i] = in.nextInt();
        }
        int index = 0;
        for(int i=0 ; i<n ; i++){
            if(a[i] != 0){
                a[index++] = a[i];
            }
        }

        if(index!=0){
            for( ; index<n ; index++){
                a[index] = 0;
            }
        }

        System.out.println("Output :");
        for(int i=0 ; i<n ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}