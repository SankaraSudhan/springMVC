package com.sudhan;
import java.util.*;

public class MinMax {
	public static void main(String[] args) {
		Integer[] arr = {43,22,87,54,96,12,55};
		
		int min = Collections.min(Arrays.asList(arr));
		int max = Collections.max(Arrays.asList(arr));
		
		System.out.println("Maximum number is: "+ max);
		System.out.println("Minimum number is: "+ min);
		
 }
}

