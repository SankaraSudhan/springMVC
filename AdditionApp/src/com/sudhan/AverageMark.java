package com.sudhan;

public class AverageMark {
	public static void main(String[] args) {
		int [] mark = new int[3];
				mark[0]=87;
		        mark[1]=76;
		        mark[2]=55;
		        
		       int totalMark = 0;
		       for(int m:mark) {
		    	   totalMark=totalMark+m;
		       }
		       
		       int numberOfSubjects = mark.length;
		       
		       int avg1 = totalMark / numberOfSubjects;
		       float avg2 = (float)totalMark / numberOfSubjects;
		       
		       System.out.println("Number of subjects = "+mark.length);
		       System.out.println("Average of marks = "+avg1);
		       System.out.println("Float Average of marks= "+avg2);
	}

}
