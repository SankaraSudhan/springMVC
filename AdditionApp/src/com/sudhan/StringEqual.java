package com.sudhan;
import java.util.Scanner;

public class StringEqual {
	public static void main(String[] args) {
		
		 String str1, str2;
		    // User two input strings
	        Scanner scanner = new Scanner(System.in);
	 
	        System.out.println("Enter first String");
	        str1 = scanner.nextLine();
	 
	        System.out.println("Enter second String");
	        str2 = scanner.nextLine();
	        
	        // Comparing two input string
	        if (str1.equals(str2))
	            System.out.print("Equal Strings");
	        else
	            System.out.print("UnEqual Strings");
	   
	}

}
