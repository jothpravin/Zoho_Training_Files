import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.TreeSet;
import java.util.TreeMap;

public class MainGet {
    public static void main(String[] args) {
        try {
            // URL for the API
            String apiUrl = "https://restcountries.com/v3.1/all";

            // Create a URL object
            URL url = new URL(apiUrl);

            // Open a connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set request method
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();

            // If the response code is 200 (OK), read the response
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Create a BufferedReader to read the response
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                // Read the response line by line and append it to the StringBuilder
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }

                // Close the BufferedReader
                in.close();
                // Parse JSON response
                JSONParser parser = new JSONParser();
                JSONArray countriesArray = (JSONArray) parser.parse(response.toString());
                TreeSet<Object> countriesName = new TreeSet<>();

                // Iterate through the array and print the country names
                for (Object obj : countriesArray) {
                    JSONObject countryObj = (JSONObject) obj;
                    JSONObject nameObj = (JSONObject) countryObj.get("name");
                    System.out.println(nameObj.get("common"));
                    countriesName.add(nameObj.get("common"));
                }
                System.out.println(countriesName);
		    TreeMap<Long, String> populationCountries = new TreeMap<>();
                for (Object obj : countriesArray) {
		    JSONObject countryObj = (JSONObject) obj;
		    JSONObject nameObj = (JSONObject) countryObj.get("name");

		    // Check if the "population" field is present
		    if (countryObj.containsKey("population")) {
			  // Extract population as a Long
			  Long population = (Long) countryObj.get("population");

			  // Extract country name as a String
			  String countryName = (String) nameObj.get("common");

			  // Put data into the TreeMap
			  populationCountries.put(population, countryName);
		    } else {
			  // Handle the case where "population" field is missing for a country
			  System.out.println("Population data missing for a country: " + nameObj.get("common"));
		    }
		    }
                System.out.println(populationCountries);
                
            } else {
                // If the response code is not 200, print an error message
                System.out.println("Error: HTTP response code - " + responseCode);
            }
            // Disconnect the connection
            connection.disconnect();

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}

