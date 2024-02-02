import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

public class Server {
    private static Map<String, String> userCredentials = new HashMap<>();

    public static void main(String[] args) throws IOException {
        // Load user credentials from a file or database
        loadUserCredentials();

        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                new ClientHandler(clientSocket).start();
            }
        }
    }

    private static void loadUserCredentials() {
        // In a real-world scenario, you might read user credentials from a database
        // For simplicity, we are using an in-memory map here
        userCredentials.put("user1", "password1");
        userCredentials.put("user2", "password2");
    }

    public static boolean authenticateUser(String username, String password) {
        // In a real-world scenario, you would check against a database of user credentials
        String storedPassword = userCredentials.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }
}
