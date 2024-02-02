import java.io.*;
import java.net.*;

public class Client 
{
	public static void main(String[] args) throws IOException 
	{
		Socket socket = new Socket("localhost", 12345);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

		while (true) 
		{
			System.out.print("Enter username: ");
			String username = consoleInput.readLine();
			out.println(username);

			System.out.print("Enter password: ");
			String password = consoleInput.readLine();
			out.println(password);

			String response = in.readLine();
			System.out.println(response);

			if (response.equals("Login successful")) 
			{
				// Start chatting
				break;
			} 
			else 
			{
				// Retry login or handle accordingly
				System.out.println("Login failed. Please try again.");
			}
		}

		// Now, the client is authenticated and can start chatting
		System.out.println("You can start typing messages. Type 'exit' to logout.");

		// Create a separate thread for receiving messages from the server
		new Thread(() -> {
		try 
		{
			while (true) 
			{
				String message = in.readLine();
				if (message == null) 
				{
					break;
				}
				System.out.println(message);
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		}).start();

		// Send messages to the server
		while (true) 
		{
			String message = consoleInput.readLine();
			out.println(message);
			if (message.equalsIgnoreCase("exit")) 
			{
				// Exit the chat loop
				break;
			}
		}

		// Close resources when done
		in.close();
		out.close();
		socket.close();
	}
}
