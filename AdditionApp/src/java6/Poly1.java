package java6;
/*create a java class with three member functions as same name as find() ,
 * with the different implementation ,find greatest among two int values,
 * among three int values,and greatest among four int values as a same named function and show the result in main function
 */

public class Poly1 
{
	public void find(int v1, int v2) {
		if(v1>v2) {
			System.out.println("v1 is greater");
		}else {
			System.out.println("v2 is greater");
		}
	
		
	}
    public void find(int v1, int v2, int v3) {
    	if(v1>v2 && v1>v3) {
			System.out.println("v1 is greater");
		}else if(v2>v1 && v2>v3) {
			System.out.println("v2 is greater");
		}else {
			System.out.println("v3 is greater");
		}
	
    	
    }
    public void find(int v1, int v2, int v3, int v4) {
    	if(v1>v2 && v1>v3 && v1>v4) {
			System.out.println("v1 is greater");
		}else if(v2>v1 && v2>v3 && v2>v4) {
			System.out.println("v2 is greater");
		}else if(v3>v1 && v3>v2 && v3>v4) {
			System.out.println("v3 is greater");
    }else {
    	System.out.println("v4 is greater");
    }
    }


    public static void main(String[] args) 
    {
		Poly1 obj = new Poly1();
		obj.find(657, 65656);
		obj.find(4554, 5545, 93700);
		obj.find(243, 34343, 23, 12);
		
	}
    
}


