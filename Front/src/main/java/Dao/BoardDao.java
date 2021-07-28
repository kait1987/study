package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Dto.Board;

public class BoardDao {
	
	private Connection conn;
	private ResultSet resultSet;
	
	public static BoardDao instance = new BoardDao() ;
	
	public static BoardDao getinstance () {
		return instance;
	}
	public BoardDao() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306//jspweb?serverTimezone=UTC", "root", "1234");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 1. 글쓰기 메소드
	public int bwrite( Board board ) {
		
		// 1. SQL => 조작 => 실행 => 결과
		String SQL = "insert into board( btitle, bcontents , bwriter, bdate , bcount)" + "values(?,?,?,?,?)";
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setString(1, board.getBtitle() );
			statement.setString(2, board.getBcontents() );
			statement.setString(3, board.getBwriter() );
			statement.setString(4, board.getBdate() );
			statement.setInt(5, board.getBcount() );
			
			statement.executeUpdate();
		
		return 1;
		} catch (Exception e) {}
			return 0;
	}
	
	// 2. 모든 게시물 출력 메소드
	public ArrayList<Board> blist(){
		
		ArrayList<Board> boards = new ArrayList<Board>();
		
		String SQL = "select * from board"; // ���Ǿ��� ��� �˻� 
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			resultSet = statement.executeQuery();
			
			while( resultSet.next() ) {
				
				Board board = new Board(resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getString(3),
						resultSet.getString(4),
						resultSet.getString(5),
						resultSet.getInt(6));
				
				boards.add(board);
			}	
			return boards;
		}catch (Exception e) {}
		
		return null;
	}
		
		
			
		
	
}
