package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class OrderDao {
	
	Connection connection; // sql 연결 인터페이스
	ResultSet resultSet; // sql 결과 순회 인터페이스
	
	public static OrderDao instance = new  OrderDao(); // 현재 클래스에 현재객체 선언; 
	public static OrderDao getinstance () {
			return instance;
	}
	public OrderDao() {
		try {
			// sql 드라이버 : sql 마다 다름
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspweb?serverTimezone=UTC", "root", "1234");
			
		} catch (Exception e) {}
	}

	// 1. 주문등록 메소드
	public boolean orderswrite() {
		
		return false;
	}
	
	// 2. 주문상세 등록 메소드
	
	public boolean orders_datailwrite() {
		
		return false;
	}
}
