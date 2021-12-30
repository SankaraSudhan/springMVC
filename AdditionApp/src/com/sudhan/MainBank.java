package com.sudhan;

public class MainBank{
	public static void main(String[] args) {
		Customer obj= new Customer();
		obj.setaccountNumber(1247815688);
		obj.setuserName("Sudhan");
		obj.setcvv(123);
		
		System.out.println("Account number is: "+obj.getaccountNumber());
		System.out.println("Customer name is: "+obj.getuserName());
		System.out.println("Your cvv is: "+obj.getcvv());
	}
}

