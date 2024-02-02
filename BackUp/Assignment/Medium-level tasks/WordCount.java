import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordCount 
{
    public static void main(String[] args) 
    {
        String fileName = "input.txt"; 

        try 
        {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            Map<String, Integer> wordCount = new HashMap<>();
	
            while ((line = reader.readLine()) != null) 
            {
                String[] words = line.split("\\s+"); // Split the line into words

                for (String word : words) 
                {
                    word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
                    if (!word.isEmpty()) 
                    {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

            reader.close();
            
            Map<String, Integer> sortedWordCount = new TreeMap<>(wordCount);

            // Display the word count results
            for (Map.Entry<String, Integer> entry : sortedWordCount.entrySet()) 
            {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        catch (IOException e) 
        {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}

