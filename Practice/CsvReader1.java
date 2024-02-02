import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class CsvReader1 {
    public static void main(String[] args) {
        String line;
        String[] columnNames = null;
        Map<String, String> dataMap;

        try (BufferedReader br = new BufferedReader(new FileReader("input.csv"))) {

            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");

                if (columnNames == null) {
                    // First line contains column names
                    columnNames = columns;
                    for (int i = 0; i < columns.length; i++) {
                        System.out.printf("%-15s |", columnNames[i]);
                    }
                    System.out.println();
                    continue;
                }

                //dataMap = new LinkedHashMap<>();
                for (int i = 0; i < columns.length; i++) {
                	System.out.printf("%-15s |", columns[i]);
                }

                //for (Map.Entry<String, String> data : dataMap.entrySet()) {
                  //  System.out.printf("%-15s", data.getValue());
                //}
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

