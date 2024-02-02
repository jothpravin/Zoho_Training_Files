package StockTradingSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TradingDAO 
{
    static int TradingAccountID;
    Connection con = ConnectionDB.getConnection();

    public List<Stock> getAllStocks()
    {
        List<Stock> stocks = new ArrayList<>();
        String query = "SELECT * FROM stocks";
        try(PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery()) 
        {
            while(rs.next())
            {
                Stock stock = new Stock(rs.getString("stockname"), rs.getDouble("stockprice"));
                stock.setStockId(rs.getInt("stockid"));
                stocks.add(stock);
            }
            return stocks;
        } 
        catch(SQLException e) 
        {
            e.printStackTrace();
        }
        return null;
    }

    public boolean isTradingAcount(int userid)
    {
        String query = "SELECT * FROM tradingaccount WHERE userid = ?";
        try(PreparedStatement ps = con.prepareStatement(query))
        {
            ps.setInt(1, userid);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                return true;
            }
        } 
        catch(SQLException e) 
        {
            e.printStackTrace();
        }
        return false;
    }

    public void createTradingAccount(TradingAccount tradingAccount)
    {
        String query = "INSERT INTO tradingaccount (aadhar_no, pan_no, demat_acc_no, amount) VALUES (?, ?, ?, ?)";
        try(PreparedStatement ps = con.prepareStatement(query))
        {
            ps.setLong(1, tradingAccount.getAadhar_no());
            ps.setString(2, tradingAccount.getPan_no());
            ps.setLong(3, tradingAccount.getDemat_acc_no());
            ps.setDouble(4, tradingAccount.getAmount());
            int row = ps.executeUpdate();
            if(row > 0)
            {
                System.out.println("Successfully trading account created..!!");
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

    public Double getAmount()
    {
        String query = "SELECT amount from tradingaccount WHERE ta_id = ?.";
        try(PreparedStatement ps = con.prepareStatement(query))
        {

        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return -1.0;
    }
}
