package StockTradingSystem;

import java.util.List;
import java.util.Scanner;

public class TradingController 
{
    static Scanner in = new Scanner(System.in);
    private TradingDAO tradingDAO;
    public TradingController(TradingDAO tradingDAO)
    {
        this.tradingDAO = tradingDAO;
    }

    public void createTradingAccount()
    {
        System.out.print("Enter the Aadhar number :");
		Long aadharNumber = in.nextLong();
        while(!Validator.isValidAadhar(aadharNumber))
        {
            System.out.print("Enter the Aadhar number :");
		    aadharNumber = in.nextLong();
        }
		System.out.print("Enter the PAN card :");
		String pan = in.next();
        while(!Validator.isValidPan(pan))
        {
            System.out.print("Enter the PAN card :");
		    pan = in.next();
        }
		System.out.print("Enter the Inital deposit amount: ");
		Double amount = in.nextDouble();

        TradingAccount tradingAccount = new TradingAccount(UserDAO.USERID, aadharNumber, pan, amount);
        tradingDAO.createTradingAccount(tradingAccount);
    }

    private boolean checkTradingAccount()
    {
        return tradingDAO.isTradingAcount(UserDAO.USERID);
    }

    public void showStocks()
    {
        List<Stock> stocks = tradingDAO.getAllStocks();
        for(Stock stock: stocks)
        {
            System.out.println("===========================");
            System.out.println("Stock ID: "+stock.getStockId());
            System.out.println("Stock Name: "+stock.getStockName());
            System.out.println("Stock Price: "+stock.getPrice());
        }
        System.out.println("===========================");   
    }

    public void buyStock()
    {
        if(checkTradingAccount())
        {
            showStocks();
            System.out.print("Enter the stock id to buy: ");
            int stockid = in.nextInt();
            System.out.print("Enter the stock quantity: ");
            int quantity = in.nextInt();


        }
    }

    private int getAmount()
    {
        return -1;
    }

    public void setTransaction()
    {

    }


}
