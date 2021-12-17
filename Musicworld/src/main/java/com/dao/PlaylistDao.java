package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

import com.connection.util.ConnectionUtil;

import Model.Playlist;

public class PlaylistDao {
	public void insertPlaylistDao() throws ClassNotFoundException, SQLException {
			
		boolean flagCheck =false;
	    Integer playlistId =0 ;
	    String playlistTitle;
	    String album;
	    String favourites;
        
		Scanner sc = new Scanner(System.in);

		do {
		System.out.println("Enter playlistId: ");
		
	    String	playlistId1 = sc.nextLine();
		if (playlistId1.matches("[0-9] {2}")&&playlistId1!="")
		{
			playlistId = Integer.parseInt(playlistId1);
		flagCheck=false;
		}
		else
		{
		System.out.println("its invalid!!");
		flagCheck=true;
		}
		}while(flagCheck);

		do {
		System.out.println("Enter playlistTitle: ");
		playlistTitle = sc.nextLine();
		if (playlistTitle.matches("[a-zA-Z]+")&&playlistTitle!="")
		{
		flagCheck=false;
		}
		else
		{
		System.out.println("its invalid!!");
		flagCheck=true;
		}
		}while(flagCheck);

		
		do {
		System.out.println("Enter album: ");
		    album = sc.nextLine();
		if (album.matches("[a-z]+")&&album!="")
		{
		flagCheck=false;
		}
		else
		{
		System.out.println("its invalid!!");
		flagCheck=true;
		}
		}while(flagCheck);

		
		do {
		System.out.println("Enter favourites: ");
		favourites = sc.nextLine();
		if (favourites.matches("[a-zA-Z]+")&&favourites!="")
		{
		flagCheck=false;
		}
		else
		{
		System.out.println("its invalid!!");
		flagCheck=true;
		}
		}while(flagCheck);

		
		
		 Playlist str = new Playlist(playlistId, playlistTitle, album, favourites);
		Connection con = ConnectionUtil.getDBconnect();
		String query = " insert into playlist( playlist_id,  playlist_title, album, favourites)values (?,?,?,?)";

		PreparedStatement stmt = con.prepareStatement(query);

		stmt.setInt(1, str.getPlaylistId());
		stmt.setString(2, str.getPlaylistTitle());
		stmt.setString(3, str.getAlbum());
		stmt.setString(4, str.getFavourites());
		
		

		stmt.executeUpdate();
		System.out.println("Playlist inserted successfully");
	}



	}

