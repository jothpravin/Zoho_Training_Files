import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CSVFileSearch 
{
    private Set<String> dataHashSet = new HashSet<>();

    public void readCSVFile(String filename) 
    {
        try(FileReader fileReader = new FileReader(filename);
             BufferedReader br = new BufferedReader(fileReader)) 
	  {
            String line;
            while ((line = br.readLine()) != null) 
	      {
                // Split the CSV line by a comma (assuming comma-separated values)
                String[] values = line.split(",");
                for (String value : values) 
		    {
                    dataHashSet.add(value.trim());
                }
            }
        } 
	catch(IOException e) 
	{
            e.printStackTrace();
      }
    }

    public void search(String searchTerm) 
    {
        System.out.println("Searching for entries matching: " + searchTerm);
        for (String entry : dataHashSet) 
	  {
            if (entry.contains(searchTerm)) 
	      {
                System.out.println("Founded :"+entry);
            }
        }
    }

    public static void main(String[] args) 
    {
        CSVFileSearch csvFileSearch = new CSVFileSearch();
        csvFileSearch.readCSVFile("input.csv");

        String searchTerm = "India"; 
        csvFileSearch.search(searchTerm);
    }
}

