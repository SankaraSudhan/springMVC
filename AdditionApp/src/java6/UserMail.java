package java6;

import java.lang.reflect.Array;
import java.util.Scanner;

public class UserMail {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first input: ");
	String input1 = sc.nextLine();
	System.out.println("Enter second input: ");
	String input2 = sc.nextLine();
	
	
	String[] arr1 = input1.split(",");
	System.out.println(arr1.length);
	String[] arr2 = input2.split(",");
	System.out.println(arr2.length);
	
	Mail obj1=new Mail(Long.parseLong(arr1[0]),arr1[1],arr1[2],
    		arr1[3],arr1[4],arr1[5],Double.parseDouble(arr1[6]));
    
    Mail obj2=new Mail(Long.parseLong(arr2[0]),arr2[1],arr2[2],
    		arr2[3],arr2[4],
    		arr2[5],Double.parseDouble(arr2[6]));
    System.out.println(obj1+"\n");
    System.out.println(obj2+"\n");
    
    if(obj1.getFrom().equalsIgnoreCase(obj2.getFrom())) {
    	System.out.println("Mail address is equal");
    }
    else {
    	System.out.println("Mail address is not equal");
    }
}
}
