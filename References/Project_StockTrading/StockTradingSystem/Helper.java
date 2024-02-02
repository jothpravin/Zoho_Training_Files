package StockTradingSystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Helper 
{
    static Connection con = null;
    static Statement stm = null;

    public Helper() 
    {
        try 
        {
            con = ConnectionDB.getConnection();
            stm = con.createStatement();
            createEnumTypes();
            createUsersTable();
            createStocksTable();
            createHoldingsTable();
            createTransactionsTable();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            ConnectionDB.closeConnection();
        }
    }

    private static void executeQuery(String query) throws SQLException 
    {
        stm.executeUpdate(query);
    }

    private static void createEnumTypes() throws SQLException 
    {
        createEnumType("gender_enum", "'Male', 'Female'");
        createEnumType("status_enum", "'Buy', 'Sell'");
    }

    private static void createEnumType(String typeName, String values) throws SQLException 
    {
        if(!typeExists(typeName)) 
        {
            String createQuery = "CREATE TYPE " + typeName + " AS ENUM (" + values + ")";
            executeQuery(createQuery);
        }
    }

    private static boolean typeExists(String typeName) throws SQLException 
    {
        String checkQuery = "SELECT 1 FROM pg_type WHERE typname = '" + typeName + "'";
        try (ResultSet resultSet = stm.executeQuery(checkQuery)) 
        {
            return resultSet.next();
        }
    }

    private static void createUsersTable() throws SQLException 
    {
        String query = "CREATE TABLE IF NOT EXISTS Users (" +
                "userId SERIAL PRIMARY KEY," +
                "fName VARCHAR(50)," +
                "lName VARCHAR(50)," +
                "email VARCHAR(150)," +
                "password VARCHAR(50)," +
                "mobile_no BIGINT," +
                "dob DATE," +
                "gender gender_enum," +
                "aadhar_no BIGINT," +
                "pan_no VARCHAR(20)," +
                "demat_acc_no BIGINT," +
                "kyc BOOLEAN," +
                "amount DECIMAL (10, 2) NOT NULL" +
                ")";
        executeQuery(query);
    }

    private static void createStocksTable() throws SQLException 
    {
        String query = "CREATE TABLE IF NOT EXISTS Stocks (" +
                "stockId SERIAL PRIMARY KEY," +
                "stockName VARCHAR(20)," +
                "stockPrice DECIMAL (10, 2) NOT NULL" +
                ")";
        executeQuery(query);
    }

    private static void createHoldingsTable() throws SQLException 
    {
        String query = "CREATE TABLE IF NOT EXISTS Holdings (" +
                "holdingsId SERIAL PRIMARY KEY," +
                "userId INTEGER REFERENCES Users(userId)," +
                "stockId INTEGER REFERENCES Stocks(stockId)," +
                "amount DECIMAL (10, 2) NOT NULL," +
                "price DECIMAL (10, 2) NOT NULL," +
                "quality INTEGER NOT NULL" +
                ")";
        executeQuery(query);
    }

    private static void createTransactionsTable() throws SQLException 
    {
        String query = "CREATE TABLE IF NOT EXISTS Transactions (" +
                "id SERIAL PRIMARY KEY," +
                "userId INTEGER REFERENCES Users(userId)," +
                "stockId INTEGER REFERENCES Stocks(stockId)," +
                "action status_enum," +
                "amount DECIMAL (10, 2) NOT NULL," +
                "price DECIMAL (10, 2) NOT NULL," +
                "quality INTEGER NOT NULL," +
                "transaction_date DATE" +
                ")";
        executeQuery(query);
    }
}
