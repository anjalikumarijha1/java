package Day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Db {
	
	public static void main(String[] args) throws Exception {
		
		Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;servername=DELL-PC\\SQLEXPRESS;databaseName=selenium;IntegratedSecurity=true");
		
		if(con!=null){
			System.out.println("connection established");
		}else{
			System.out.println("connection not established");
		}
		
		
		ResultSet rs = con.createStatement().executeQuery("select * from employee");
		
		while(rs.next()){
			
			System.out.println(rs.getString(1));
			System.out.println(rs.getString("ID"));
			System.out.println(rs.getString("Name"));
			System.out.println(rs.getString("Place"));
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	

}
