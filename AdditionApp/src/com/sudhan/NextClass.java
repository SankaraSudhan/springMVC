package com.sudhan;
	
class StringMethod{
		//business logic in this class
		public static String getFullName(String firstName, String lastName) 
		{   
	        String fullName = firstName + " " + lastName;
	        return fullName;
		}
	}
		//creating another class
public class NextClass
{
		public static void main(String[] args){
			
		//inputs
		String firstName = "Sankara";
		String lastName = "Sudhan";
	
		String fullName = StringMethod.getFullName(firstName, lastName);
		System.out.println(" M."+fullName);
	}
}

	