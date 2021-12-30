package java6;

import java.util.*;



public class Sample {
	public static void main(String[] args) 
	{
		System.out.println("Enter the values: ");
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		ConstructorSample obj = new ConstructorSample(num1, num2);
		System.out.println(obj.addelement());
		int returnvalue = obj.addelement();
		System.out.println(returnvalue);
		
		
		
	}

}
