import java.sql.*;
import java.util.Scanner;

public class PostgresConnection 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String jdbcUrl = "jdbc:postgresql://localhost:5432/shop";
		String username = "postgres";
		String password = "postgres";
		String query = "select * from customer";
		String query1 = "insert into customer values(?,?)";
		String q = "create table dum(id int, name text)";


	try
	{
	
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
		PreparedStatement st = connection.prepareStatement(query1);
		System.out.println("Connected to the PostgreSQL database!");
		while(true)
		{
			System.out.print("Enter 1 to add to database and 2 to show :");
			int n = in.nextInt();
			switch(n)
			{
				case 1:
				{
					System.out.println("------------------------");
					System.out.print("Enter the name :");
					String name = in.next();
					System.out.print("Enter the mobile no :");
					long mobile = in.nextLong();
					System.out.print("Enter the place :");
					String place = in.next();
					st.setString(1, name);
					st.setLong(2, mobile);
					st.setString(3, place);
					int i = st.executeUpdate();
					System.out.println(i+" Rowed affected");
					System.out.println("------------------------");	
					break;
				}
				case 2:
				{
					Statement st1 = connection.createStatement();
					System.out.println("Table Values");
					ResultSet rs = st1.executeQuery(query);
					System.out.println("------------------------");
					while(rs.next())
					{
						System.out.print("Name :");
						System.out.println(rs.getString("name"));
						System.out.print("Mobile no :");
						System.out.println(rs.getLong("mobile"));
						System.out.print("Place :");
						System.out.println(rs.getString("place"));
						System.out.println("------------------------");
					}
					break;
				}
				
				default:
				{
					System.out.print("Exiting....");
					System.exit(0);
				}
			}
			
		}
	} 
	catch (Exception e) 
	{
		e.printStackTrace();
	}
    }
}

