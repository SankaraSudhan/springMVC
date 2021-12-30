package com.sudhan;
import java.util.Scanner;
public class SecondLargestAndSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   //inputs
		    int n, temp;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size of an array:");
	        n = sc.nextInt();
	        int arr[] = new int[n];
	        System.out.println("Enter the numbers: ");
	        for(int i=0;i<n;i++) 
	        {
	           arr[i] = sc.nextInt();
	        }
	        for(int i=0;i<n;i++) 
	        {
	            for(int j=i+1;j<n;j++) 
	            {
	                if(arr[i]>arr[j]) 
	                {
	                   temp = arr[i];
	                   arr[i] = arr[j];
	                   arr[j] = temp;
	                }
	            }
	        }
	        System.out.println("Second Largest number: "+arr[n-2]);
	        System.out.println("Smallest number: "+arr[0]);
	        System.out.println("product of the second largest & smallest numbers: "+(arr[n-2]*arr[0]));
	    }

	}


