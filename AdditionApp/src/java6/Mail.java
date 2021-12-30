package java6;

public class Mail {
	 
	private long id;
	private String to;
	private String from;
	private String subject;
	private String content;
	private String receivedDate;
	private double DateTime;
	
	public Mail(long id, String to, String from, String subject, String content, String receivedDate, double dateTime) {
		super();
		this.id = id;
		this.to = to;
		this.from = from;
		this.subject = subject;
		this.content = content;
		this.receivedDate = receivedDate;
		DateTime = dateTime;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	@Override
	public String toString() {
		return "Mail [id=" + id + ", to=" + to + ", from=" + from + ", subject=" + subject + ", content=" + content
				+ ", receivedDate=" + receivedDate + ", DateTime=" + DateTime + "]";
	}

	

	
	
	
	

}
