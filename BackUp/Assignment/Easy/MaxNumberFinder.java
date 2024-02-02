import java.util.Scanner;

public class MaxNumberFinder {
    public static int findMax(int[] numbers) 
    {
        if (numbers.length == 0) 
        {
            throw new IllegalArgumentException("The array is empty.");
        }

        int max = numbers[0];
        for (int number : numbers) 
        {
            if (number > max) 
            {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        try 
        {
            int maxNumber = findMax(numbers);
            System.out.println("The largest number in the array is: " + maxNumber);
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println(e.getMessage());
        }

    }
}
