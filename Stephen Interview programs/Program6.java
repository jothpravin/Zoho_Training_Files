import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        System.out.println("Enter n :");
        Scanner in = new Scanner(System.in);
        System.out.println(fibonacci(in.nextInt()));
    }

    private static int fibonacci(int n) {
        if(n<4) return n;
        int a = 2;
        int b = 3;
        n = n-3;
        while(n != 0){
            int c = a+b;
            a = b;
            b = c;
            n--;
        }
        return b;
    }
}
