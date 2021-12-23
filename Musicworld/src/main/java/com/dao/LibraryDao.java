package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.connection.util.ConnectionUtil;

import Model.Library;
import Model.UserInfo;

public class LibraryDao {

	// Insert songs by admin
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

		stmt.executeUpdate();
		System.out.println("You're added successfully");
	}

	// Show song details
	public void showSongs(Library show) throws ClassNotFoundException, SQLException {
		String query = "select*from library";
		Connection con = ConnectionUtil.getDBconnect();
		PreparedStatement stmt = con.prepareStatement(query);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			System.out.println("\n" + rs.getInt(1) + "\n" + rs.getString(2) + "\n" + rs.getString(3) + "\n"
					+ rs.getString(4) + "\n" + rs.getString(5) + "\n" + rs.getString(6) + "\n" + rs.getString(7));
		}

	}
    
	//Update song details
	public void update(Library up) throws ClassNotFoundException, SQLException {

		String update = "update library set  song_title=?, artists=?,album=?, genre=?, language = ? where song_id = ?";

		Connection con = ConnectionUtil.getDBconnect();
		PreparedStatement stmt = con.prepareStatement(update);

		
		stmt.setString(1, up.getSongTitle());
		stmt.setString(2, up.getArtists());
		stmt.setString(3, up.getAlbum());
		stmt.setString(4, up.getGenre());
		stmt.setString(5, up.getLanguage());
		stmt.setInt(6, up.getSongId());
		
		// ResultSet result=stmt.executeQuery();
		int res = stmt.executeUpdate();

		System.out.println(res + " is updated !!");
	}

	// Delete song
	public void deleteSong(String songTitle) throws ClassNotFoundException, SQLException {

		String delete = "delete from library where song_title=?";

		Connection con = ConnectionUtil.getDBconnect();

		PreparedStatement stmt = con.prepareStatement(delete);
		stmt.setString(1, songTitle);

		int res = stmt.executeUpdate();
		System.out.println(res + "is deleted");
		stmt.close();
		con.close();
	}

	// list song details

	public List<Library> showAllSongs() {
		List<Library> songList = new ArrayList<Library>();
		String query = "select*from library";
		Connection con = null;
		PreparedStatement stmt;
		try {
			con = ConnectionUtil.getDBconnect();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Library library = new Library(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7));
				songList.add(library);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return songList;
	}
     
	//find song id
	public int findSongId(String name)
	{
		String query="select song_id from library where song_title='"+name+"'";
		int songId=0;
		try {
			Connection con=ConnectionUtil.getDBconnect();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			if(rs.next())
			{
				songId=rs.getInt(1);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return songId;	
	}
	
	//finding song title from song object
	public Library findSong(String name)
	{
		String query="select * from library where song_title='"+name+"'";
		//int songId=findSongId(name);
		Library song=null;
		try {
			Connection con=ConnectionUtil.getDBconnect();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			if(rs.next())
			{
				song=new Library(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return song;	
	}
	
	//finding song Id from song object
	public Library findSong(int songId)
	{
		String query="select * from library where song_id='"+songId+"'";
		//int songId=findSongId(name);
		Library song=null;
		try {
			Connection con=ConnectionUtil.getDBconnect();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			if(rs.next())
			{
				song=new Library(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return song;	
	}
	
//	public static int findTrainId(TrainModel trainModel) {
//	 	String findTrainIdQuery="select train_id from trains where train_number = "+trainModel.getTrainNumber();
//	 	Connection con = null;
//			try {
//				con = ConnectionUtil.getDBconnect();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	 	Statement stmt = null;
//	 	int trainId = 0;
//	 	try {
//				stmt = con.createStatement();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	 	try {
//				ResultSet rs=stmt.executeQuery(findTrainIdQuery);
//				if(rs.next()) {
//					//System.out.println(rs.getInt(1));
//					trainId = rs.getInt(1);
//					//System.out.println(trainId);
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			return trainId;

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

