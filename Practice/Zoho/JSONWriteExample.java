import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONWriteExample {

    public static void main(String[] args) throws FileNotFoundException {
        // Creating a JSON object
        JSONObject jsonObject = createJsonObject();

        // Writing JSON data to a file
        writeJsonToFile(jsonObject, "author.json");
    }

    private static JSONObject createJsonObject() {
        // Creating a JSON object
        JSONObject jsonObject = new JSONObject();

        // Adding data to the JSON object
        jsonObject.put("firstName", "Rachel");
        jsonObject.put("lastName", "Green");
        jsonObject.put("age", 30);
        jsonObject.put("noOfPosts", 100);
        jsonObject.put("status", "active");

        // Creating a LinkedHashMap for address data
        Map<String, Object> addressMap = new LinkedHashMap<>();
        addressMap.put("road", "MG Road Cross cut Street");
        addressMap.put("city", "Bangalore");
        addressMap.put("state", "Karnataka");
        addressMap.put("pinCode", 560064);

        // Adding address to the JSON object
        jsonObject.put("addressOfAuthor", addressMap);

        // Creating a JSONArray for phone numbers
        JSONArray phoneNumberJsonArray = createPhoneNumberJsonArray();

        // Adding phone numbers to the JSON object
        jsonObject.put("phoneNos", phoneNumberJsonArray);

        return jsonObject;
    }

    private static JSONArray createPhoneNumberJsonArray() {
        // Creating a JSONArray for phone numbers
        JSONArray phoneNumberJsonArray = new JSONArray();

        // Creating a LinkedHashMap for the first phone number
        Map<String, Object> addressMap1 = new LinkedHashMap<>();
        addressMap1.put("presentAt", "home");
        addressMap1.put("phoneNumber", "1234567890");

        // Adding the first phone number to the list
        phoneNumberJsonArray.put(addressMap1);

        // Creating a LinkedHashMap for the second phone number
        Map<String, Object> addressMap2 = new LinkedHashMap<>();
        addressMap2.put("type", "fax");
        addressMap2.put("number", "6366182095");

        // Adding the second phone number to the list
        phoneNumberJsonArray.put(addressMap2);

        return phoneNumberJsonArray;
    }

    private static void writeJsonToFile(JSONObject jsonObject, String fileName) throws FileNotFoundException {
        // Writing JSON data to a file
        try (PrintWriter printWriter = new PrintWriter(fileName)) {
            printWriter.write(jsonObject.toString(2)); // Using pretty print with an indentation of 2 spaces
            printWriter.flush();
        }
    }
}

