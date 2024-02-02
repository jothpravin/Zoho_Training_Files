import java.util.Scanner;

public class NumberToCharacterConverter {

    public static String numberToCharacter(int num) {
        if (num <= 0) {
            Sytem.out.println("Input must be a positive integer");
        }

        String result = "";
        while (num > 0) {
            int remainder = (num - 1) % 26; // Adjust for 1-based indexing
            char digit = (char) ('A' + remainder);
            result = digit + result;
            num = (num - 1) / 26; // Adjust for 1-based indexing
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (separated by spaces):");
        String input = scanner.nextLine();
        String[] numbers = input.split("\\s+");

        for (String numStr : numbers) {
            try {
                int num = Integer.parseInt(numStr);
                String result = numberToCharacter(num);
                System.out.println(num + " => " + result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + numStr);
            }
        }

        scanner.close();
    }
}

