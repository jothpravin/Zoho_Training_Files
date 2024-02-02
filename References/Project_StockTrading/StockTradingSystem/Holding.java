package StockTradingSystem;

public class Holding 
{
    private int holdId;
    private int taId;
    private int stockId;
    private double price;
    private int quantity;
    private double amount;

    public Holding(int taId, int stockId, double price, int quantity, double amount) 
    {
        this.holdId = 0;
        this.taId = taId;
        this.stockId = stockId;
        this.price = price;
        this.quantity = quantity;
        this.amount = amount;
    }

    public void setHoldId(int holdId) 
    {
        this.holdId = holdId;
    }

    public int getHoldId() 
    {
        return holdId;
    }

    public int getTaId() 
    {
        return taId;
    }

    public int getStockId() 
    {
        return stockId;
    }

    public double getPrice() 
    {
        return price;
    }

    public int getQuantity() 
    {
        return quantity;
    }

    public double getAmount() 
    {
        return amount;
    }
    
}
