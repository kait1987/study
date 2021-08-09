package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Dto.BcommentDto;

public class BcommentDao {
	
	Connection connection;
	ResultSet resultSet;
	
	public static BcommentDao instance = new BcommentDao();
	public static BcommentDao getinstance() {
		return instance;
	}

	public BcommentDao() {
		try {
			// 1. SQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspweb?serverTimezone=UTC", "root" , "1234" );
		} catch (Exception e) {
		
		}
	}
	// 
	public int bcommentwrite( BcommentDto bcommentDto) {
		
		String sql = "insert into bcomment(nno , bccontents, bcwriter) values(?,?,?) ";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, bcommentDto.getNno());
			preparedStatement.setString(2, bcommentDto.getBccontents());
			preparedStatement.setString(3, bcommentDto.getBcwriter());
			
			preparedStatement.executeUpdate();
			return 1;
			
		} catch (Exception e) { }
		return 0;
	}
	
	// 
	public ArrayList<BcommentDto> bcommentlist( int nno){
		
		String sql = "select * from bcomment where nno =?";
		
		ArrayList<BcommentDto> bcommentDtos = new ArrayList<BcommentDto>();
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, nno);
			
			resultSet = preparedStatement.executeQuery();
			
			while( resultSet.next() ) {
				
				BcommentDto bcommentDto = new BcommentDto(
							resultSet.getInt(1),
							resultSet.getInt(2),
							resultSet.getString(3),
							resultSet.getString(4),
							resultSet.getString(5)	) ;
				bcommentDtos.add(bcommentDto);
			}
			return bcommentDtos;
			
		} catch (Exception e) { }
		return null;
		
	}
	
	//
	
	public int bcommentdelete (int bcno) {
		
		String sql = "select from bcomment where bcno = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, bcno);
			preparedStatement.executeUpdate();
			
			return 1;
		} catch (Exception e) { }
		return 0;
	}
}
