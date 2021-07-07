package Controller;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import DAO.BoardDao;
import domain.Board;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert.AlertType;


public class BoardwriteController implements Initializable{
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
		@FXML
	    private Button btnwirte;

	    @FXML
	    private Button btncancel;

	    @FXML
	    private TextField txttitle;

	    @FXML
	    private TextArea txtcontents; 

	    @FXML
	    void cancel(ActionEvent event) {
	    	
	    	MainController.getinstance().loadpage("board");

	    }

	    @FXML
	    void write(ActionEvent event) {
	    	
	    	String btitle = txttitle.getText();
	    	String bcontents = txtcontents.getText();
	    	String bwriter = LoginController.getintance().getid(); // �α��ε� ���̵�
	    		Date date = new Date();
	    		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
	    	String bdate = format.format(date);
	    	
	    	Board board = new Board(btitle, bcontents, bwriter, bdate, 0);
	    	
	    	// Dao ��ü ����
	    	BoardDao boardDao = BoardDao.getBoardDao();
	    	// Dao �޼ҵ� ����
	    	int result = boardDao.boardwrite(board);
	    	
	    	if (result == 1) { // ����
	    		// ���� ��ư�� ������ �� => ȭ�� ��ȯ
	    		MainController.getinstance().loadpage("board");
	    		
	    	}
	    	else {
	    		Alert alert = new Alert( AlertType.INFORMATION);
	    		alert.setContentText(" [��Ͻ���] �����ڿ��� ���� : 000-000-0000 ");
	    		alert.setHeaderText("�Խù���� ����");
	    		alert.showAndWait(); // Ȯ�� ��ư ������������ ������ 
	    		MainController.getinstance().loadpage("board");
	    	}
	    	
	    	
	    	
	    	
	    	
	    	
	    }

	    

}


