package Controller;


import java.net.URL;
import java.util.ResourceBundle;

import DAO.BoardDao;
import domain.Board;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class BoardviewController implements Initializable{
	
	private static Board board;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		board = BoardController.getinstance().getboard();
		
		txttitle.setText(board.getBtitle() );
		txtcontents.setText(board.getBcontents() );
		lblcount.setText("��ȸ�� : " + board.getBcount() );
		lblcount.setText("�ۼ��� : " + board.getBwriter() );
		lblcount.setText("�ۼ��� : " + board.getBdate() );
		
		// ���� �Խù��� �ۼ��� == �α��ε� ���̵� ������ ��� ��ư Ȱ��ȭ
		String id = LoginController.getintance().getid();
		
		if (board.getBwriter().equals( id )) {
			btndelete.setVisible(true); // setvisible : ��Ʈ�� ǥ�� ����
			btnupdate.setVisible(true);	
		} else {
			btndelete.setVisible(false);
			btnupdate.setVisible(false);
		}
		
		
	}
	
	 	@FXML
	    private Button btndelete;

	    @FXML
	    private Button btnboard;

	    @FXML
	    private TextField txttitle;

	    @FXML
	    private TextArea txtcontents;

	    @FXML
	    private Label lblcount;

	    @FXML
	    private Label lblbdate;

	    @FXML
	    private Label lblwrite;

	    @FXML
	    private Button btnupdate;

	    @FXML
	    void board(ActionEvent event) {
	    	MainController.getinstance().loadpage("board");
	    }

	    @FXML
	    void delete(ActionEvent event) {
	    	// ȸ��Ż�� ����
	    
	    	BoardDao boardDao = BoardDao.getBoardDao();
	    	int result = boardDao.delboard(board);
	    	if (result == 1 ) { // ���� ����
	    		MainController.getinstance().loadpage("board");
	    	}else {//����
	    		//�޼��� â ����
	    		Alert alert = new Alert( AlertType.INFORMATION);
	        	alert.setContentText(" [��������] �����ڿ��� ���� : 000-0000-00000 ");
	        	alert.setHeaderText("�Խù� ���� ����");
	        	alert.showAndWait();//Ȯ�ι�ư ������������ ��� ����
	        	MainController.getinstance().loadpage("board");
	    	}
	    }
	    
	    @FXML
	    void update(ActionEvent event) {

	    }
	

}
