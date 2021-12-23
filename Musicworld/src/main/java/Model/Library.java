package Model;

import java.util.Date;
import java.util.Objects;

public class Library {
	 private int songId;
	 private String songTitle;
	 private String userName;
	 private String artists;
	 private String album;
	 private String genre;
	 private String language;

	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getSongTitle() {
		return songTitle;
	}
	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getArtists() {
		return artists;
	}
	public void setArtists(String artists) {
		this.artists = artists;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	@Override
	public String toString() {
		return "\nsongId=" + songId + ", songTitle=" + songTitle + ", userName=" + userName + ", artists="
				+ artists + ", album=" + album + ", genre=" + genre + ", language=" + language + "\n";
	}
	public Library(int songId, String songTitle, String userName, String artists, String album, String genre,
			String language) {
		super();
		this.songId = songId;
		this.songTitle = songTitle;
		this.userName = userName;
		this.artists = artists;
		this.album = album;
		this.genre = genre;
		this.language = language;
		
	}
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
