package com.musicworld.testmain;

import java.util.*;
import java.sql.*;

import com.connection.util.ConnectionUtil;
import com.dao.LibraryDao;
import com.dao.LoginDao;
import com.dao.UserInfoDao;

import Model.Library;
import Model.UserInfo;

public class MusicWorldTestMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		UserInfoDao obj = new UserInfoDao();

		Scanner sc = new Scanner(System.in);
		boolean flagCheck = false;
		int select;
		long checkUser = 0;
		System.out.println(
				"'Welcome to MusicWorld' \n  Select your option: \n  1)Register/Signup \t  2)Login/Signin \t  3)Delete User \t 4)Update User \t 5)Show user ");
		select = Integer.parseInt(sc.nextLine());

		switch (select) {

		case 1:

			String firstName;
			String lastName;
			String email_id;
			String userName;
			String password;
			String role;
			long mobileNumber = 0;

			do {
				System.out.println("Enter your firstName: ");
				firstName = sc.nextLine();
				if (firstName.matches("[a-zA-Z]+") && firstName != "") {
					// System.out.println("Your firstName is valid");
					flagCheck = false;
				} else {
					System.out.println("its invalid!!");
					flagCheck = true;
				}
			} while (flagCheck);

			do {
				System.out.println("Enter your lastName: ");
				lastName = sc.nextLine();
				if (lastName.matches("[a-zA-Z]+") && lastName != "") {
					// System.out.println("Your lastName is valid: ");
					flagCheck = false;
				} else {
					System.out.println("its invalid!!");
					flagCheck = true;
				}
			} while (flagCheck);

			do {
				System.out.println("Enter your email id: ");
				email_id = sc.nextLine();
				if (email_id.matches("[a-z0-9]+[@][a-z]+[.][a-z]+") && email_id != "") {
					// System.out.println("Your emailId is valid");
					flagCheck = false;
				} else {
					System.out.println("its invalid!!");
					flagCheck = true;
				}
			} while (flagCheck);

			do {
				System.out.println("Enter your userName: ");
				userName = sc.nextLine();
				if (userName.matches("[a-z]+") && userName != "") {
					// System.out.println("Your userName is valid");
					flagCheck = false;
				} else {
					System.out.println("its invalid!!");
					flagCheck = true;
				}
			} while (flagCheck);

			do {
				System.out.println("Enter your password: ");
				password = sc.nextLine();
				if (password.matches("[a-zA-Z0-9@#]+") && password != "") {
					// System.out.println("Your password is valid");
					flagCheck = false;
				} else {
					System.out.println("its invalid!!");
					flagCheck = true;
				}
			} while (flagCheck);

			do {
				System.out.println("Enter Your Role: ");
				role = sc.nextLine();
				if (role.matches("[a-zA-Z]+") && role != "") {
					// System.out.println("Your role is valid");
					flagCheck = false;
				} else {
					System.out.println("its invalid!!");
					flagCheck = true;
				}
			} while (flagCheck);

			do {
				System.out.println("Enter your mobileNumber: ");
				String check = sc.nextLine();
				if (check.matches("[0-9]{10}") && check != "") {
					// System.out.println("Your mobileNumber is valid");
					flagCheck = false;
					mobileNumber = Long.parseLong(check);
					break;
				} else {
					System.out.println("its invalid");
					flagCheck = true;
				}

			} while (flagCheck);

			UserInfo str = new UserInfo(firstName, lastName, email_id, userName, password, role, mobileNumber);
			UserInfoDao obj2 = new UserInfoDao();
			obj2.insertUser(str);
			break;

		case 2:

			System.out.println("Enter your userName: ");
			String username = sc.nextLine();

			System.out.println("Enter your password: ");
			String passname = sc.nextLine();

			UserInfo str2 = new UserInfo();

			str2.setUserName(username);

			str2.setPassword(passname);

			Connection con = ConnectionUtil.getDBconnect();

			LoginDao obj1 = new LoginDao();
			checkUser = obj1.login(str2);
			break;

		case 3:
			System.out.println("Enter the User_name to delete ");
			String userName1 = sc.nextLine();
			obj.delete(userName1);
			break;

		case 4:

			System.out.println("Enter to update user details");
			String firstName1;
			String lastName1;
			String email_id1;
			String userName11;
			String password1;
			String role1;
			long mobileNumber1 = 0;

			do {
				System.out.println("Enter your firstName: ");
				firstName1 = sc.nextLine();
				if (firstName1.matches("[a-zA-Z]+") && firstName1 != "") {
					// System.out.println("Your firstName is valid");
					flagCheck = false;
				} else {
					System.out.println("its invalid!!");
					flagCheck = true;
				}
			} while (flagCheck);

			do {
				System.out.println("Enter your lastName: ");
				lastName1 = sc.nextLine();
				if (lastName1.matches("[a-zA-Z]+") && lastName1 != "") {
					// System.out.println("Your lastName is valid: ");
					flagCheck = false;
				} else {
					System.out.println("its invalid!!");
					flagCheck = true;
				}
			} while (flagCheck);

			do {
				System.out.println("Enter your email id: ");
				email_id1 = sc.nextLine();
				if (email_id1.matches("[a-z0-9]+[@][a-z]+[.][a-z]+") && email_id1 != "") {
					// System.out.println("Your emailId is valid");
					flagCheck = false;
				} else {
					System.out.println("its invalid!!");
					flagCheck = true;
				}
			} while (flagCheck);

			do {
				System.out.println("Enter your userName: ");
				userName11 = sc.nextLine();
				if (userName11.matches("[a-z]+") && userName11 != "") {
					// System.out.println("Your userName is valid");
					flagCheck = false;
				} else {
					System.out.println("its invalid!!");
					flagCheck = true;
				}
			} while (flagCheck);

			do {
				System.out.println("Enter your password: ");
				password1 = sc.nextLine();
				if (password1.matches("[a-zA-Z0-9@#]+") && password1 != "") {
					// System.out.println("Your password is valid");
					flagCheck = false;
				} else {
					System.out.println("its invalid!!");
					flagCheck = true;
				}
			} while (flagCheck);

			do {
				System.out.println("Enter Your Role: ");
				role1 = sc.nextLine();
				if (role1.matches("[a-zA-Z]+") && role1 != "") {
					// System.out.println("Your role is valid");
					flagCheck = false;
				} else {
					System.out.println("its invalid!!");
					flagCheck = true;
				}
			} while (flagCheck);

			do {
				System.out.println("Enter your mobileNumber: ");
				String check = sc.nextLine();
				if (check.matches("[0-9]{10}") && check != "") {
					// System.out.println("Your mobileNumber is valid");
					flagCheck = false;
					mobileNumber1 = Long.parseLong(check);
					break;
				} else {
					System.out.println("its invalid");
					flagCheck = true;
				}

			} while (flagCheck);

			UserInfo str1 = new UserInfo(firstName1, lastName1, email_id1, userName11, password1, role1, mobileNumber1);
			UserInfoDao obj21 = new UserInfoDao();
			obj21.update(str1);
			break;

		case 5:
			System.out.println("Show all users");
			UserInfo show = new UserInfo();
			obj.showUsers(show);
			break;

		default:
			System.out.println("Please enter the valid details!!!");
			break;
		}

		   
		// Admin operations 

		System.out.println(checkUser);
		if (checkUser == 9344774428l) {
			System.out.println(
					"'Admin operations' \n  Select your option: \n  1)show songs \t   2)delete songs \t 3)add songs ");
			select = Integer.parseInt(sc.nextLine());

			switch (select) {
			case 1:
				System.out.println("Show all song details");
				Library show = new Library();
				LibraryDao lib = new LibraryDao();
				lib.showSongs(show);
				break;

			case 2:
				System.out.println("Enter song title to Delete here: ");
				String songTitle1 = sc.nextLine();
				LibraryDao lib3 = new LibraryDao();
				lib3.deleteSong(songTitle1);
				break;

			case 3:
				System.out.println("Enter song details to add here: ");

				Integer songId = 0;
				String songTitle;
				String userName;
				String artists;
				String album;
				String genre;
				String language;

				do {
					System.out.println("Enter song id: ");

					String songId1 = sc.nextLine();
					System.out.println(songId1);
					if (songId1.matches("[0-9]{1}") && songId1 != "" && songId1 != " ") {
						songId = Integer.parseInt(songId1);
						flagCheck = false;
					} else {
						System.out.println("its invalid!!");
						flagCheck = true;
					}
				} while (flagCheck);

				do {
					System.out.println("Enter songTitle: ");
					songTitle = sc.nextLine();
					if (songTitle.matches("[a-zA-Z_]+") && songTitle != "") {
						flagCheck = false;
					} else {
						System.out.println("its invalid!!");
						flagCheck = true;
					}
				} while (flagCheck);

				do {
					System.out.println("Enter userName: ");
					userName = sc.nextLine();
					if (userName.matches("[a-z]+") && userName != "") {
						flagCheck = false;
					} else {
						System.out.println("its invalid!!");
						flagCheck = true;
					}
				} while (flagCheck);

				do {
					System.out.println("Enter artists: ");
					artists = sc.nextLine();
					if (artists.matches("[a-zA-Z]+") && artists != "") {
						flagCheck = false;
					} else {
						System.out.println("its invalid!!");
						flagCheck = true;
					}
				} while (flagCheck);

				do {
					System.out.println("Enter album: ");
					album = sc.nextLine();
					if (album.matches("[a-zA-Z_]+") && album != "") {
						flagCheck = false;
					} else {
						System.out.println("its invalid!!");
						flagCheck = true;
					}
				} while (flagCheck);

				do {
					System.out.println("Enter genre: ");
					genre = sc.nextLine();
					if (genre.matches("[a-zA-Z]+") && genre != "") {
						flagCheck = false;
					} else {
						System.out.println("its invalid!!");
						flagCheck = true;
					}
				} while (flagCheck);

				do {
					System.out.println("Enter language: ");
					language = sc.nextLine();
					if (language.matches("[a-zA-Z]+") && language != "") {
						flagCheck = false;
					} else {
						System.out.println("its invalid!!");
						flagCheck = true;
					}
				} while (flagCheck);

				Library str3 = new Library(songId, songTitle, userName, artists, album, genre, language);
				LibraryDao lib1 = new LibraryDao();
				lib1.insertLibrary(str3);
				break;
			default:
				System.out.println("Please enter the valid details!!!");
			}

		}
	}

}
