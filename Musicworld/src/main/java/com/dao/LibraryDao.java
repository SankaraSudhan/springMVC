package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.connection.util.ConnectionUtil;

import Model.Library;

public class LibraryDao {

	public void insertLibrary(Library str3) throws ClassNotFoundException, SQLException {
		
		
		Connection con = ConnectionUtil.getDBconnect();
		String query = " insert into library( song_id,  song_title, user_name, artists, album, genre, language)values (?,?,?,?,?,?,?)";

		PreparedStatement stmt = con.prepareStatement(query);

		stmt.setInt(1, str3.getSongId());
		stmt.setString(2, str3.getSongTitle());
		stmt.setString(3, str3.getUserName());
		stmt.setString(4, str3.getArtists());
		stmt.setString(5, str3.getAlbum());
		stmt.setString(6, str3.getGenre());
		stmt.setString(7, str3.getLanguage());
		//stmt.setDate(8, new java.sql.Date(releaseDate.getTime()));

		stmt.executeUpdate();
		System.out.println("You're added successfully");
	}

}
