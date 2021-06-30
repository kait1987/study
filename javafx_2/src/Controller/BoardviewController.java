package Controller;


import java.net.URL;
import java.util.ResourceBundle;

import domain.Board;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BoardviewController implements Initializable{
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		Board board = BoardController.getinstance().getboard();
		
		txttitle.setText(board.getBtitle() );
		txtcontents.setText(board.getBcontents() );
		lblcount.setText("조회수 : " + board.getBcount() );
		lblcount.setText("작성자 : " + board.getBwriter() );
		lblcount.setText("작성일 : " + board.getBdate() );
		
		// 현재 게시물의 작성자 == 로그인된 아이디 동일한 경우 버튼 활성화
		String id = LoginController.getintance().getid();
		if (board.getBwriter().equals( id )) {
			btndelete.setVisible(true); // setvisible : 컨트롤 표시 여부
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

	    }

	    @FXML
	    void delete(ActionEvent event) {
	    	// 회원탈퇴 참고

	    }

	    @FXML
	    void update(ActionEvent event) {

	    }
	

}
