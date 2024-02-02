public class Patter4 {
    public static void main(String[] args) {
        int n = 10; // Number of lines in the pattern
        String result = "1"; // Initialize the result with the first number

        System.out.println(result); // Print the first number

        for (int i = 2; i <= n; i++) {
            result = generateNextPattern(result);
            System.out.println(result); // Print the next number in the pattern
        }
    }

    // Function to generate the next number in the pattern
    public static String generateNextPattern(String input) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        char currentChar = input.charAt(0);

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(count).append(currentChar);
                count = 1;
                currentChar = input.charAt(i);
            }
        }

        // Append the count and the final character
        result.append(count).append(currentChar);

        return result.toString();
    }
}

