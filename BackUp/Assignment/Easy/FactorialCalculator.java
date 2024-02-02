import java.util.Scanner;

public class FactorialCalculator 
{
    public static long calculateFactorial(int n) 
    {
        if (n < 0) 
        {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) 
        {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int userInput = scanner.nextInt();

        try 
        {
            long factorial = calculateFactorial(userInput);
            System.out.println(userInput + "! = " + factorial);
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println(e.getMessage());
        }

    }
}
