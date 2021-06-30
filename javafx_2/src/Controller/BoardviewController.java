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
	    	MainController.getinstance().loadpage("board");
	    }

	    @FXML
	    void delete(ActionEvent event) {
	    	// 회원탈퇴 참고
	    
	    	BoardDao boardDao = BoardDao.getBoardDao();
	    	int result = boardDao.delboard(board);
	    	if (result == 1 ) { // 삭제 성공
	    		MainController.getinstance().loadpage("board");
	    	}else {//실패
	    		//메세지 창 띄우기
	    		Alert alert = new Alert( AlertType.INFORMATION);
	        	alert.setContentText(" [삭제실패] 관리자에게 문의 : 000-0000-00000 ");
	        	alert.setHeaderText("게시물 삭제 실패");
	        	alert.showAndWait();//확인버튼 누르기전까지 대기 상태
	        	MainController.getinstance().loadpage("board");
	    	}
	    }
	    
	    @FXML
	    void update(ActionEvent event) {

	    }
	

}
