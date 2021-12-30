package com.sudhan;
import java.util.*;

public class ArrayInterChange {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int arr[]= new int[size];
		System.out.println("enter array elements");
		
		for(int i=0;i<arr.length;i++)
		{
		arr[i]= sc.nextInt();	
		}
		System.out.println(arr.length);
		interchangeArray(arr,size);

	}
	
	public static void interchangeArray(int ar[],int size)
	{
		int travel=size-1,temp=0;
		for(int i=0;i<ar.length/2;i++)
		{
			temp=ar[i];
			ar[i]=ar[travel];
			ar[travel]=temp;
			travel--;
			
		}
		
		for(int x:ar)
		{
		System.out.print(x+" ");	
		}
		
	}


	}


