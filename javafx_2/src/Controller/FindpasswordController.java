package Controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import DAO.MemberDao;
import application.Start;
import domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FindpasswordController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}

    @FXML
    private Button btnfindpassword;

    @FXML
    private Button btnlogin;

    @FXML
    private TextField txtid;

    @FXML
    private TextField txtemail;

    @FXML
    private Label lblerror;

    @FXML
    void findpassword(ActionEvent event) {
    	
    	String id = txtid.getText();
    	String email = txtemail.getText();
    	
    	
       	// 1. DAO 객체 생성 
    	MemberDao memberDao = MemberDao.getMemberDao();
    	
    	// 2. 모든 회원을 가져오기 
    	ArrayList<Member> members = memberDao.allmember();
    	
    	for( Member temp : members  ) {
    		if( temp.getId().equals(id) && temp.getEmail().equals(email) ) {
    			lblerror.setText("찾으신 비밀번호를 이메일로 전송했습니다");
    			String password = temp.getPassword();
    			
    			// 메일전송 메소드 호출 [ 받는사람이메일 , 타입 , 내용에 들어갈변수 ] 
    			temp.emailsend(email, 3, password);
    			return;
    		}
    	}
    	
    	lblerror.setText("동일한 정보의 회원 정보가 없습니다");

    }

    @FXML
    void login(ActionEvent event) {

    }
	
	

}
