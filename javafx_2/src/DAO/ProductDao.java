package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ProductDao {
	
	Connection conn; // DB�� �������ִ� �������̽� ���� 
	private static ProductDao productDao = new ProductDao(); // ���� Ŭ������ ��ü 
	
	public static ProductDao getProductDao() {	// dao ��ü�� ��ȯ���ִ� �޼ҵ� 
		return productDao;
	}
	
	 public ProductDao()  {
		// TODO Auto-generated constructor stub
	
		 // ������ : ��ü�� �ʱⰪ 
		// db ���� 
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Ŭ���� ã�� 
				// mysql ����̹� �̸� : com.mysql.cj.jdbc.Driver
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTime=UTC" , "root" , "1234");
														// DBURL // ip�ּ�:port��ȣ/DB�� ? �ð��� = UTC  , "������" , "��й�ȣ" 
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
