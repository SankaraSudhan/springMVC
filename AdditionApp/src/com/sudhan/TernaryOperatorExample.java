package com.sudhan;

public class TernaryOperatorExample {
	public static void main(String[] args) {
		
	//inputs
	int a=500;
	int b=600;
	int c=400;
	
	//Ternary operator logic: [variable =(condition)! True:False;]
	
	String maximum =(a>b)?(a>c)?"a":"c":(b>c)?"b":"c";
	System.out.println("Maximum number is: "+maximum);

}
}
