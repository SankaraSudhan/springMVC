import java.sql.*;
import java.util.Scanner;
public class TestConnection {
	
	public static void main(String[] args)throws ClassNotFoundException,SQLException {
//	    Scanner sc = new Scanner(System.in);
//		Connection conn = ConnectionUtil.getDBconnect();
//		System.out.println("Connected");
//	    System.out.println("Enter Details");
//	    String Details = sc.nextLine();
//	    Products obj = new  Products(Integer.parseInt(Details.split(",")[0]),
//	    		                                      Details.split(",")[1] ,
//	    		                                      Details.split(",")[2] , 
//	    		                   Double.parseDouble(Details.split(",")[3]),
//	    		                  Double.parseDouble(Details.split(",")[4]));
	
	    ProductsDao pDao = new ProductsDao();
	    pDao.delete();


}
}

