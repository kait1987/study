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
		String SQL = "insert into board(btitle, bcontents, bwriter,bdate,bcount)"+"values(?,?,?,?,?)";
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
	//��� �Խù� ��� �޼ҵ�
	
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
	
		// ��ȸ�� ����
		public void addcount (Board board ) {
			
			String SQL = "update board set bcount = ? where bno =? ";
			try {
				PreparedStatement statement = conn.prepareStatement(SQL);
				statement.setInt(1, board.getBcount() );
				statement.setInt(2, board.getBno() );
						
				statement.executeUpdate();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	
	// �Խù� ���� �޼ҵ�
	public int delboard( Board board ) {
		
		String SQL ="delete from board where bno = ?";
		//delete from ���̺� �� where ����
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setInt(1, board.getBno() );
			statement.executeUpdate() ;
			return 1; // ����
		} 
		catch (Exception e) {
			// TODO: handle exception
		} 
		return 0; // ����
	}
	
	//�Խù� ���� �޼ҵ�
	public int updateboard (Board board, String title, String contents) { 
							// �μ� : �����Խù� , ���� �Էµ� Ÿ��Ʋ�� ����
		// 1. SQL �ۼ�
		String SQL = "update board set btitle = ? , bcontents =? where bno =? ";
		
		// 2. SQL ����
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			
			statement.setString(1, title);
			statement.setString(2, contents);
			statement.setInt(3, board.getBno() );
		 
		// 3. SQL ���
			statement.executeUpdate();
		
		// 4. SQL ����
		return 1;
		
		}catch (Exception e) {
			// TODO: handle exception
		} return 0;
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}