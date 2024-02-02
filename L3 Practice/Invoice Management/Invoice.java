import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Invoice
{
	private int invId;
	private Customer customer;
	private List<Item> invItems;
	private Date currentDate;
	private int total;
	private Shop shop;
	private double grandTotal;
	private double tax;
	private static int idCount=87001;
	
	SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	SimpleDateFormat formater1 = new SimpleDateFormat("dd/MM/yyyy");
	
	public Invoice(Shop shop, Customer customer, List<Item> invItems)
	{
		this.customer = customer;
		this.invItems = invItems;
		this.currentDate = new Date();
		this.shop = shop;
		this.invId = idCount++;
      	calTotal();
      	calTax();
	}
	
	public int getInvId()
	{
		return invId;
	}
	
	public Customer getCustomerIn()
	{
		return customer;
	}
	
	private void calTotal()
	{
		for(Item item: invItems)
		{
			total+=(int)item.getAmount();
		}
	}
	
	private void calTax()
	{	
		tax = total*0.05;
		grandTotal = total +tax;
	}
	
	public void printCusInvoice()
	{
		System.out.print("|"+invId+"\t\t"+formater1.format(currentDate)+"\t"+invItems.size()+"\t\t| "+total+" |");
	}
	
	public void printInvoices()
	{
		System.out.print("|"+invId+"\t\t"+formater1.format(currentDate)+"\t"+customer.getName()+"\t\t"+invItems.size()+"\t\t| "+total+" |");
	}
	
	public void printDetailedInvoice()
	{
      	System.out.println("\n\n-------------------------------------------------------------------------------------------------------------------");
      	System.out.println("                                            INVOICE");
      	System.out.println(shop.getName()+"										Invoice No: "+invId);
      	System.out.println(shop.getPlace()+"										Date: "+formater.format(currentDate));
      	System.out.println("Customer Details :");
      	System.out.println("	"+customer.getName()+"	"+customer.getMobile());
      	System.out.println("S.no\t Item Name\t Price\t Qty\t Amount");
      	System.out.println("---------------------------------------------------");
      	int n1=1;
      	for(Item item : invItems)
      	{
      		System.out.println(n1++ +" \t "+ item.getName() +"\t\t "+ item.getPrice() +" \t "+ item.getNos() +" \t " + item.getAmount());
      	}
      	System.out.println("---------------------------------------------------");
      	System.out.println("						        Total: "+total);
      	System.out.println("	  			    			Tax(%5): "+tax);
      	System.out.println("			      		  Grand Total: "+grandTotal);
      	System.out.println("\n\n-------------------------------------------------------------------------------------------------------------------");
      	
      	
	}
}
