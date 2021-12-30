package com.sudhan;

public class Factorial {
	public static void main(String[] args) {
		
		int i;
		int factorial=1;
		int value=9;
		
		for(i=1;i<=value;i++) {
			factorial=factorial*i;
		}
		System.out.println("The factorial of  " + value + "  is: "+factorial);
	}

}
