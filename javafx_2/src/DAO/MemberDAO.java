package DAO;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
	
	
	Connection conn; // DB�� �������ִ� �������̽� ����
	private static MemberDAO memberDAO = new MemberDAO();
	
	private static MemberDAO getMemberDAO() {
		return memberDAO;
	}
	
	
	
	public MemberDAO() {
		// TODO Auto-generated constructor stub
		
		try {
			Class.forName("com.mysql.cj.jdc.Driver")
			// Ŭ���� ã��
				// mySQL ����̹� �̸� : 
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?severTime=UTC", "root", "1234"l);
			
			System.out.println("����");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			}
	
	
	
	
	}
	
	
	//ȸ������ apthem
	public int setmember( Member temp) {
		
		// SQL ���ǹ�
		String SQL = "insert into member(id,password,name,email)"+"values(?,?,?,?)";
			// ���̺� ������ �߰�
			// 1. ��� �ʵ忡 �� ������� => �ʵ�� ����
				// insert into ���̺�� values(��1, ��2, ��3, ��4)
			// 2. Ư�� �ʵ忡�� ���� �������	=> �õ�� �ֱ�
				// insert into ���̺��(�ʵ��1, �ʵ��2, �ʵ��3, �ʵ��4) values(��1, ��2, ��3, ��4)
				// ? : �Ű�����
		// SQL DB�� ������
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			// PreparedStatement : ����� DB���� �ϴ� �������̽�
				// �ŰԺ����� ������ �ֱ�
				// setString( ?���� , ������)
					pstmt.setString(1, temp.getId() );
					pstmt.setString(2, temp.getpPassword() );
					pstmt.setString(3, temp.getName() );
					pstmt.setShort(4, temp.getEmail() );
	
					//SQL ����
					pstmt.executeUpdate();
					// ȸ������ ������ 1 ��ȯ	
					return 1;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		//ȸ������ ���н� 0 ��ȯ
		return 0;
		
				
		}
		
}

 
