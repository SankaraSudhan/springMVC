import java.util.*;

import java6.DataMembers;
public class mainmethod 
{
	 
	 public static void main(String[] args) 
	 {
		 System.out.println("Enter the marks of five subjects: ");
		 
		 Scanner sc = new Scanner(System.in);
	     int english = sc.nextInt();
	     int tamil = sc.nextInt();
	     int maths = sc.nextInt();
	     int science = sc.nextInt();
	     int social = sc.nextInt();
	     
	     DataMembers obj = new DataMembers();
	     obj.setEnglish(english);
	     obj.setTamil(tamil);
	     obj.setSocial(social);
	     obj.setScience(science);
	     obj.setMaths(maths);
	     int total =obj.sum();
	 
	 System.out.println("Total marks is: "+total);


		
	}
}
