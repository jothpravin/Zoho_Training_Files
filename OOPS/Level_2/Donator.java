import java.util.Date;
import java.text.SimpleDateFormat;

class Donator
{
	private String contributorName;
	private String campaign;
	private String paymentMethod;
	private String description;
	private String emailId;
	private double amount;
	private Date paymentDate; 
	private String strpDate;
	
	Donator(String contributorName, String campaign, String paymentMethod, String description, String emailId, double amount, Date paymentDate)
	{
		this.contributorName = contributorName;
		this.campaign = campaign;
		this.paymentMethod = paymentMethod;
		this.description = description;
		this.emailId = emailId;
		this.amount = amount;
		this.paymentDate = paymentDate;
		DateString();
	}
	
	public void DateString()
	{
		SimpleDateFormat s = new SimpleDateFormat("dd-MMMM-yyyy");
		strpDate = s.format(this.paymentDate);
	}
	
	public String getContributorName()
	{
		return contributorName;
	}
	
	public String getCampaign()
	{
		return campaign;
	}
	
	public Date getPaymentDate()
	{
		return paymentDate;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public String toString()
	{
		return "Contributor Name: "+ contributorName + "\nCampaign Name: "+campaign+"\nPayment Method: "+paymentMethod+ "\nDescription: " +description+ "\nEmailId :" +emailId+ "\nAmount: "+amount+" USD \nPayment Date: "+strpDate;
	}
}
