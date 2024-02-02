import java.util.Scanner;

public class PalindromeChecker 
{
    public static boolean isPalindrome(String input) 
    {
        input = input.toLowerCase();
        int left = 0;
        int right = input.length() - 1;

        while (left < right) 
        {
            if (input.charAt(left) != input.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        boolean isPalindome = isPalindrome(userInput);

        if (isPalindome) 
        {
            System.out.println("The string is a palindrome.");
        }
        else 
        {
            System.out.println("The string is not a palindrome.");
        }

    }
}
