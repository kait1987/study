package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Dto.ProductDto;

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
	
	
	// 1. 제품등록
	public boolean productwrite (ProductDto productDto) {
		
		// 1. SQL 작성
		String SQL="insert into product(product_name , product_comment , product_price , product_manufacturer , product_category , product_stock , product_releasedate , product_img )" +"values(?,?,?,?,?,?,?,?)";
		// 2. SQL 조작
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setString(1, productDto.getProduct_name());
			preparedStatement.setString(2, productDto.getProduct_comment());
			preparedStatement.setInt(3, productDto.getProduct_price());
			preparedStatement.setString(4, productDto.getProduct_manufacturer());
			preparedStatement.setString(5, productDto.getProduct_category());
			preparedStatement.setInt(6, productDto.getProduct_stock());
			preparedStatement.setString(7, productDto.getProduct_releasedate());
			preparedStatement.setString(8, productDto.getProduct_img());
		// 3. SQL 실행
			preparedStatement.executeUpdate();
		// 4. SQL 결과
			
		// 5. SQL 반환
			return true;
		
		} catch (Exception e) { }
		return false;
		
		
	}	
	
	// 2. 제품 목록 조회
	
	// 3. 제품 개별 조회
	
	// 4. 제품 수정
	
	// 5. 제품 삭제
	
}
