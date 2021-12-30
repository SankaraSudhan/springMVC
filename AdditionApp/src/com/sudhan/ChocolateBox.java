package com.sudhan;
import java.util.Scanner;

public class ChocolateBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       
		        //getting user inputs to create matrices
				 System.out.println("Enter the Rows and Coloums");
				 Scanner scan = new Scanner(System.in);
			     int n = scan.nextInt();
			     int m = scan.nextInt();
			     
			     //to find diagonals
			     int diagonal1 = 0;
			     int diagonal2 = 0;

			     int[][] mat = new int[n][m];
			     
			     for(int i=0;i<n;i++)
			     {
			    	 for(int j=0;j<m;j++)
			    	 {
			    		 mat[i][j] = scan.nextInt();
			    	 }

			     }

			     for(int i =0;i<n;i++)
			     {
			    	 for(int j =0;j<m;j++)
			    	 {
			    		 if(j>i)
			    		 {
			    			 diagonal1 = diagonal2+mat[i][j];
			    		 }
			    		 else if(j<i)
			    		 {
			    			 diagonal2 = diagonal2+mat[i][j];
			    		 }
			    	 }
			     }
			       
			       System.out.println("Amount of chocolates sai and vel will get: ");
			       System.out.println(diagonal1+" "+diagonal2);
      
	}
}


