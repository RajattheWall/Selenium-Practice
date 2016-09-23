package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class ConnectMySQl {
	
	
	@Test
	
	public void testDB() throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		
	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/southwind","root","tiwari@2");
		
		System.out.println("Connected to MySQl DB");
		
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery("select * from products");
		
		
		while(rs.next()){
			
			String productID=rs.getString("productID");
			System.out.println("Database  record  is "+productID);
			
			
			String productCode=rs.getString("productCode");
			System.out.println("Database  record  is "+productCode);
			
			String name=rs.getString("name");
			System.out.println("Database  record  is "+name);
			
			
			String quantity=rs.getString("quantity");
			System.out.println("Database  record  is "+quantity);
			
			String price=rs.getString("price");
			System.out.println("Database  record  is "+price);
			
			
		}
		
		
		
		
	}
	}


