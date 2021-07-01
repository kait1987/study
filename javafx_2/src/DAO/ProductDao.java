package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ProductDao {
	
	Connection conn; // DB와 연결해주는 인터페이스 선언 
	private static ProductDao productDao = new ProductDao(); // 현재 클래스의 객체 
	
	public static ProductDao getProductDao() {	// dao 객체를 반환해주는 메소드 
		return productDao;
	}
	
	 public ProductDao()  {
		// TODO Auto-generated constructor stub
	
		 // 생성자 : 객체의 초기값 
		// db 연동 
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 클래스 찾기 
				// mysql 드라이버 이름 : com.mysql.cj.jdbc.Driver
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTime=UTC" , "root" , "1234");
														// DBURL // ip주소:port번호/DB명 ? 시간대 = UTC  , "계정명" , "비밀번호" 
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
