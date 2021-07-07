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

public class FindidController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
    @FXML
    private Button btnfindid;

    @FXML
    private Button btnlogin;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtemail;

    @FXML
    private Label lblerror;

    @FXML
    void findid(ActionEvent event) {
    	
    	String name = txtname.getText();
    	String email = txtemail.getText();
    	
       	// 1. DAO 객체 생성 
    	MemberDao memberDao = MemberDao.getMemberDao();
    	
    	// 2. 모든 회원을 가져오기 
    	ArrayList<Member> members = memberDao.allmember();
    	
    	for( Member temp : members ) {
    		if( temp.getName().equals(name) && temp.getEmail().equals(email) ) {
    			lblerror.setText("찾으신 아이디를 이메일로 전송했습니다");
    			String id = temp.getId();
    			
    			// 메일전송 메소드 호출 [ 받는사람이메일 , 타입 , 내용에 들어갈변수 ] 
    			temp.emailsend(email, 2, id);
    			return;
    		}
    	}
    	
    	lblerror.setText("동일한 정보의 회원 아이디가 없습니다");
 
    }

    @FXML
    void login(ActionEvent event) {

    }
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
