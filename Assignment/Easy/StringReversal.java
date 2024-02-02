import java.util.Scanner;

public class StringReversal 
{
    public static String reverseString(String input) 
    {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) 
        {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        String reversedString = reverseString(userInput);
        System.out.println("Reversed string: " + reversedString);

    }
}
