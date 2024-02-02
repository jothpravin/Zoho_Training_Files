package StockTradingSystem;

import java.util.Date;

public class Transaction 
{
    private int transactionId;
    private int ta_id;
    private int userId;
    private int stockId;
    private Action action;
    private double price;
    private int quantity;
    private Date transDate;

    public Transaction(int ta_id, int userId, int stockId, Action action, double price, int quantity, Date transDate) 
    {
        this.transactionId = 0;
        this.ta_id = ta_id;
        this.userId = userId;
        this.stockId = stockId;
        this.action = action;
        this.price = price;
        this.quantity = quantity;
        this.transDate = transDate;
    }

    public void setTransactionId(int transactionId) 
    {
        this.transactionId = transactionId;
    }

    public int getTransactionId() 
    {
        return transactionId;
    }

    public int getTa_id() 
    {
        return ta_id;
    }

    public int getUserId() 
    {
        return userId;
    }

    public int getStockId() 
    {
        return stockId;
    }

    public Action getAction() 
    {
        return action;
    }

    public double getPrice() 
    {
        return price;
    }

    public int getQuantity() 
    {
        return quantity;
    }

    public Date getTransDate() 
    {
        return transDate;
    }
        
}

enum Action
{
    Buy,
    Sell
}