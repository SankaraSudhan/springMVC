package Model;

import java.util.Objects;

public class Playlist {
	private int playlistId;
	private String playlistTitle;
	private String album;
	private String favourites;
	
	public int getPlaylistId() {
		return playlistId;
	}
	public void setPlaylistId(int playlistId) {
		this.playlistId = playlistId;
	}
	public String getPlaylistTitle() {
		return playlistTitle;
	}
	public void setPlaylistTitle(String playlistTitle) {
		this.playlistTitle = playlistTitle;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getFavourites() {
		return favourites;
	}
	public void setFavourites(String favourites) {
		this.favourites = favourites;
	}
	
	@Override
	public String toString() {
		return "Playlist [playlistId=" + playlistId + ", playlistTitle=" + playlistTitle + ", album=" + album
				+ ", favourites=" + favourites + "]";
	}
	public Playlist(int playlistId, String playlistTitle, String album, String favourites) {
		super();
		this.playlistId = playlistId;
		this.playlistTitle = playlistTitle;
		this.album = album;
		this.favourites = favourites;
	}
	public Playlist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

