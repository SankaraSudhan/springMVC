package com.sudhan;
import java.math.*;
import java.util.Scanner;
class DistanceBetween{
	float distance(int x1, int x2, int y1, int y2, int R1, int R2) {
		
		//distance calculation
		float distance=(float) Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		return distance;
		
	}
		
}
public class BangleProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.out.println("Enter the values: ");
       Scanner sc = new Scanner(System.in);
       int x1 = sc.nextInt();
       int x2 = sc.nextInt();
       int y1 = sc.nextInt();
       int y2 = sc.nextInt();
       int R1 = sc.nextInt();
       int R2 = sc.nextInt();
       
       System.out.println(x1+" "+x2);
       System.out.println(y1+" "+y2);
       System.out.println(R1+" "+R2);
       
       int result = R1+R2;
       DistanceBetween obj = new DistanceBetween();
       float num =obj.distance(x1, x2, y1, y2, R1, R2);
       	
       if (num>result) {
    	   System.out.println("Intersects");
    	   System.out.format("%.2f",num);
       }else if(num<result) {
    	   System.out.println("Do not touch");
    	   System.out.format("%.2f",num);
       }else {
    	   System.out.println("Touches");
    	   System.out.format("%.2f",num);
       }
       
       
	}

}
