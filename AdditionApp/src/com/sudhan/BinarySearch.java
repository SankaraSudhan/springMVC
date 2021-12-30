package com.sudhan;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {10,20,30,40,50,60,70,80,90};
		
		Scanner scan= new Scanner(System.in);
		
		int target=scan.nextInt();
		
		int mid=array.length/2;
		
		Arrays.sort(array);
		
		if (array[mid]==target) {
			System.out.println(mid);
	}
		else if(array[mid]<target) {
			for(int i=mid+1;i<array.length;i++) {
				if(array[i]==target) {
					System.out.println(i);
				}
			}
				}
			else {
				for(int i=0;i>mid-1;i++) {
					if(array[i]==target) {
						System.out.println(i);
					}
				
			}
		}

}}
