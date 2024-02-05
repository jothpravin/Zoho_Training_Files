import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class PostExampleJSONPlaceholder {
    public static void main(String[] args) {
        try {
            // Specify the URL for the POST request
            String apiUrl = "https://jsonplaceholder.typicode.com/posts";

            // Create a URL object
            URL url = new URL(apiUrl);

            // Open a connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set request method to POST
            connection.setRequestMethod("POST");

            // Enable input/output streams for this connection
            connection.setDoOutput(true);

            // Set the request headers
            connection.setRequestProperty("Content-Type", "application/json");

            // Sample JSON data to create a new post
            String jsonData = "{ \"title\": \"New Post\", \"body\": \"This is the body of the new post.\", \"userId\": 1 }";

            // Get the OutputStream from the connection
            try (OutputStream outputStream = connection.getOutputStream()) {
                // Write the JSON data to the OutputStream
                outputStream.write(jsonData.getBytes("UTF-8"));
            }

            // Get the response code
            int responseCode = connection.getResponseCode();

            // If the response code is 201 (Created), read the response
            if (responseCode == HttpURLConnection.HTTP_CREATED) {
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

                // Print the response
                System.out.println("New Post Created: " + response.toString());
            } else {
                // If the response code is not 201, print an error message
                System.out.println("Error: HTTP response code - " + responseCode);
            }

            // Disconnect the connection
            connection.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

