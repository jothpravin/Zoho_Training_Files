import java.util.Date;
import java.text.SimpleDateFormat;

class Campaign
{
	private String owner;
	private String campaignName;
	private String status;
	private Date lanuchDate;
	private Date fundraiserDeadline;
	private double fundraisingGoal;
	private double amountRaised;
	private String description;
	private String event;
	private String strlDate;
	private String strdDate;
	
	Campaign(String owner, String campaignName, Date lanuchDate, Date fundraiserDeadline, double fundraisingGoal, String description, String event)
	{
		this.owner = owner;
		this.campaignName = campaignName;
		this.status = "Not started";
		this.lanuchDate = lanuchDate;
		this.fundraiserDeadline = fundraiserDeadline;
		this.fundraisingGoal = fundraisingGoal;
		this.amountRaised = 0;
		this.description = description;
		this.event = event; 
		StringDate();
	}
	
	public void StringDate()
	{
		SimpleDateFormat sm = new SimpleDateFormat("dd-MMMM-yyyy");
		strlDate = sm.format(lanuchDate);
		strdDate = sm.format(fundraiserDeadline);
	}
	
	public String getCampaignName()
	{
		return campaignName;
	}
	
	public double getAmountRaised()
	{	
		return amountRaised;
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public Date getLanuchDate()
	{
		return lanuchDate;
	}
	
	public Date getFundraiserDeadline()
	{
		return fundraiserDeadline;
	}
	
	public double getFundraisingGoal()
	{
		return fundraisingGoal;
	}
	
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	public void addAmount(double amount)
	{
		amountRaised += amount;
	}
	
	public String toString()
	{
		return "CampaignName: "+campaignName+"\nOwner: "+owner+"\nstatus: "+status+"\nLanuchDate: "+strlDate+"\nFundraiserDeadline: "+strdDate+ "\nAmountRaised: "+amountRaised+ "\nFund Goal: "+fundraisingGoal+"\nDescription :"+description+"\nEvent: "+event;
	}
}
