package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import domain.Product;

public class ProductDao {
	
	Connection conn; // DB�� �������ִ� �������̽� ���� 
	private static ProductDao productDao = new ProductDao(); // ���� Ŭ������ ��ü 
	
	public static ProductDao getProductDao() {	// dao ��ü�� ��ȯ���ִ� �޼ҵ� 
		return productDao;
	}
	
	 public ProductDao()  {	 // ������ : ��ü�� �ʱⰪ 
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
	 
	 // ��ǰ ��� �޼ҵ�
	 
	 public int addproduct( Product product) {
		 
		 try {
			 
			 String SQL = "insert into product(pname,pcontents,pprice,pstock,pcategory,pactivation,pquantity,pimage)"+"values(?,?,?,?,?,?,?,?)";
			 
			 PreparedStatement statement = conn.prepareStatement(SQL);
			 statement.setString(1, product.getPname() );
			 statement.setString(2, product.getPcontents() );
			 statement.setInt(3, product.getPprice() );
			 statement.setInt(4, product.getPstock() );
			 statement.setString(5, product.getPcategory() );
			 statement.setInt(6, product.getPactivation() );
			 statement.setInt(7, product.getPquantity() );
			 statement.setString(8, product.getPimage() );
			 statement.executeUpdate();
			 
			 return 1;
					 
			 
			 
			 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		 return 0;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
