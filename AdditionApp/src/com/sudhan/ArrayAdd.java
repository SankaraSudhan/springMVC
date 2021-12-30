package com.sudhan;

import java.util.Scanner;

class AddInt{
	
 public static int Add(double arr1[] ,double arr2[]) {
	 
	 double sum1 = 0.0;
	 double sum2 = 0.0;
	 for(int i = 0;i<arr1.length;i++) 
		{
			sum1 = arr1[i]+sum1;
		}
		
		for(int j= 0; j<arr2.length;j++)
		{
			sum2 = arr2[j]+sum2;
		}
		int total = (int) (sum1+sum2);
		
	return total;
	 
   }
	 	 
}

public class ArrayAdd {
	public static void main(String[] args) {
		AddInt obj = new AddInt();	
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size");
		
		int input = (int)scan.nextDouble();
		double arr1[] = new double[input];
		double arr2[] = new double[input];
		
		for(int i = 0;i<arr1.length;i++) 
		{
			arr1[i] = scan.nextDouble();
		}
		
		for(int j= 0; j<arr2.length;j++)
		{
			arr2[j] = scan.nextDouble();
			
		}
		
		int total = obj.Add(arr1, arr2);
		System.out.println(total);
		
		
	}

}
