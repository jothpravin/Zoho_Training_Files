import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class ClientHandler extends Thread 
{
	private Socket clientSocket;
	private BufferedReader in;
	private PrintWriter out;
	private static List<ClientHandler> connectedClients = new ArrayList<>();

	public ClientHandler(Socket socket) 
	{
		this.clientSocket = socket;
	}

	public void run() 
	{
	try 
		{
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			out = new PrintWriter(clientSocket.getOutputStream(), true);

			// Perform login or signup
			if (authenticate()) 
			{
				// Successful login
				out.println("Login successful");
				// Continue with the chat logic
				handleChat();
			} else {
			// Failed login
				out.println("Login failed");
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	private boolean authenticate() throws IOException 
	{
		out.println("Enter username:");
		String username = in.readLine();
		out.println("Enter password:");
		String password = in.readLine();

		// Authenticate the user
		return Server.authenticateUser(username, password);
	}

	private void handleChat() throws IOException 
	{
		try 
		{
			out.println("Login successful. You can start chatting.");

			// Add the current client to the list
			connectedClients.add(this);

			// Broadcast the new user joined message
			broadcastMessage("User " + clientSocket.getInetAddress() + " has joined the chat.");

				while (true) 
				{
					String message = in.readLine();
					if (message == null || message.equalsIgnoreCase("exit")) {
					// Handle user logout or exit
					connectedClients.remove(this);
					broadcastMessage("User " + clientSocket.getInetAddress() + " has left the chat.");
					break;
					}

					// Broadcast the message to all connected clients
					broadcastMessage("[" + clientSocket.getInetAddress() + "]: " + message);
				}
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			} 
			
			finally 
			{
				// Close the resources when the chat loop ends
				in.close();
				out.close();
				clientSocket.close();
			}
	}

	private void broadcastMessage(String message) 
	{
	// Broadcast the message to all connected clients
		for (ClientHandler client : connectedClients) 
		{
			if (client != this) 
			{
				client.out.println(message);
			}
		}
	}
}
