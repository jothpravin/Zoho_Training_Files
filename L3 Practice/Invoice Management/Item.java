public class Item
{
	private String iName;
	private int iPrice;
	private int nos;
	private double amount;
	
	public Item(String iName, int iPrice, int nos)
	{
		this.iName = iName;
		this.iPrice = iPrice;
		this.nos = nos;
		this.amount = nos*iPrice;
	}
	
	public String getName()
	{
		return iName;
	}
	
	public int getPrice()
	{
		return iPrice;
	}
	
	public int getNos()
	{
		return nos;
	}
	
	public double getAmount()
	{
		return amount;
	}
}
