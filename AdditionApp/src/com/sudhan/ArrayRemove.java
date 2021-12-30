package com.sudhan;
import java.util.*;
public class ArrayRemove {
	public static void main(String[] args) {
		        //input
				Scanner sc= new Scanner(System.in);
				System.out.println("enter array size");
				int input=sc.nextInt();
				int arr[]=new int[input];
				
				for(int i=0;i<arr.length;i++)
				{
					arr[i]=sc.nextInt();
					
				}
				for(int x:arr)
				{
				System.out.print(x+" ");	
				}
				
				System.out.println("enter the number to delete from the array");
				int del=sc.nextInt();
				sortAndDelete(arr,input,del);
			}
			public static void sortAndDelete(int arr[],int input,int del)
			{
				boolean boo=false;
				for(int i=0;i<arr.length-1;i++)
				{
					if(arr[i]==del)
					{
						boo=true;
					}
					if(boo) {
						arr[i]=arr[i+1];
					}
					
				}
				
	
				for(int x:arr)
				{
				System.out.print(x+" ");	
				}
				
			}

		}
	


