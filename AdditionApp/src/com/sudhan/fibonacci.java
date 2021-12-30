package com.sudhan;

public class fibonacci {
      public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3,i;
		int cout=10;
		System.out.println(n1+" " +n2);
		
		for(i=2;i<cout;i++)
		{
			n3= n1+n2;
			System.out.println("  "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
