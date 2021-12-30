package com.sudhan;
import java.util.Scanner;
public class PrimeAdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// getting array input from the user.
		System.out.println("Enter array length");
		int length=sc.nextInt();
				
		if(length<0){
		   System.out.println("invalid input");
		   System.exit(0);
		}
				
		int[] input=new int[length];
				
		for(int i=0;i<input.length;i++){
		System.out.println("Enter the array index value of"+i);
		input[i]=sc.nextInt();					
		  if(input[i]<0) {
			System.out.println("invalid input");
			System.exit(0);
		   }
		}
		
		System.out.println("Sum of prime number: "+primesum(input,length));
	 }

		public static int primesum(int[] input,int length){
		 int sum=0;
		      for(int i=0;i<input.length;i++){
		    	  if( primenum(input[i])){
		    		 sum+=input[i];
		    	   }
		        }
				return sum;
			}

		 public static boolean primenum(int data){
			  for(int i=2;i<(data/2)+1;i++){
				  if(data % i==0){
					return false;
				   }		
			   }
				return true;
		}
		
	}


