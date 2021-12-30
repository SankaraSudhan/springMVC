package com.sudhan;
import java.util.Scanner;

public class LeapYearEnter {
	public static void main(String[] args) {
		  //input
		  int year;
	      System.out.println("Enter an Year :: ");
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();

	      if(((year%4 == 0) && (year%100!= 0)) || (year%400 == 0))
	         System.out.println("Entered year is a leap year");
	      else
	         System.out.println("Entered year is not a leap year");
	}

}
