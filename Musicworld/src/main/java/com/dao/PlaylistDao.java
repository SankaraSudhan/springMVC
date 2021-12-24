package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.connection.util.ConnectionUtil;

import Model.Library;
import Model.Playlist;
import Model.UserInfo;

public class PlaylistDao {
	public void insertPlaylist(Playlist playlist) throws ClassNotFoundException, SQLException {
		
		 //Playlist str = new Playlist( playlistTitle,playlistId, emailId, songTitle);
		Connection con = ConnectionUtil.getDBconnect();
		LibraryDao libDao=new LibraryDao();
		int songId=libDao.findSongId(playlist.getSong().getSongTitle());
		String query = " insert into playlist( song_id,playlist_title, email_id)values (?,?,?)";
		PreparedStatement stmt = con.prepareStatement(query);
		stmt.setInt(1, songId);
		stmt.setString(2, playlist.getPlaylistTitle());
		stmt.setString(3,playlist.getEmailId());
		
		
		//stmt.executeUpdate();
		System.out.println(stmt.executeUpdate()>0?"Playlist inserted successfully":"Playlist not updated");
	}
	public int findPlaylistId(String playListName)
	{
		String query="select id from playlist where playlist_Title='"+playListName+"'";
		int playlistId=0;
		try {
			Connection con=ConnectionUtil.getDBconnect();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			if(rs.next())
			{
				playlistId=rs.getInt(1);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return playlistId;	
	}
	
	//show playlist
	 public List<Playlist> showAllPlaylist() 
     {
	    List<Playlist> showPlaylist = new ArrayList<Playlist>();
     String query ="select * from playlist";
     Connection con=null;
     PreparedStatement stmt;
     try {
			con = ConnectionUtil.getDBconnect();
     	 stmt =con.prepareStatement(query);
			 ResultSet rs=stmt.executeQuery();
			 LibraryDao libDao=new LibraryDao();
			 while(rs.next())
			 {
				 Library song=libDao.findSong(rs.getInt(1));
				 Playlist  playList = new Playlist(song, rs.getString(3),rs.getString(4));
				 showPlaylist.add(playList);
			 }
			 
     }catch(SQLException e) {
     	
     	e.printStackTrace();
     } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return showPlaylist;
}
	 
	 //delete playlist
	 public void deletePlaylist(String playlistTitle, UserInfo user) throws ClassNotFoundException, SQLException {

			String delete = "delete from playlist where playlist_title=? and email_id=? ";

			Connection con = ConnectionUtil.getDBconnect();

			PreparedStatement stmt = con.prepareStatement(delete);
			stmt.setString(1, playlistTitle);
            stmt.setString(2, user.getEmailId());
			int res = stmt.executeUpdate();
			System.out.println(res + "is deleted");
			stmt.close();
			con.close();


	}
}

