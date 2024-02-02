import java.sql.Connection;
class UserDAO
{
	public static void main(String[] args)
	{
		Connection c1 = ConnectionDB.getConnection();
		
		System.out.println(c1);
		ConnectionDB.closeConnection();
		Connection c2 = ConnectionDB.getConnection();
		System.out.println(c2);
	}
}
