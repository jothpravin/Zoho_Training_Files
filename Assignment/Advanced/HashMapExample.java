import java.util.Map;
import java.util.HashMap;

public class HashMapExample
{
	private Map<String, Integer> WordHashMap;
	public HashMapExample()
	{
		WordHashMap = new HashMap<>(); 
	}
	
	public void updateString(String str)
	{
		String[] words = str.split("\\s+");
		for(String word: words)
		{
			word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
			WordHashMap.put(word, WordHashMap.getOrDefault(word, 0)+1);
		}
	}
	
	public void printWordFreq()
	{
		for(Map.Entry<String, Integer> entry : WordHashMap.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	
	public static void main(String []args)
	{
		HashMapExample hm = new HashMapExample();
		hm.updateString("This is a simple test. This is only a test.");
		hm.updateString("Count the frequency of words in this sentence.");
		hm.updateString("This is a test for the word frequency counter.");

		hm.printWordFreq();
		
	}
}
