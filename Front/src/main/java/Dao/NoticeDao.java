package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Dto.NoticeDto;

public class NoticeDao {
	
	Connection connection; // sql 연결 인터페이스
	ResultSet resultSet; // sql 결과 순회 인터페이스
	
	public static NoticeDao instance = new NoticeDao(); // 현재 클래스에 현재객체 선언; 
	public static NoticeDao getinstance () {
			return instance;
	}
	
	public NoticeDao() {
		try {
			// sql 드라이버 : sql 마다 다름
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspweb?serverTimezone=UTC", "root", "1234");
			
		} catch (Exception e) {}
	}
	
	// 게시물 작성
	public int noticewrite(NoticeDto noticeDto) {
		
		String SQL = "insert into notice (ntitle , ncontents , nwriter , ncount , nfile) value (? , ? , ? , ? , ? )";
		try {
			
			PreparedStatement statement = connection.prepareStatement(SQL);
			statement.setString(1, noticeDto.getNtitle() );
			statement.setString(2, noticeDto.getNcontents() );
			statement.setString(3, noticeDto.getNwriter() );
			statement.setInt(4, noticeDto.getNcount() );
			statement.setString(5, noticeDto.getNfile() );
			
			statement.executeUpdate();
			
			return 1;
			
		} catch (Exception e) {}
			return 0;
		
	}
	// 모든 게시물 출력
	public ArrayList<NoticeDto> noticelist(){
		
		ArrayList<NoticeDto> noticeDtos = new ArrayList<NoticeDto>();
		
		String SQL = "select * from notice order by nno DESC";
						// t
		try {
			PreparedStatement statement = connection.prepareStatement(SQL);
			
			resultSet = statement.executeQuery();
			
			while ( resultSet.next() ) {
				NoticeDto noticeDto = new NoticeDto(
						resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getString(3),
						resultSet.getString(4),
						resultSet.getString(5),
						resultSet.getInt(6),
						resultSet.getString(7));
				noticeDtos.add(noticeDto);
			}
			return noticeDtos;
			
		} catch (Exception e) {
			return null;
		}
	}

	// 검색이 있는 경우 게시물 출력
	public ArrayList<NoticeDto> noticekeyword( String key, String keyword){
		
		ArrayList<NoticeDto> noticeDtos = new ArrayList<NoticeDto>();
		
		//String SQL = "select * from notice where" "+key+" like '%"+keyword+"%'"
		// 키워드 포함된 필드 찾기
		
		
		String SQL = "select * from notice where "+key+" like '%"+keyword+"%' order by nno DESC";
													// 필드명 = 찾을값 [해당 필드에서 값이 동일한 레코드 찾기]
													// 필드명 like '%찾을값%'
		
		try {
			PreparedStatement preparstStatement = connection.prepareStatement(SQL);
			resultSet = preparstStatement.executeQuery();
			
			while (resultSet.next() ) {
				NoticeDto noticeDto = new NoticeDto(
						resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getString(3),
						resultSet.getString(4),
						resultSet.getString(5),
						resultSet.getInt(6),
						resultSet.getString(7) );
				noticeDtos.add(noticeDto);
			}
			return noticeDtos;
			
		} catch (Exception e) {	}
			return null;
		
	}
	// 게시물 개별 조회
	public NoticeDto getnotice( int nno) {
		
		String SQL = "select * from notice where nno + ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setInt(1, nno);
			
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next() ) {
				
				NoticeDto noticeDto = new NoticeDto(
						resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getString(3),
						resultSet.getString(4),
						resultSet.getString(5),
						resultSet.getInt(6),
						resultSet.getString(7) );
				return noticeDto;
						
			}
		} catch (Exception e) { }
		return null;
	}
	
	
	// 게시물 삭제 메소드
	public int noticedel( int nno) {
		
		String SQL = "delete from notice where nno =?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setInt(1, nno);
			
			preparedStatement.executeUpdate();
			
			return 1;
		} catch (Exception e) {	}
		return 0;
	}
}
