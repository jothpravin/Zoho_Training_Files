import java.util.List;
import java.util.ArrayList;

public class Shop
{
	private String name;
	private String location;
	private List<Customer> customers;
	private List<Invoice> shopInvoices;
	public List<Item> items = new ArrayList<>();
	
	public Shop(String name, String location)
	{
		this.name = name;
		this.location = location;
		this.customers = new ArrayList<>();
		this.shopInvoices = new ArrayList<>();
		this.items = new ArrayList<>();
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getPlace()
	{
		return location;
	}
	
	public Item getItem(int a)
	{
		return items.get(a);
	}
	
	public void addCustomer(Customer customer)
	{
		customers.add(customer);
	}
	
	public void addInvocie(Invoice invoice)
	{
		shopInvoices.add(invoice);
	}
	
	public void addItems(Item item)
	{
		items.add(item);
	}
	
	public Customer getCustomer(int cusId)
	{
		for(Customer customer : customers)
		{
			if(customer.getCusId()==cusId)
			{
				return customer;
			}
		}
		return null;
	}
	
	public void listCustomers()
	{
		System.out.println("All Customers");
		int i=1;
		for(Customer customer : customers)
		{
			System.out.println((i++)+". "+customer.getName()+" - "+customer.getCusId());
		}
	}
	
	private List<Invoice> getCustomerInvoice(int cusId)
	{
		for(Customer customer : customers)
		{
			if(customer.getCusId()==cusId)
			{
				return customer.getCusInvoice();
			}
		}
		return null;
	}
	
	public void customerInvoices(int cusId)
	{
		List<Invoice> cusInvs = getCustomerInvoice(cusId);
		Customer c = getCustomer(cusId);
		if(cusInvs!=null)
		{
			System.out.println("-------------------"+c.getName()+"---Invoices----------------");
			System.out.println("Invoice NO.\tDate\t\tTotal Quantity\tTotal Amount");
			for(Invoice cusInv : cusInvs)
			{
				cusInv.printCusInvoice();
				System.out.println();
			}
			System.out.println();
			System.out.println("-----------------------------------------------");
		}
		else
		{
			System.out.println("Invalid Customer Id");
		}
	}
	
	public void listInvoices()
	{
		if(shopInvoices!=null)
		{
			System.out.println("-----------------All-Invoices------------------");
			System.out.println("Invoice NO.\tDate\t\tCustomer\tTotal Quantity\tTotal Amount");
			for(Invoice inv : shopInvoices)
			{
				inv.printInvoices();
				System.out.println();
			}
			System.out.println("-----------------------------------------------");
		}
		else
		{
			System.out.println("No Invoices is Available");
		}
	}
	
	public void printDetailedInvoice(int invNo)
	{
		Invoice invPrint = null;
		for(Invoice invoice : shopInvoices)
		{
			if(invoice.getInvId()==invNo)
			{
				invPrint = invoice;
				break;
			}
		}
		
		if(invPrint!=null)
		{
			invPrint.printDetailedInvoice();
		}
		else
		{
			System.out.println("Invalid Invoice number..");
		}
	}
	
	public void listItems()
	{
		int k=0;
		System.out.println("-----All-Price--List------");
		for(Item item : items)
		{
			System.out.println(++k +"-"+item.getName()+"-->"+item.getPrice());
		}
	}
	
	
	
}
