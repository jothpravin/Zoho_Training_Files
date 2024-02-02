import java.util.List;
import java.util.ArrayList;

public class Customer
{
	private int cusId;
	private String cusName;
	private long mobileNo;
	private static int idCount=3701;
	private List<Invoice> cusInvoices;
	
	public Customer(String cusName, long mobileNo)
	{
		this.cusName = cusName;
		this.mobileNo = mobileNo;
		this.cusInvoices = new ArrayList<>();
		this.cusId = idCount++;
	}
	
	public void addCusInvoice(Invoice invoice)
	{
		cusInvoices.add(invoice);
	}
	
	public String getName()
	{
		return cusName;
	}
	
	public long getMobile()
	{
		return mobileNo;
	}
	
	public int getCusId()
	{
		return cusId;
	}
	
	public List<Invoice> getCusInvoice()
	{
		return cusInvoices;
	}	
	
	
}
