import java.util.Scanner;

public class AverageCalculator 
{
    public static double calculateAverage(int[] numbers) 
    {
        if (numbers.length == 0) 
        {
            return 0.0;
        }

        int sum = 0;
        for (int number : numbers) 
        {
            sum += number;
        }

        double average = (double) sum / numbers.length;
        return average;
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

        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);

    }
}
