package com.sudhan;
import java.util.*;

public class StudentCollage {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of subjects");
		int subjects = sc.nextInt();

		int marks[]= new int[subjects];

		System.out.println("");
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("enter "+(i+1)+ " marks");
			int input=sc.nextInt();
			if(input<0)
			{
				System.out.println("invalid input");
			}
		
		marks[i]=input;
		
		}
		
		int grade=calculateGrade(marks,subjects);
		
		if(grade<1)
		{
			System.out.println("invalid input");
		}
		else if(grade==1)
		{
		System.out.println("First Grade University");
		}
		else if(grade==2)
		{
		System.out.println("Second Grade University");	
		}
		else
		{
		System.out.println("Third Grade University");	
		}
		
	}
	
	//creating method to calculate grade
	
	public static int calculateGrade(int arr[],int length)
	{
		int total=0;
		for(int i:arr)
		{
			total+=i;
		}
		int average=total/length;
		
		
		if(average>99)
		{
			return -1;
		}
		else if(average>80)
		{
		return 1;	
		}
		else if(average>60 && average <=80)
		{
		return 2;	
		}
		else 
		{
		return 3;	
		}
		
	}
	
}


