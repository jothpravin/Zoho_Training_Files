import java.util.Date;

class ChatMessage
{
	private long chatID;
	private long senderID;
	private long receiverID;
	private String content;
	private Date timeStamp;
	
	public ChatMessage(long senderID, long receiverID, String content, Date timeStamp)
	{
		this.chatID = 0;
		this.receiverID = receiverID;
		this.senderID = senderID;
		this.content = content;
		this.timeStamp = timeStamp;
	}
	
	public long getChatID()
	{
		return chatID;
	}
	
	public void setChatID(long chatID)
	{
		this.chatID = chatID;
	}
	
	public long getSenderID()
	{
		return senderID;
	}
	
	public long getRecieverID()
	{
		return receiverID;
	}
	
	public String getContent()
	{
		return content;
	}
	
	public Date getTimeStamp()
	{
		return timeStamp;
	}
	
}

