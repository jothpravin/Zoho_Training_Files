import java.util.Scanner;

public class StringZoho 
{
    public static void main(String[] args) 
    {
        String inputSentence = "af bc or apple b for balllbc";
        String inputCharacters = "abc";

        String shortestSubstring = findShortestSubstring(inputSentence, inputCharacters);

        System.out.println("Shortest Substring: " + shortestSubstring);
    }

    private static String findShortestSubstring(String sentence, String characters) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        int requiredCharacters = characters.length();
        int left = 0, right = 0;
        int minLength = Integer.MAX_VALUE;
        int minLeft = 0;

        while (right < sentence.length()) {
            char currentChar = sentence.charAt(right);
            charCount[currentChar]++;

            while (containsAllCharacters(charCount, characters)) {
                int currentLength = right - left + 1;
                if (currentLength < minLength) {
                    minLength = currentLength;
                    minLeft = left;
                }

                char leftChar = sentence.charAt(left);
                charCount[leftChar]--;

                left++;
            }

            right++;
        }

        if (minLength == Integer.MAX_VALUE) {
            return ""; // No valid substring found
        }

        return sentence.substring(minLeft, minLeft + minLength);
    }

    private static boolean containsAllCharacters(int[] charCount, String characters) {
        for (char c : characters.toCharArray()) {
            if (charCount[c] == 0) {
                return false;
            }
        }
        return true;
    }
}

