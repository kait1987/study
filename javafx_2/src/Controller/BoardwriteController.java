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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;


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
	    private TextField btnwrite;

	    @FXML
	    private Text txtcontents;

	    @FXML
	    private Text txttitle;

	    @FXML
	    void cancel(ActionEvent event) {
	    	
	    	MainController.getinstance().loadpage("board");

	    }

	    @FXML
	    void write(ActionEvent event) {
	    	
	    	String btitle = txttitle.getText();
	    	String bcontents = txtcontents.getText();
	    	String bwriter = LoginController.getintance().getid();
	    		Date date = new Date();
	    		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
	    	String bdate = format.format(date);
	    	
	    	Board board = new Board(btitle, bcontents, bwriter, bdate, 0);
	    	
	    	BoardDao boardDao = BoardDao.getBoardDao();
	    	
	    	int result = boardDao.boardwrite(board);
	    	
	    	if (result == 1) {
	    		MainController.getinstance().loadpage("board");
	    		
	    	}
	    	else {
	    		Alert alert = new Alert( AlertType.INFORMATION);
	    		alert.setContentText(" [등록실패] 관지자에게 문의 : 000-000-0000 ");
	    		alert.setHeaderText("게시물등록 실패");
	    		alert.showAndWait(); // 확인 버튼 누르기전까지 대기상태 
	    		MainController.getinstance().loadpage("board");
	    	}
	    	
	    	
	    	
	    	

	    }

}
