package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.connection.util.ConnectionUtil;

import Model.Library;
import Model.UserInfo;

public class LibraryDao {

	public void insertLibrary() throws ClassNotFoundException, SQLException {
		
		SimpleDateFormat spdt = new SimpleDateFormat("dd-MM-yyyy");
		
		boolean flagCheck =false;
		Integer songId =0;
		String songTitle;
		String userName;
		String artists;
		String album;
		String genre;
		String language;
		String releaseDate;
        
		Scanner sc = new Scanner(System.in);

		do {
		System.out.println("Enter song id: ");
		
	    String	songId1  = sc.nextLine();
		if (songId1.matches("[0-9] {2}")&&songId1!="")
		{
		songId = Integer.parseInt(songId1);
		flagCheck=false;
		}
		else
		{
		System.out.println("its invalid!!");
		flagCheck=true;
		}
		}while(flagCheck);

		do {
		System.out.println("Enter songTitle: ");
		songTitle = sc.nextLine();
		if (songTitle.matches("[a-zA-Z]+")&&songTitle!="")
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
		System.out.println("Enter userName: ");
		    userName = sc.nextLine();
		if (userName.matches("[a-z]+")&&userName!="")
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
		System.out.println("Enter artists: ");
		artists = sc.nextLine();
		if (artists.matches("[a-zA-Z]+")&&artists!="")
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
			if (album.matches("[a-zA-Z]+")&&album!="")
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
			System.out.println("Enter genre: ");
			genre = sc.nextLine();
			if (genre.matches("[a-zA-Z]+")&&genre!="")
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
			System.out.println("Enter language: ");
			language = sc.nextLine();
			if (language.matches("[a-zA-Z]+")&&language!="")
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
		   System.out.println("Enter releaseDate: ");
		   Date check=spdt.parse(sc.nextLine());
		   if (check.matches("[0-9]{2}[-][0-9]{2}[-][0-9]{4}+")&&check!="")
		   {
		   flagCheck=false;
		   
		   break;
		   }
		   else
		   {
		   System.out.println("its invalid");
		   flagCheck=true;
		}

		} while(flagCheck);
		

		
		Library str = new Library(songId, songTitle, userName, artists, album, genre, language, releaseDate);
		Connection con = ConnectionUtil.getDBconnect();
		String query = " insert into library( song_id,  song_title, user_name, artists, album, genre, language, release_date)values (?,?,?,?,?,?,?,?)";

		PreparedStatement stmt = con.prepareStatement(query);

		stmt.setInt(1, str.getSongId());
		stmt.setString(2, str.getSongTitle());
		stmt.setString(3, str.getUserName());
		stmt.setString(4, str.getArtists());
		stmt.setString(5, str.getAlbum());
		stmt.setString(6, str.getGenre());
		stmt.setString(7, str.getLanguage());
		stmt.setDate(8, new java.sql.Date(releaseDate.getTime()));

		stmt.executeUpdate();
		System.out.println("You're inserted successfully");
	}

}
