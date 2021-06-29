package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import domain.Board;
import domain.Member;


public class BoardDao {
	
	
	Connection conn; // DB�� �������ִ� �������̽� ���� 
	private static BoardDao boardDao = new BoardDao(); // ���� Ŭ������ ��ü 
	
	public static BoardDao getBoardDao() {	// dao ��ü�� ��ȯ���ִ� �޼ҵ� 
		return boardDao;
	}
	
	public BoardDao() { // ������ : ��ü�� �ʱⰪ 
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
	
	
	// �۾��� �޼ҵ�
	public int boardwrite (Board board) {
		
		//1. SQL �ۼ�
		String SQL = "insert into board(btitle, bcontencts, bwriter,bdate,bcount)"+"values(?,?,?,?,?)";
		//2. SQL ����
		try {
			PreparedStatement statement = conn.prepareStatement(SQL); //SQL ���� ����ó��
			statement.setString(1, board.getBtitle() );
			statement.setString(2, board.getBcontents() );
			statement.setString(3, board.getBwriter() );
			statement.setString(4, board.getBdate() );
			statement.setInt(5, board.getBcount() );
			
			
		//3 SQl ����
			statement.executeUpdate();
		//4. SQL ���
			return 1; // ������
			
		} catch (Exception e) {} 
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
