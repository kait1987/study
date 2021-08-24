package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Dto.Orders;
import Dto.Orders_detail;

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
	public boolean orderswrite(Orders orders) {
		
		String SQL = "insert into notice (orders_no , orders_uno , orders_name , orders_address , orders_phone , orders_comment , orders_fee , orders_date , orders_state ) value(? , ? , ? , ? , ? , ? , ? , ? , ? )";
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setInt(1, orders.getOrders_uno() );
			preparedStatement.setString(2, orders.getOrders_name());
			preparedStatement.setString(3, orders.getOrders_address());
			preparedStatement.setString(4, orders.getOrders_phone());
			preparedStatement.setString(5, orders.getOrders_comment());
			preparedStatement.setInt(6, orders.getOrders_fee());
			preparedStatement.setInt(7, orders.getOrders_state());
			
			preparedStatement.executeUpdate();
			
			return true; //
			
		} catch (Exception e) {	}
		return false;
	}
	
	// 2. 주문상세 등록 메소드
	
	public boolean orders_datailwrite( Orders_detail orders_detail) {
		
		String sql = "insert into orders_detail(orders_no ,orders_product_code,orders_amount,orders_detail_state) values(?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, orders_detail.getOrders_no() );
			preparedStatement.setInt(2, orders_detail.getOrders_product_code() );
			preparedStatement.setInt(3, orders_detail.getOrders_amount() );
			preparedStatement.setInt(4, orders_detail.getOrders_detail_state() );
			
			preparedStatement.executeUpdate();
			return true;
			
		} catch (Exception e) { }
		
				
		return false;
	}
	// 3. 
	public int getorders_no( ) {
		
		String SQL = "select max(orders_no) from orders";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next() ) {
				return resultSet.getInt(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return -1;
	}
}
