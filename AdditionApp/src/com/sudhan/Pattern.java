package com.sudhan;
import java.util.*;

public class Pattern {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		
		int input=sc.nextInt();
	    
		for(int i=1;i<=input;i++)
	    {
	     for(int j=input;j>i;j--)
		{
		System.out.print(" ");	
		}		
		
	     for(int j=1;j<=i;j++)
		{
		System.out.print("*");	
		}
		System.out.println();
	    }
	  }
    public static void pattern1(int in){
	int total=0;
	for(int i=1;i<=in;i++)
	{
		for(int j=1;j<=i;j++)
		{
		System.out.print(j+" ");
		total+=j;
		}
		
		if(total>1) {
			System.out.print(total);
		}
		total=0;
		System.out.println();
	}
  }
 }
