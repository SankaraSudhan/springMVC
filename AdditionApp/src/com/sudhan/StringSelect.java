package com.sudhan;
import java.util.*;

public class StringSelect {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the text:");
			String text = sc.nextLine();
			System.out.println("Enter the Indexes no of 5:");
			int[] arrIndexes=new int[5];
			
			for(int i=0;i<arrIndexes.length;i++)
			{
				arrIndexes[i]=sc.nextInt();
			}
			for(int i=0;i<arrIndexes.length;i++)
			{
				String first=text.substring(0,arrIndexes[i]);
				String last=text.substring(arrIndexes[i]+1,text.length());
				
				char character=text.toUpperCase().charAt(arrIndexes[i]);
				text=first+character+last;
			}
			System.out.println(text);
		}

	}


