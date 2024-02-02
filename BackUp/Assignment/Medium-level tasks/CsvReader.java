import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class CsvReader {

    public static void main(String[] args) 
    {
        String line;
        String[] columnNames = null;
        Map<String, String> dataMap;

        try (BufferedReader br = new BufferedReader(new FileReader("input.csv"))) 
        {

            while ((line = br.readLine()) != null) 
            {
                String[] columns = line.split(",");
               
                if (columnNames == null) 
                {
                    // First line contains column names
                    columnNames = columns;
                    continue;
                }
               
                dataMap = new LinkedHashMap<>();
                for (int i = 0; i < columns.length; i++) 
                {
                    dataMap.put(columnNames[i], columns[i]);
                }
               
                System.out.println("Data: " + dataMap);
            }

        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
