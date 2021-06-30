package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import domain.Board;
import domain.Member;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class BoardDao {
	
	
	Connection conn; // DB와 연결해주는 인터페이스 선언 
	private static BoardDao boardDao = new BoardDao(); // 현재 클래스의 객체 
	
	public static BoardDao getBoardDao() {	// dao 객체를 반환해주는 메소드 
		return boardDao;
	}
	
	public BoardDao() { // 생성자 : 객체의 초기값 
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
	
	
	// 글쓰기 메소드
	public int boardwrite (Board board) {
		
		//1. SQL 작성
		String SQL = "insert into board(btitle, bcontents, bwriter,bdate,bcount)"+"values(?,?,?,?,?)";
		//2. SQL 조작
		try {
			PreparedStatement statement = conn.prepareStatement(SQL); //SQL 오류 예외처리
			statement.setString(1, board.getBtitle() );
			statement.setString(2, board.getBcontents() );
			statement.setString(3, board.getBwriter() );
			statement.setString(4, board.getBdate() );
			statement.setInt(5, board.getBcount() );
			
			
		//3 SQl 실행
			statement.executeUpdate();
		//4. SQL 결과
			return 1; // 성공시
			
		} catch (Exception e) {} 
		return 0;
	}
	//모든 게시물 출력 메소드
	
	public ObservableList<Board> allboard() {
			
			ObservableList<Board> boards = FXCollections.observableArrayList();
			
			String SQL = "select * from board";
			
			try {
				PreparedStatement statement = conn.prepareStatement(SQL);
				
				ResultSet resultSet = statement.executeQuery();
				
				while (resultSet.next() ) {
				
					Board board = new Board();
					board.setBno(resultSet.getInt(1) );
					board.setBtitle(resultSet.getString(2) );
					board.setBcontents(resultSet.getString(3) );
					board.setBwriter(resultSet.getString(4) );
					board.setBdate(resultSet.getString(5) );
					board.setBcount(resultSet.getInt(6));
				boards.add(board);
				}
				return boards;
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			return null;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
