package com.sudhan;
import java.util.Scanner;
public class Boat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//getting user inputs
		System.out.println("Enter the values for Boat speed,Water speed,Time taken: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		//to calculate distance
		int distance = c/(a+b);
		
		System.out.println("Time taken to reach the given distance is: "+distance);
	}

}
