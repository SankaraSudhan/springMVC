package com.sudhan;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayIndexChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inputs
		Scanner sc = new Scanner(System.in);
		int arr[]= {14,25,6,28,5};
		int pos[]= new int[arr.length];
		int finalArr[]=new int[arr.length];
		System.out.println("Enter the position to change: ");
		
		for(int i=0;i<pos.length;i++)
		{
			int input=sc.nextInt();
			if(input<arr.length)
			{
				pos[i]=input;
			}
			else
			System.out.println("invalid position");
		}
		
		System.out.println("Previous positions "+Arrays.toString(arr));
		System.out.println("Changed positions "+Arrays.toString(pos));
		
		for(int i=0;i<arr.length;i++)
		{
			int temp=pos[i];
			finalArr[temp]=arr[i];
		}
		
		System.out.println("After position changed"+Arrays.toString(finalArr));

	}

}


