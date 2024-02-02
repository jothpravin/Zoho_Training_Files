import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

class ConnectionDB
{
	static Connection con = null;
	private static final String url = "jdbc:postgresql://localhost:5432/student";
	private static final String username = "postgres";
	private static final String password  = "postgres";
	
	private ConnectionDB()
	{
	}	
	
	public static Connection getConnection()
	{
		try
		{
			con = DriverManager.getConnection(url, username, password);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return con;
	}
	
}
