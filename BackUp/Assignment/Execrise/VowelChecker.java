import java.util.Scanner;

public class VowelChecker 
{
    public static boolean containsVowel(String input) 
    {
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                return true; 
            }
        }
        return false; .
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        boolean hasVowel = containsVowel(userInput);

        if (hasVowel) 
        {
            System.out.println("The string contains at least one vowel.");
        } else 
        {
            System.out.println("The string does not contain any vowels.");
        }

    }
}
