package com.sudhan;

import java.util.Scanner;

public class AddDiagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//getting user inputs for matrices
		System.out.println("Enter the values: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		//to find totals of both diagonals
		int total1=0;
		int total2=0;
		
		int[][] matrix = new int[n][m];
		 for(int i=0;i<n;i++) {
			 for(int j=0;j<m;j++) {
				 matrix [i][j] = scan.nextInt();
				 
			 }
		 }
		 
		 for(int i=0;i<n;i++) 
		 {
			 for(int j=0;j<m;j++) 
			 {
				 if(i==j) 
				 {
					 total1 = matrix[i][j]+total1;
				 }
			 }
		 }
		 for(int i1=0;i1<n;i1++) 
		 {
			 for(int j=0;j<m;j++) 
			 {
					if(i1==(n-j-1)) 
					{
						total2 = matrix[i1][j]+total2;
					}
				 }
		
	}
         int avg = total1-total2;
         
         System.out.println(avg);
         
   }
}

	
