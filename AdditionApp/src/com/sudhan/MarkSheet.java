package com.sudhan;

public class MarkSheet {
	public static void main(String[] args) {
		
		//input
		int mark = 66;
		
		//if-else ladder logic
		if(mark>=90 && mark<100) 
		{
			System.out.println("Grade A");
		}
		else if(mark>=80 && mark<90)
		{
			System.out.println("Grade B");
		}
		else if(mark>=70 && mark<80) 
		{
			System.out.println("Grade is C");
		}
		else if(mark>=60 && mark<70) 
		{
			System.out.println("Grade is D");
		}
		else if(mark>=50 && mark<60)
		{
			System.out.println("Grade is E");
		}
		else {
			System.out.println("Fail");
		}
	}

}
