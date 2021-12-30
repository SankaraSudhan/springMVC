
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public  class ProductsDao {

//		public void insert(Products obj) throws ClassNotFoundException, SQLException 
//		{
//			String insertQuery = "insert into products values(?,?,?,?,?,?)";
//			
//			Connection conn = ConnectionUtil.getDBconnect();
//			
//			PreparedStatement ps = conn.prepareStatement(insertQuery);
//			
//			ps.setInt(1, obj.getProduct_id());
//			ps.setString(2, obj.getProduct_name());
//			ps.setString(3,obj.getDiscription());
//			ps.setDouble(4, obj.getStandard_cost());
//			ps.setDouble(5,obj.getList_price());
//			ps.setInt(6,10);
//
//			int i =ps.executeUpdate();
//			
//			System.out.println(i + "row inserted");
//			
		//}
//public void update() throws ClassNotFoundException, SQLException {
//		
//		Connection con = ConnectionUtil.getDBconnect();
//		PreparedStatement stmt=con.prepareStatement("update Products set product_name = ? where product_id =?");  
//		stmt.setString(1,"bag");
//		stmt.setInt(2, 589 );
//		  
//		int i=stmt.executeUpdate();
//		System.out.println(i+" records inserted");
		

		
	
public void delete() throws ClassNotFoundException, SQLException {
		
		Connection con = ConnectionUtil.getDBconnect();
		PreparedStatement stmt=con.prepareStatement("delete from Products where product_id=?");  
		stmt.setInt(1,589);  
		  
		int i=stmt.executeUpdate();
		System.out.println(i+" records deleted");
		
	}


	}




