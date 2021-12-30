import java.time.format.DateTimeFormatter;

public class Song {
	private String name;
	private String artist;
	private String songType;
	private DateTimeFormatter dateDownloaded;
	private double rating;
	private int noOfDownloads;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getSongType() {
		return songType;
	}
	public void setSongType(String songType) {
		this.songType = songType;
	}
	public DateTimeFormatter getDateDownloaded() {
		return dateDownloaded;
	}
	public void setDateDownloaded(DateTimeFormatter dateDownloaded) {
		this.dateDownloaded = dateDownloaded;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getNoOfDownloads() {
		return noOfDownloads;
	}
	public void setNoOfDownloads(int noOfDownloads) {
		this.noOfDownloads = noOfDownloads;
	}
	public Song(String name, String artist, String songType, DateTimeFormatter dateDownloaded, double rating,
			int noOfDownloads) {
		super();
		this.name = name;
		this.artist = artist;
		this.songType = songType;
		this.dateDownloaded = dateDownloaded;
		this.rating = rating;
		this.noOfDownloads = noOfDownloads;
	}
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
