package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ProductDao {
	
	Connection connection;
	ResultSet resultSet;
	
	public static ProductDao instance = new ProductDao();
	public static ProductDao getinstance() {
		return instance;
	}
	
	public ProductDao() {
		try {
			//
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspweb?serverTimezone=UTC", "root" , "1234" );
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	// 1.
	
	// 2.
	
	// 3.
	
	// 4.
	
	// 5.

}
