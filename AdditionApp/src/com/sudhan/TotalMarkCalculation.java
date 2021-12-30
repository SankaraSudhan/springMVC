package com.sudhan;
public class TotalMarkCalculation {
public static void main(String[] args) {
	
	//array inputs
	int [] marks = new int[5];
	
	//assign marks in array
	marks[0]=15;
	marks[1]=25;
	marks[2]=35;
	marks[3]=45;
	marks[4]=55;
	
	//business logic for-each loop
	int totalMark=0;
	for(int m:marks) {
		totalMark = totalMark+m;
	}
	System.out.println("total mark is: "+totalMark);
	
	
}
}
